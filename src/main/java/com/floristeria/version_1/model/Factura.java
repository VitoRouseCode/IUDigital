package com.floristeria.version_1.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;

    @OneToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @Column(name = "monto_total")
    private double montoTotal;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

    @Column(name = "estado_pago")
    private String estadoPago;
}
