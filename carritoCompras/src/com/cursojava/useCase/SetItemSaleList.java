package com.cursojava.useCase;

import com.cursojava.domain.Item;
import com.cursojava.service.ItemService;
import com.cursojava.service.ItemServiceImpl;

import java.util.List;
import java.util.function.Supplier;

public class SetItemSaleList {
    private List<Item> listItemSale;
    private Supplier<ItemService> getService = () -> new ItemServiceImpl();

    private SetItemSaleList() {
    }

    public static SetItemSaleList build() {
        return new SetItemSaleList();
    }

    public void set(Item item) {
        this.getService.get().setList(item);
    }
}
