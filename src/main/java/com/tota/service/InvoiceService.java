package com.tota.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.tota.dto.InvoiceControl;

import java.io.File;
import java.io.IOException;

public class InvoiceService {

    public void generateDianInvoice(String pathToInFile, String outputFile) throws IOException {
        // Read the JSON Input
        ObjectMapper jsonMapper = new ObjectMapper();
        InvoiceControl invoiceControl = jsonMapper.readValue(new File(pathToInFile), InvoiceControl.class);

        // Create the XML output
        XmlMapper xmlMapper = new XmlMapper();
        if (outputFile == null) {
            System.out.println("Result will be printed to console");
            System.out.println(xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(invoiceControl));
            return;
        }
        xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile),invoiceControl);
        System.out.println("XML saved in " + outputFile);
    }
}
