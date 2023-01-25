package com.ecommerce.commerce.test.dev.infraestructure.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {

    @Autowired
    private ModelMapper modelMapper;

    public <D, T> D map(final T entity, Class<D> outClass) {
        return modelMapper.map(entity, outClass);
    }


}
