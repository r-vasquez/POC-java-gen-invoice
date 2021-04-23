package com.tota.cli;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tota.service.InvoiceService;
import picocli.CommandLine;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

import java.io.IOException;

@Command(name = "Tota",
        description = "Parse JSON file to an Electronic Invoice XML following DIAN's standard",
        version = "Tota version 0.1",
        footer = "See more : https://github.com/onomilabs/tota"
)
public class InvoiceCli implements Runnable {
    @Option(names = {"-i", "--invoice"}, description = "Input file path, should have file format at the end. (path/invoice.json)", required = true)
    private String inputInvoice;

    @Option(names = {"-o", "--output"}, description = "Output file (path) + name (default: print to console)")
    private String outputFile;

    @Option(names = { "-h", "--help"}, usageHelp=true, description = "Print usage help and exit")
    private boolean help;

    @Override
    public void run() {
        if (help) {
            CommandLine.usage(this, System.out);
            return;
        }

        InvoiceService invoiceService = new InvoiceService();
        try {
            invoiceService.generateDianInvoice(inputInvoice, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
