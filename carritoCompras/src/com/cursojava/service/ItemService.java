package com.cursojava.service;

import com.cursojava.domain.Item;

import java.util.List;

public interface ItemService {
    void setList(Item item);
    List<Item> getList();
}
