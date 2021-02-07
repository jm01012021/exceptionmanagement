package io.springboot.regservices.ems.exception;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InMemoryExceptionController {
    
    @Autowired
    private ExceptionService exceptionService;
    
    @RequestMapping("/exceptions")
    public List<RegulatoryException> getAllExceptions(){
        return exceptionService.getAllExceptions();
    }

    @RequestMapping("/exceptions/{runDate}")
    public List<RegulatoryException> getException(String runDate){
        return exceptionService.getException(runDate);
    }


}