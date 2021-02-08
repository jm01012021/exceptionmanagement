package io.springboot.regservices.ems.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegExceptionController {
    
    private RegExceptionRepository exceptionService;

    @RequestMapping("/exceptions")
    public List<RegExceptionEntity> getAllExceptions(){
        List<RegExceptionEntity> exceptions = new ArrayList<>();
        exceptionService.findAll().forEach(e -> exceptions.add(e));
        return exceptions;
    }




}

