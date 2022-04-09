package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.StorageTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StorageTypeEntityRepository : JpaRepository<StorageTypeEntity, Long> {
}
