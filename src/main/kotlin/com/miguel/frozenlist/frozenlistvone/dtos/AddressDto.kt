package com.miguel.frozenlist.frozenlistvone.dtos

import java.io.Serializable

data class AddressDto(
    val street: String? = null,
    val streetNumber: String? = null,
    val postcode: String? = null,
    val City: String? = null,
    val floor: String? = null,
    val userGroupEntity: MutableList<UserGroupDto> = mutableListOf()
) : Serializable
