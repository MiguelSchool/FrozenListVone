package com.miguel.frozenlist.frozenlistvone.mapper

import com.miguel.frozenlist.frozenlistvone.dtos.UserGroupDto
import com.miguel.frozenlist.frozenlistvone.dtos.globalMapperFiles.userGroupDtoToEntity
import com.miguel.frozenlist.frozenlistvone.models.entities.UserGroupEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.boot.test.context.SpringBootTest
import java.util.Random

@SpringBootTest
class UserGroupMapperFunctionTests {

    @ParameterizedTest
    @MethodSource("getValidMockUserGroupDtosAsList")
    fun `should never be null entity` (userGroupMockDto: UserGroupDto) {
        val expected = userGroupDtoToEntity(userGroupMockDto)
        assertNotNull(expected)
    }

    @ParameterizedTest
    @MethodSource("getInValidMockUserGroupDtosAsList")
    fun `should  be null entity` (userGroupMockDto: UserGroupDto) {
        val expected = userGroupDtoToEntity(userGroupMockDto)
        assertTrue(expected == UserGroupEntity())
    }

    @ParameterizedTest
    @MethodSource("getUserGroupMockEntitiesAsList")
    fun `should be valid`(userGroupEntityMock: UserGroupEntity) {

    }

    companion object {

        @JvmStatic
        fun getValidMockUserGroupDtosAsList() : List<UserGroupDto> {
            val mock1 = UserGroupDto()
                mock1.id= Random().nextLong()
                mock1.name = "Usergroup1"

            val mock2 = UserGroupDto()
                mock2.id= Random().nextLong()
                mock2.name = "aVeryLongGroupName"

            val mock3 = UserGroupDto()
                mock3.id= Random().nextLong()
                mock3.name = "Group name with whitespace"

            val mock4 = UserGroupDto()
                mock4.id= Random().nextLong()
                mock4.name = "\$isValidGroupName"

            val mock5 = UserGroupDto()
                mock5.id= Random().nextLong()
                mock5.name = "aVery#LongGrou#pName"

            return listOf(mock1,mock2,mock3,mock4,mock5)
        }

        @JvmStatic
        fun getInValidMockUserGroupDtosAsList() : List<UserGroupDto> {
            val mock1 = UserGroupDto()
            mock1.id= Random().nextLong()
            mock1.name = ""

            val mock2 = UserGroupDto()
            mock2.id= Random().nextLong()
            mock2.name = null

            return listOf(mock1,mock2)
        }

        @JvmStatic
        fun getUserGroupMockEntitiesAsList() : List<UserGroupEntity> {
            val mock1 = UserGroupEntity()
                mock1.name = "name"
            return listOf()
        }

        @JvmStatic
        fun getInValidUserGroupEntitiesAList() : List<UserGroupEntity> {
            return listOf()
        }
    }
}
