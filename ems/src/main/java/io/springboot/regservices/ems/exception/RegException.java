package io.springboot.regservices.ems.exception;

import java.sql.Timestamp;
import java.util.Date;

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
    
    public RegException(String runDate, String errorCode, String timeStamp, String eventType, String firmRoeId,
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


}