package com.gesti.institucionesgesti.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "instituciones")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema institucionesSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("InstitucionPort"); // Cambia el nombre del puerto según sea necesario
        definition.setLocationUri("/ws");
        definition.setTargetNamespace("http://example.com/soap"); // Cambia el namespace según tu necesidad
        definition.setSchema(institucionesSchema);
        return definition;
    }

    @Bean
    public XsdSchema institucionesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("instituciones.xsd")); // Asegúrate de tener el archivo XSD en la ruta correcta
    }
}
