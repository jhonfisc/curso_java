package com.cursojava.useCase;

import com.cursojava.domain.Item;

import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ShowMenuList {

    private final String TITLE = "=== ALMACEN JAVA ===";
    private GetItemList getItemList;

    private Supplier<GetItemList> getUseCase = () -> new GetItemList();

    public ShowMenuList() {
        this.getItemList = getUseCase.get();
    }

    public void show() {
        System.out.println(TITLE);
        getItemList.show();
        System.out.println("");
    }

    public Item getItem(Number id) {
        return this.getItemList.getItemList().stream().filter(item -> item.getId().equals(id.toString())).collect(Collectors.toList()).get(0);
    }
}
