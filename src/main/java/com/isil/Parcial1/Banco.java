package com.isil.Parcial1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "banco")
public class Banco {

    @Id
    private int id;
    private String name;

    private long ruc;


}
