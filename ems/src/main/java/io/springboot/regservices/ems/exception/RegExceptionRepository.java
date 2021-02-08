package io.springboot.regservices.ems.exception;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegExceptionRepository extends CassandraRepository<RegExceptionEntity, String> {

   
    
}


