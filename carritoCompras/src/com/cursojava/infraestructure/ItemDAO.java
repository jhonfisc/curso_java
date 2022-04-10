package com.cursojava.infraestructure;

import com.cursojava.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
    private static List<Item> listItems = new ArrayList();

    public static List<Item> getListItems() {
        return listItems;
    }

    public static void setListItems(Item item) {
        ItemDAO.listItems.add(item);
    }
}
