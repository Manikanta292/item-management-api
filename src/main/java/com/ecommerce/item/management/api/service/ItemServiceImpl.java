package com.ecommerce.item.management.api.service;

import com.ecommerce.item.management.api.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    // In-memory data store
    private final List<Item> items = new ArrayList<>();

    /**
     * Add a new item to the inventory
     *
     * @param item The item to add
     * @return The added item with generated ID
     */
    public Item addItem(Item item) {
        items.add(item);
        return item;
    }

    /**
     * Get an item by its ID
     *
     * @param id The ID of the item to retrieve
     * @return Optional containing the item if found, empty otherwise
     */
    public Optional<Item> getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

}
