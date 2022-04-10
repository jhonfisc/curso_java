package com.cursojava.service;

import com.cursojava.domain.Descuento;

import java.util.function.BiFunction;

public interface GetTotalDiscount {
    BiFunction<Double, Descuento, Double> getTotal = (t, u) -> t * ( u.getPorcentaje() / 100 );
}
