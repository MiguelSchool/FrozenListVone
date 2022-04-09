package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StorageEntityRepository : JpaRepository<StorageEntity, Long> {
}
