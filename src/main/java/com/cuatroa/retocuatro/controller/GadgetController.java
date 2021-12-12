package com.cuatroa.retocuatro.controller;

import com.cuatroa.retocuatro.model.Gadget;
import com.cuatroa.retocuatro.service.GadgetService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sprue
 */
@RestController
@RequestMapping("/api/gadget")
@CrossOrigin("*")
public class GadgetController {

    @Autowired
    private GadgetService gadgetService;

    @GetMapping("/all")
    public List<Gadget> getAll() {
        return gadgetService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Gadget> getGadget(@PathVariable("id") Integer id) {
        return gadgetService.getGadget(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget create(@RequestBody Gadget gadget) {
        return gadgetService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget) {
        return gadgetService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return gadgetService.delete(id);
    }
}