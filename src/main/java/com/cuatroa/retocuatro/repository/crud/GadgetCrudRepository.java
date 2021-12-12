package com.cuatroa.retocuatro.repository.crud;

import com.cuatroa.retocuatro.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author sprue
 */
public interface GadgetCrudRepository extends MongoRepository<Gadget, Integer> {
    
}
