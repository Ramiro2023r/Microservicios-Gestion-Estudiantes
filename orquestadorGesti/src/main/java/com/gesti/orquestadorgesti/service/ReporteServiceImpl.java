package com.gesti.orquestadorgesti.service;


import com.gesti.orquestadorgesti.dtos.EstudianteBusquedaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import org.thymeleaf.context.Context;

import java.io.ByteArrayOutputStream;
import java.util.Base64;

@Service
@RequiredArgsConstructor
public class ReporteServiceImpl implements ReporteService{

    private final BusquedaService  busquedaService;
    private final TemplateEngine templateEngine;

    @Override
    public String obtenerReportePorEstudianteId(long id) {

        Context contex = new Context();
        contex.setVariable("estudianteDatos", busquedaService.busquedaEstudiantePorID(id));

        String reporte=  templateEngine.process("reporteEstudiante", contex);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ConverterProperties   converterProperties = new ConverterProperties();
        HtmlConverter.convertToPdf(reporte, outputStream, converterProperties);

        byte[] bytes = outputStream.toByteArray();
        return Base64.getEncoder().encodeToString(bytes);
    }



}
