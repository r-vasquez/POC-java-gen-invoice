package com.tota;

import com.tota.cli.InvoiceCli;
import picocli.CommandLine;

public class InvoiceApplication {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new InvoiceCli()).execute(args);
        System.exit(exitCode);
    }
}
