package ch.keepcalm.demo.core

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.LastModifiedDate
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
//    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JsonIgnore
    private val id: String? = null
//    @Version
//    private val version: String? = null
    @LastModifiedDate
    private val date: ZonedDateTime? = null
}
