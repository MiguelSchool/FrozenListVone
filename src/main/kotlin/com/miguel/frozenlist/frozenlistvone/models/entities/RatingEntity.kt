package com.miguel.frozenlist.frozenlistvone.models.entities

import com.miguel.frozenlist.frozenlistvone.models.Rating
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Ratings")
class RatingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    var id: Long? = null

    @Column(nullable = false)
    var rating: Rating? = null

    @OneToMany
    lateinit var recipeEntities:List<RecipeEntity>

    @ManyToOne
    var userEntity: UserEntity? = null

}
