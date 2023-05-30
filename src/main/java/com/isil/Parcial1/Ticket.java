package com.isil.Parcial1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id

    private long id;

    private String asunto;
    private String descripcion;
    private String prioridad;
    private String estado;
    private String fecha_vencimiento;
    private String responsable;
    private String comentarios;
    private String categoria;
}
