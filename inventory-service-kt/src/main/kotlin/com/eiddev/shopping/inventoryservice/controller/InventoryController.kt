package com.eiddev.shopping.inventoryservice.controller

import com.eiddev.shopping.inventoryservice.model.Inventory
import com.eiddev.shopping.inventoryservice.repository.InventoryRepository
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
class InventoryController (val inventoryRepository: InventoryRepository) {
    @GetMapping("/{skuCode}")
    fun isInStock(@PathVariable skuCode:String): Boolean {
        val inventory: Inventory = inventoryRepository.findBySkuCode(skuCode).orElseThrow {RuntimeException("Cannot find product by sku code $skuCode")}
        return inventory.stock > 0;
    }
}

