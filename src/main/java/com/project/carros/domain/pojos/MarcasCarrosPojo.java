package com.project.carros.domain.pojos;

import lombok.Getter;
import lombok.Setter;

/**
 * pojo de marcas carros
 */
@Getter
@Setter
public class MarcasCarrosPojo {

    /**
     * id de la marca
     */
    private  Integer id;

    /**
     * descripción de la marca
     */
    private  String description;
}
