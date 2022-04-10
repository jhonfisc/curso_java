package com.cursojava.service;

import com.cursojava.domain.Descuento;
import com.cursojava.infraestructure.ReadXML;

public class DescuentoServiceImpl implements DescuentoSevice {
    @Override
    public Descuento getDescuento(Double total) {
         return ReadXML.getTienda().getDescuentos().stream()
                 .filter(descuento -> (total > descuento.getMin() && total <= descuento.getMax()))
                 .findFirst().get();
    }
}
