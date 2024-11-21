package com.floristeria.version_1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "arreglos_flores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArregloFlor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_arreglo")
    private Arreglo arreglo;

    @ManyToOne
    @JoinColumn(name = "id_flor")
    private InventarioFlor inventarioFlor;

    private int cantidad;
}
