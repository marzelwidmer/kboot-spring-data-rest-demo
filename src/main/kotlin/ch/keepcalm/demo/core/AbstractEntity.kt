package ch.keepcalm.demo.core

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.CreatedDate
import java.time.ZonedDateTime
import javax.persistence.*

/**
 * Base class for entity implementations. Uses a [String] id.
 *
 * @author Marcel Widmer
 */
@MappedSuperclass
open class AbstractEntity protected constructor() {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JsonIgnore
    private val id: String? = null

    @CreatedDate
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private val date: ZonedDateTime? = null

//    @Version
//    private val version: String? = null
//    @LastModifiedDate
//    private val date: ZonedDateTime? = null

}
