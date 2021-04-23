package com.tota.dto;

public class AuthorizationPeriod {
     private String startDate;
     private String endDate;

     public AuthorizationPeriod() {
     }

     public AuthorizationPeriod(String startDate, String endDate) {
          this.startDate = startDate;
          this.endDate = endDate;
     }

     public String getEndDate() {
          return endDate;
     }

     public void setEndDate(String endDate) {
          this.endDate = endDate;
     }

     public String getStartDate() {
          return startDate;
     }

     public void setStartDate(String startDate) {
          this.startDate = startDate;
     }
}
