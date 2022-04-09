package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.ShoppingListEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ShoppingListEntityRepository : JpaRepository<ShoppingListEntity, Long> {
}
