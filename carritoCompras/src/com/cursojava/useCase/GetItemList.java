package com.cursojava.useCase;

import com.cursojava.domain.Item;
import com.cursojava.service.TiendaService;
import com.cursojava.service.TiendaServiceImpl;

import java.util.List;
import java.util.function.Supplier;

public class GetItemList {

    private TiendaService tiendaService;

    private Supplier<TiendaService> getService = () -> new TiendaServiceImpl();

    public GetItemList() {
        tiendaService = getService.get();
    }

    public List<Item> getItemList() {
        return tiendaService.getList();
    }

    public void show() {
        this.getItemList().stream().forEach(item -> System.out.println(item));
    }
}
