package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.StorageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface StorageEntityRepository : JpaRepository<StorageEntity, Long> {}
