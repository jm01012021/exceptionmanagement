package io.springboot.regservices.ems.exception;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.regservices.ems.exception.ExceptionService;

@RestController
public class ExceptionController {

    @Autowired
    private ExceptionService exceptionService;
    
    @RequestMapping("/exceptions")
    public List<Exception> getAllExceptions(){
        return exceptionService.getAllExceptions();
            
    }


}