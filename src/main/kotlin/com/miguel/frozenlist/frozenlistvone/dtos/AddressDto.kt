package com.miguel.frozenlist.frozenlistvone.dtos

import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import lombok.ToString
import java.io.Serializable
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class AddressDto : Serializable {
    var street: String? = null
    var streetNumber: String? = null
    var postcode: String? = null
    var city: String? = null
    var floor: String? = null
    val userGroupEntity: MutableList<UserGroupDto> = mutableListOf()
    var isValid: Boolean = false
}

