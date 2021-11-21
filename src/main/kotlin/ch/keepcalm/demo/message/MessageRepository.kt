package ch.keepcalm.demo.message

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "messages", path = "messages")
interface MessageRepository : PagingAndSortingRepository<Message?, String?>
