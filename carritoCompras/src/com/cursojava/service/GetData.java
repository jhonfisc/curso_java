package com.cursojava.service;

import com.cursojava.infraestructure.ReadXML;
import com.cursojava.domain.Tienda;

import java.util.function.Supplier;

public interface GetData {
    Supplier<Tienda> getData = () -> new ReadXML().get();
}
