package io.springboot.regservices.ems.exception;

import java.sql.Timestamp;
import java.text.DateFormat;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(value = RegExceptionEntity.TABLENAME)
public class RegExceptionEntity {

    public static final String TABLENAME = "regexception";
    public static final String COLUMN_RUNDATE = "rundate";
    public static final String COLUMN_ERRORCODE = "errorcode";
    public static final String COLUMN_TIMESTAMP = "timestamp";
    public static final String COLUMN_EVENTTYPE = "eventtype";
    public static final String COLUMN_FIRMROEID = "firmroeid";
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
    private String errorcode = 0;

    @Column(COLUMN_TIMESTAMP)
    @CassandraType(type = Name.TEXT)
    private String timestamp;

    @Column(COLUMN_EVENTTYPE)
    @CassandraType(type = Name.TEXT)
    private String eventtype;

    @Column(COLUMN_FIRMROEID)
    @CassandraType(type = Name.TEXT)
    private String firmroeid;

    @Column(COLUMN_TXNKEY)
    @CassandraType(type = Name.TEXT)
    private String txnkey;

    @Column(COLUMN_QUANTITY)
    @CassandraType(type = Name.TEXT)
    private String quantity;

    @Column(COLUMN_PRICE)
    @CassandraType(type = Name.TEXT)
    private String price;

    
    public RegExceptionEntity(String runDate, int errorCode, Timestamp timeStamp, String eventType, String firmRoeId,
     String txnKey, String quantity, String price){
        this(runDate, errorCode, timeStamp, eventType, firmRoeId, txnKey, quantity, price);


    
    }
 

    
}


