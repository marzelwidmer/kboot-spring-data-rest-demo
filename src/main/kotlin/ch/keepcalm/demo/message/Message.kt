package ch.keepcalm.demo.message

import ch.keepcalm.demo.core.AbstractEntity
import javax.persistence.Entity

typealias Text = String

@Entity
class Message(
    val text: Text
) : AbstractEntity()


////@ValueObject
//@JvmInline
//value class Text(private val value: String) {
//    init {
//        require(value.isNotEmpty()) { "Text must be non-empty" }
//        require(value.trim().length >= 2) { "wrong Text length" }
//        require(value.trim().length <= 60) { "wrong Text length" }
//    }
//
//    override fun toString() = value
//}
