package com.proyectoFinalJavaLacsi.test.controller;

import com.proyectoFinalJavaLacsi.test.model.Domicilio;
import com.proyectoFinalJavaLacsi.test.service.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

    @Autowired
    private DomicilioService domicilioService;

    @GetMapping
    public List<Domicilio> getAllDomicilios() {
        return domicilioService.getAllDomicilios();
    }

    @GetMapping("/{id}")
    public Optional<Domicilio> getDomicilioById(@PathVariable Long id) {
        return domicilioService.getDomicilioById(id);
    }

    @PostMapping
    public Domicilio createDomicilio(@RequestBody Domicilio domicilio) {
        return domicilioService.saveDomicilio(domicilio);
    }

    @DeleteMapping("/{id}")
    public void deleteDomicilio(@PathVariable Long id) {
        domicilioService.deleteDomicilio(id);
    }
}
