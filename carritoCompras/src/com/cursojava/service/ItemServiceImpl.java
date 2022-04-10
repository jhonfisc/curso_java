package com.cursojava.service;

import com.cursojava.domain.Item;
import com.cursojava.infraestructure.ItemDAO;

import java.util.List;

public class ItemServiceImpl implements ItemService, GetData {

    @Override
    public void setList(Item item) {
        ItemDAO.setListItems(item);
    }

    @Override
    public List<Item> getList() {
        return ItemDAO.getListItems();
    }
}
