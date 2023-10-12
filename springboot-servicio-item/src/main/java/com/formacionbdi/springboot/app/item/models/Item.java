package com.formacionbdi.springboot.app.item.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Producto producto;
    private Integer cantidad;

// calcular el precio
    public Double getTotal(){
        return  producto.getPrecio() * cantidad.doubleValue();
    }

}

