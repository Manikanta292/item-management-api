package com.ecommerce.item.management.api.controller;

import com.ecommerce.item.management.api.model.Item;
import com.ecommerce.item.management.api.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * Add a new item
     * POST /api/item/add
     *
     * @param item The item to add (from request body)
     */
    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item) {
        Item createdItem = itemService.addItem(item);
        return ResponseEntity.ok(createdItem);
    }

    /**
     * Get a single item by ID
     * GET /api/item/{id}
     *
     * @param id The ID of the item to retrieve
     * @return The item if found, 404 otherwise
     */
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
