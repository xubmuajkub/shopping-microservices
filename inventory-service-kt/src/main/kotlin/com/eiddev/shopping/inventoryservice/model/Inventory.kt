package com.eiddev.shopping.inventoryservice.model

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name="inventory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
data class Inventory (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val skuCode: String,
        val stock: Int
    )