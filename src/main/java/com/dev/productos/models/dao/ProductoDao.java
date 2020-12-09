package com.dev.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.dev.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
