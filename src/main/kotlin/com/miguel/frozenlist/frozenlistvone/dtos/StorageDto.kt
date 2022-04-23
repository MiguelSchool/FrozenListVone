package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.*
import java.io.Serializable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class StorageDto : Serializable {
    val id: Long? = null
    var name: String? = null
    var description: String? = null
    var isValid: Boolean = false
}
