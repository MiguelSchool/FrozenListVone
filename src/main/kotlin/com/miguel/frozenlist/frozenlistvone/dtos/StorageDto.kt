package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable


@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class StorageDto : Serializable {
    val id: Long? = null
    var name: String? = null
    var description: String? = null
    val productList = mutableListOf<ProductDto>()
    lateinit var storageTypeDto : StorageTypeDto
    lateinit var userGroupDto: UserGroupDto
    var isValid: Boolean = false
}
