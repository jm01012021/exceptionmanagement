package io.springboot.regservices.ems.api;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.springboot.regservices.ems.service.Exception;

@RestController
public class InMemoryExceptionController {
    
    @RequestMapping("/inmemoryexceptions")
    public List<Exception> getAllExceptions(){
        return Arrays.asList(
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),        
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1"),         
            new Exception("01/03/2021","1000","01/04/2021 00:25:12:10","MENO","01032021MENOFIRMID","UUID1","100","10.1")
            
            );
    }


}