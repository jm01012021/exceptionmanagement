package io.springboot.regservices.ems.exception;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExceptionController {

    @Autowired
    private ExceptionService exceptionService;
    
    @RequestMapping("/exceptions")
    public List<RegulatoryException> getAllExceptions(){
        return exceptionService.getAllExceptions();
    }

    @RequestMapping("/exceptions/{runDate}")
    public RegulatoryException getException(@PathVariable String runDate){
        return exceptionService.getException(runDate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/exceptions")
    public void addException(@RequestBody RegulatoryException exception){
        exceptionService.addException(exception);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/exceptions/{runDate}")
    public void updateException(@RequestBody RegulatoryException exception, @PathVariable String runDate){
        exceptionService.updateException(exception, runDate);
    }

}