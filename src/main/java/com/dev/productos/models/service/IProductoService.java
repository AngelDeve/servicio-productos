package com.dev.productos.models.service;

import java.util.List;

import com.dev.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);

}
