package com.eiddev.shopping.inventoryservice.repository

import com.eiddev.shopping.inventoryservice.model.Inventory
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface InventoryRepository : JpaRepository<Inventory, Long> {
    fun findBySkuCode(skuCode: String): Optional<Inventory>
}