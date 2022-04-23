package com.miguel.frozenlist.frozenlistvone.services

import com.miguel.frozenlist.frozenlistvone.dtos.AddressDto
import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.userGroupDtoToEntity
import com.miguel.frozenlist.frozenlistvone.repositories.UserGroupRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.ResponseEntity

@SpringBootTest
class UserGroupServiceImplTest {

    private val userGroupRepository: UserGroupRepository = mockk()
    private val userGroupServiceImpl: UserGroupServiceImpl = UserGroupServiceImpl(userGroupRepository)

    @Test
    fun `should create a userGroup`() {

        mockkObject(userGroupRepository)
        val dto = UserGroupDto()
        dto.id = 1L
        dto.address = AddressDto()

        dto.name = "mock"
        every { userGroupRepository.save(any()) }returns userGroupDtoToEntity(dto)
        val expected: ResponseEntity<UserGroupDto> = userGroupServiceImpl.createUserGroup(dto)
        assertNotNull(expected)
        val result : ResponseEntity<UserGroupDto> = userGroupServiceImpl.userGroupFindById(dto.id)
        assertEquals(expected,result)
    }

}
