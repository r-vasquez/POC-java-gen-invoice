package com.tota.dto;

public class AuthorizedInvoices {
    private String prefix;
    private String from;
    private String to;

    public AuthorizedInvoices() {
    }

    public AuthorizedInvoices(String prefix, String from, String to) {
        this.prefix = prefix;
        this.from = from;
        this.to = to;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
