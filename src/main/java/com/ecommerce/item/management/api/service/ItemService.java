package com.ecommerce.item.management.api.service;

import com.ecommerce.item.management.api.model.Item;

import java.util.Optional;

public interface ItemService {

    Item addItem(Item item);

    Optional<Item> getItemById(Long id);
}
