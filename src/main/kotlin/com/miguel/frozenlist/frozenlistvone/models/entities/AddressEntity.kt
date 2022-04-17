package com.miguel.frozenlist.frozenlistvone.models.entities

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Addresses")
class AddressEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    var id: Long? = null

    @Column(name = "street")
    var street : String? = null

    @Column(name = "street_number")
    var streetNumber : String? = null

    @Column(name = "postcode")
    var postcode : String? = null

    @Column(nullable = false)
    var city : String? = null

    @Column(nullable = false)
    var floor : String? = null

    @OneToMany
    private lateinit var userGroupEntity: List<UserGroupEntity>

}
