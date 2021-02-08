package io.springboot.regservices.ems.exception;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Table(value = RegExceptionEntity.TABLENAME)
public class RegExceptionEntity {

    public static final String TABLENAME = "exceptions";
    public static final String COLUMN_RUNDATE = "rundate";
    public static final String COLUMN_ERRORCODE = "errorcode";
    public static final String COLUMN_TIMESTAMP = "timestamp";
    public static final String COLUMN_EVENTTYPE = "eventtype";
    public static final String COLUMN_FIRMROEID = "firmroeId";
    public static final String COLUMN_TXNKEY = "txnkey";
    public static final String COLUMN_QUANTITY = "quantity";
    public static final String COLUMN_PRICE = "price";
    
    @PrimaryKey
    @Column(COLUMN_RUNDATE)
    @CassandraType(type = Name.TEXT)
    private String runDate;

    @PrimaryKey
    @Column(COLUMN_ERRORCODE)
    @CassandraType(type = Name.TEXT)
    private String errorCode;

    @Column(COLUMN_TIMESTAMP)
    @CassandraType(type = Name.TEXT)
    private String timeStamp;

    @Column(COLUMN_EVENTTYPE)
    @CassandraType(type = Name.TEXT)
    private String eventType;

    @Column(COLUMN_FIRMROEID)
    @CassandraType(type = Name.TEXT)
    private String firmRoeId;

    @Column(COLUMN_TXNKEY)
    @CassandraType(type = Name.TEXT)
    private String txnKey;

    @Column(COLUMN_QUANTITY)
    @CassandraType(type = Name.TEXT)
    private String quantity;

    @Column(COLUMN_PRICE)
    @CassandraType(type = Name.TEXT)
    private String price;

    
    public RegExceptionEntity(String runDate, String errorCode, String timeStamp, String eventType, String firmRoeId,
     String txnKey, String quantity, String price){
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


