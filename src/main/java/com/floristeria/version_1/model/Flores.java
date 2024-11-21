package com.floristeria.version_1.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tbl_flores")
public class Flores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column (name = "nombre")
    String name;
    @Column (name = "color")
    String color;
    @Column (name = "precio")
    double price;
}
