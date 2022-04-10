package com.cursojava.service;

import com.cursojava.domain.Item;
import com.cursojava.domain.Tienda;

import java.util.List;

public class TiendaServiceImpl implements TiendaService, GetData {
    @Override
    public List<Item> getList() {
        Tienda tienda = getData.get();
        return tienda.getItems();
    }
}
