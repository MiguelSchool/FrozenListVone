package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class StorageTypeDto : Serializable {
    val id: Long? = null
    var storageTypeName: String? = null
    var storageDtoList: MutableList<StorageDto> = mutableListOf()
    var isValid = false
}
