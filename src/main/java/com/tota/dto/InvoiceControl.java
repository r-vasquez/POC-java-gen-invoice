package com.tota.dto;

import java.math.BigInteger;

public class InvoiceControl {
    private BigInteger invoiceAuthorization;
    private AuthorizationPeriod authorizationPeriod;
    private AuthorizedInvoices authorizedInvoices;

    public InvoiceControl (){
    }

    public InvoiceControl(BigInteger invoiceAuthorization, AuthorizationPeriod authorizationPeriod, AuthorizedInvoices authorizedInvoices) {
        this.invoiceAuthorization = invoiceAuthorization;
        this.authorizationPeriod = authorizationPeriod;
        this.authorizedInvoices = authorizedInvoices;
    }

    public BigInteger getInvoiceAuthorization() {
        return invoiceAuthorization;
    }

    public void setInvoiceAuthorization(BigInteger invoiceAuthorization) {
        this.invoiceAuthorization = invoiceAuthorization;
    }

    public AuthorizationPeriod getAuthorizationPeriod() {
        return authorizationPeriod;
    }

    public void setAuthorizationPeriod(AuthorizationPeriod authorizationPeriod) {
        this.authorizationPeriod = authorizationPeriod;
    }

    public AuthorizedInvoices getAuthorizedInvoices() {
        return authorizedInvoices;
    }

    public void setAuthorizedInvoices(AuthorizedInvoices authorizedInvoices) {
        this.authorizedInvoices = authorizedInvoices;
    }
}
