package io.springboot.regservices.ems.exception;

import org.springframework.data.repository.CrudRepository;

public interface ExceptionRepository extends CrudRepository<RegulatoryException, String>{
    
}