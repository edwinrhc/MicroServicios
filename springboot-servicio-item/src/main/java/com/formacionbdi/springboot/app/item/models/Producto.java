package com.formacionbdi.springboot.app.item.models;

import lombok.Data;

import java.util.Date;

@Data
public class Producto {

    private Long id;
    private String nombre;
    private Double precio;
    private Date createAt;
}
