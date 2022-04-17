package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class StorageTypeEntityDto : Serializable {
    val name: String? = null
    val storageEntity: MutableList<StorageDto> = mutableListOf()
}
