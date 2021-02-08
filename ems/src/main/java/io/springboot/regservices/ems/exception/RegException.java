package io.springboot.regservices.ems.exception;

import lombok.Data;

@Data
public class RegException {
    
    private String runDate;
    private String errorCode;
    private String timeStamp;
    private String eventType;
    private String firmRoeId;
    private String txnKey;
    private String quantity;
    private String price;
    
    
    public RegException(){
    }
    
    public RegException(String runDate, String errorCode, String timeStamp, String eventType, String txnKey, String firmRoeId,
     String quantity, String price) {
        this.runDate = runDate;
        this.errorCode = errorCode;
        this.timeStamp = timeStamp;
        this.eventType = eventType;
        this.txnKey = txnKey;
        this.firmRoeId = firmRoeId;
        this.quantity = quantity;
        this.price = price;

    }


}