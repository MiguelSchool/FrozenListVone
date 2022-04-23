package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProductEntityRepository :  JpaRepository<ProductEntity, Long> {
    fun saveOrUpdate(entity: ProductEntity) : Pair<Boolean, ProductEntity> {
        val existing = if(entity.id != null) findById(entity.id!!) else Optional.ofNullable(null)
        val created: Boolean?
        val backEntity: ProductEntity = save(entity)
        created = !existing.isPresent
        return created to backEntity
    }
}
