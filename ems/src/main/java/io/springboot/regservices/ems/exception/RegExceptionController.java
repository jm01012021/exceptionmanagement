package io.springboot.regservices.ems.exception;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.OPTIONS;
import static org.springframework.web.bind.annotation.RequestMethod.PATCH;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
  methods = {POST, GET, OPTIONS, PUT, DELETE, PATCH},
  maxAge = 3600,
  allowedHeaders = {"x-requested-with", "origin", "content-type", "accept"},
  origins = "*" 
)
@RequestMapping("/api/v1/cassandraregexceptions/")
public class RegExceptionController {
    
    private RegExceptionRepository repo;
    
    public RegExceptionController(RegExceptionRepository regExceptionRepo) {
        this.repo = regExceptionRepo;
    }
    
    
    private static RegException mapAsRegException(RegException re) {
        RegException regException = new RegException();
        regException.setRunDate(re.getRunDate());
        regException.setErrorCode(re.getErrorCode());
        regException.setTimeStamp(re.getTimeStamp());
        regException.setEventType(re.getEventType());
        regException.setFirmRoeId(re.getFirmRoeId());
        regException.setTxnKey(re.getTxnKey());
        regException.setQuantity(re.getQuantity());
        regException.setPrice(re.getPrice());

        return regException;
    }
    
    private static RegExceptionEntity mapAsRegExceptionEntity(RegException re) {
        RegExceptionEntity regExceptionEntity = new RegExceptionEntity();
        regExceptionEntity.setRunDate(re.getRunDate());
        regExceptionEntity.setErrorcode(re.getErrorCode());
        regExceptionEntity.setTimestamp(re.getTimeStamp());
        regExceptionEntity.setEventtype(re.getEventType());
        regExceptionEntity.setFirmroeid(re.getFirmRoeId());
        regExceptionEntity.setTxnkey(re.getTxnKey());
        regExceptionEntity.setQuantity(re.getQuantity());
        regExceptionEntity.setPrice(re.getPrice());


        return regExceptionEntity;
    }

    

}