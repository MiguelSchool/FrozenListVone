package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class BrandDto : Serializable {
    val id: Long? = null
    val name: String? = null
    val price: Double? = null
}
