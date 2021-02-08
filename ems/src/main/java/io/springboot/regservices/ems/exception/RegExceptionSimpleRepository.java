package io.springboot.regservices.ems.exception;

import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.mapping.CassandraPersistentEntity;
import org.springframework.data.cassandra.repository.support.MappingCassandraEntityInformation;
import org.springframework.data.cassandra.repository.support.SimpleCassandraRepository;
import org.springframework.stereotype.Repository;

import com.datastax.oss.driver.api.core.CqlSession;

@Repository
public class RegExceptionSimpleRepository extends SimpleCassandraRepository<RegExceptionEntity, String> {

    protected final CqlSession cqlSession;
    
    protected final CassandraOperations cassandraTemplate;
    
    @SuppressWarnings("unchecked")
    public RegExceptionSimpleRepository(CqlSession cqlSession, CassandraOperations ops) {
        super(new MappingCassandraEntityInformation<RegExceptionEntity, String>(
                (CassandraPersistentEntity<RegExceptionEntity>) ops.getConverter().getMappingContext()
                .getRequiredPersistentEntity(RegExceptionEntity.class), ops.getConverter()), ops);
        this.cqlSession = cqlSession;
        this.cassandraTemplate = ops;
    }
    
    
}
