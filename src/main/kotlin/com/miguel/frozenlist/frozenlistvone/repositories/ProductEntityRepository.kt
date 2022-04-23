package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProductEntityRepository :  JpaRepository<ProductEntity, Long> {}
