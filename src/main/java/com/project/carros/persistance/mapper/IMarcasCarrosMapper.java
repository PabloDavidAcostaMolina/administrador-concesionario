package com.project.carros.persistance.mapper;

import com.project.carros.domain.pojos.MarcasCarrosPojo;
import com.project.carros.persistance.entity.MarcasCarrosEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


/**
 *  mapper que transforma objetos de marca coche a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcasCarrosMapper {

    /**
     *  convierte una entidad  a un pojo de marca carro
     * @param marcaEntity entidad a convertir
     * @return pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcasCarrosPojo toMarcasCarroPojo(MarcasCarrosEntity marcaEntity);


    /**
     * Convierte un pojo a una entidad de marc coche
     * @param marcaPojo pojo a convertir
     * @return entidad convertida
     */
    @InheritInverseConfiguration
    MarcasCarrosEntity toMarcasCarrosEntity(MarcasCarrosPojo marcaPojo);

    /**
     * retorna una lista de marcas carros transformada a pojo de una lista de entidades
     * @param marcasCarrosEntity entidad a transformar
     * @return lista transformada
     */
    List<MarcasCarrosPojo>toMarcasCarrosPojo(List<MarcasCarrosEntity> marcasCarrosEntity);
}

