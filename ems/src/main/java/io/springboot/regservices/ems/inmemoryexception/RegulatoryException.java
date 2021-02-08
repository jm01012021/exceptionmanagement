package io.springboot.regservices.ems.inmemoryexception;


public class RegulatoryException {
    
    private String runDate;
    private String errorCode;
    private String timeStamp;
    private String eventType;
    private String firmRoeId;
    private String txnKey;
    private String quantity;
    private String price;

    public RegulatoryException(){

    }
    
    public RegulatoryException(String runDate, String errorCode, String timeStamp, String eventType, String firmRoeId,
     String txnKey, String quantity, String price) {
        this.runDate = runDate;
        this.errorCode = errorCode;
        this.timeStamp = timeStamp;
        this.eventType = eventType;
        this.firmRoeId = firmRoeId;
        this.txnKey = txnKey;
        this.quantity = quantity;
        this.price = price;

    }

    public String getRunDate() {
        return runDate;
    }

    public void setRunDate(String runDate) {
        this.runDate = runDate;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getFirmRoeId() {
        return firmRoeId;
    }

    public void setFirmRoeId(String firmRoeId) {
        this.firmRoeId = firmRoeId;
    }

    public String getTxnKey() {
        return txnKey;
    }

    public void setTxnKey(String txnKey) {
        this.txnKey = txnKey;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

   
    

}