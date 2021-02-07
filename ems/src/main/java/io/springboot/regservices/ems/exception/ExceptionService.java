package io.springboot.regservices.ems.exception;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
    
    private List<Exception> exceptions = Arrays.asList(
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),        
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),         
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1")
            );
    
            public List<Exception> getAllExceptions(){
                return exceptions;
            }


}