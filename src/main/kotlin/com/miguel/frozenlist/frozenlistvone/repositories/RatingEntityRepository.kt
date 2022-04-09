package com.miguel.frozenlist.frozenlistvone.repositories;

import com.miguel.frozenlist.frozenlistvone.models.entities.RatingEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RatingEntityRepository : JpaRepository<RatingEntity, Long> {
}
