package com.cuatroa.retocuatro.repository;

import com.cuatroa.retocuatro.model.Gadget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retocuatro.repository.crud.GadgetCrudRepository;

/**
 *
 * @author sprue
 */
@Repository
public class GadgetRepository {
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;

    public List<Gadget> getAll() {
        return gadgetCrudRepository.findAll();
    }

     public Optional<Gadget> getGadget(Integer id) {
        return gadgetCrudRepository.findById(id);
    }
    
    public Gadget create(Gadget gadget) {
        return gadgetCrudRepository.save(gadget);
    }

    public void update(Gadget gadget) {
        gadgetCrudRepository.save(gadget);
    }
    
    public void delete(Gadget gadget) {
        gadgetCrudRepository.delete(gadget);
    }
}
