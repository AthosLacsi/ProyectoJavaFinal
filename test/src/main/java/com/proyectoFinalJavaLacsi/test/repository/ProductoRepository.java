package com.proyectoFinalJavaLacsi.test.repository;

import com.proyectoFinalJavaLacsi.test.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
