package io.springboot.regservices.ems.inmemoryexception;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InMemoryExceptionController {
    
    @Autowired
    private InMemoryExceptionService exceptionService;
    
    @RequestMapping("/inmemoryexceptions")
    public List<RegulatoryException> getAllExceptions(){
        return exceptionService.getAllExceptions();
    }

    @RequestMapping("/inmemoryexceptions/{runDate}")
    public RegulatoryException getException(@PathVariable String runDate){
        return exceptionService.getException(runDate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/inmemoryexceptions")
    public void addException(@RequestBody RegulatoryException exception){
        exceptionService.addException(exception);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/inmemoryexceptions/{runDate}")
    public void updateException(@RequestBody RegulatoryException exception, @PathVariable String runDate){
        exceptionService.updateException(exception, runDate);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/inmemoryexceptions/{runDate}")
    public void deleteException(@PathVariable String runDate){
        exceptionService.deleteException(runDate);
    }

}