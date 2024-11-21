package com.floristeria.version_1.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "inventario_flores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventarioFlor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flor")
    private Long idFlor;

    private String tipo;
    private String color;
    private String variedad;
    private int stock;

    @Column(name = "precio_compra")
    private double precioCompra;

    @Column(name = "precio_venta")
    private double precioVenta;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @OneToMany(mappedBy = "inventarioFlor", cascade = CascadeType.ALL)
    private List<ArregloFlor> arreglosFlores;
}
