package com.project.carros.persistance.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * entidad de marcas carros
 */

@Getter
@Setter
@Entity
@Table(name = "marcas_carros")
public class MarcasCarrosEntity {

    /**
     *  id de la marca
     */
    @Id
    //@Column(name = "id") va cuando la columna en la db se llama diferente  como se define aquí
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para autonincrementar ese id
    private Integer id;


    /**
     * descripción de la marca
     */
    @Column(name = "descripcion")
    private String description;

}
