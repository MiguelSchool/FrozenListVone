package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.BrandEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BrandEntityRepository : JpaRepository<BrandEntity, Long> {
}
