package io.springboot.regservices.ems.exception;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
    
    private List<RegulatoryException> exceptions = Arrays.asList(
            new RegulatoryException("01032021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01042021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),        
            new RegulatoryException("01052021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01062021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),         
            new RegulatoryException("01072021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1")
            );
    
            public List<RegulatoryException> getAllExceptions(){
                return exceptions;
            }

             public List<RegulatoryException> getException(String date){
                return exceptions;
            }


}