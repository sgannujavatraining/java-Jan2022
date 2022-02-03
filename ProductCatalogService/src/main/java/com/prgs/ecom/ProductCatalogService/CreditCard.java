package com.prgs.ecom.ProductCatalogService;

public class CreditCard {
  private String number;
  private int ccv;
  private String expiry;
  private int zip;

  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
  public int getCcv() {
    return ccv;
  }
  public void setCcv(int ccv) {
    this.ccv = ccv;
  }
  public String getExpiry() {
    return expiry;
  }
  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }
  public int getZip() {
    return zip;
  }
  public void setZip(int zip) {
    this.zip = zip;
  }

  
}
