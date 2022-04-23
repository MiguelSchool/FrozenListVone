package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.BrandEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BrandEntityRepository : JpaRepository<BrandEntity, Long> {}
