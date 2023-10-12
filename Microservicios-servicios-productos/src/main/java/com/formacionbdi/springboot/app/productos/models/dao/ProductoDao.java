package com.formacionbdi.springboot.app.productos.models.dao;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

// Son protocolos de methods
public interface ProductoDao extends CrudRepository<Producto, Long> {


}
