package com.proyectoFinalJavaLacsi.test.service;

import com.proyectoFinalJavaLacsi.test.model.Domicilio;
import com.proyectoFinalJavaLacsi.test.repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public List<Domicilio> getAllDomicilios() {
        return domicilioRepository.findAll();
    }

    public Optional<Domicilio> getDomicilioById(Long id) {
        return domicilioRepository.findById(id);
    }

    public Domicilio saveDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }

    public void deleteDomicilio(Long id) {
        domicilioRepository.deleteById(id);
    }
}
