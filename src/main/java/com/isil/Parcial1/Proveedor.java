package com.isil.Parcial1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id

    private long id;

    private String ruc;
    private String nombre;
    private String categoria;
    private String producto;
    private String direccprov;
    private String direcc_prov;
}
