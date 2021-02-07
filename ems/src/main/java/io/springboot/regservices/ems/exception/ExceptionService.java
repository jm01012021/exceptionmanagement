package io.springboot.regservices.ems.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
    
    private List<RegulatoryException> exceptions = new ArrayList<>(Arrays.asList(
            new RegulatoryException("01012021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01022021","1001","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01032021","1002","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01042021","1003","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),        
            new RegulatoryException("01052021","1004","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01062021","2005","01/04/2021 00:25:12:10","MONO","01032021MENOFIRMID","UUID1","100","10.1"),         
            new RegulatoryException("01072021","2006","01/04/2021 00:25:12:10","MEIR","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01082021","2007","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01092021","2008","01/04/2021 00:25:12:10","MEOR","01032021MENOFIRMID","UUID1","100","10.1"),
            new RegulatoryException("01102021","2009","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1")
            ));
    
            public List<RegulatoryException> getAllExceptions(){
                return exceptions;
            }

            public RegulatoryException getException(String runDate){
                return exceptions.stream().filter(t -> t.getRunDate().equals(runDate)).findFirst().get();
            }

            public void addException(RegulatoryException exception){
                exceptions.add(exception);
            }

            public void updateException(RegulatoryException exception, String runDate){
                for (int i = 0; i < exceptions.size(); i++){
                    var e = exceptions.get(i);
                    if (e.getRunDate().equals(runDate)){
                        exceptions.set(i, exception);
                        return;
                    }

                }

            }

            
            public void deleteException(String runDate){
                 exceptions.removeIf(t -> t.getRunDate().equals(runDate));
            }


}