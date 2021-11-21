package ch.keepcalm.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.hateoas.config.HypermediaRestTemplateConfigurer
import org.springframework.hateoas.config.HypermediaWebClientConfigurer
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.server.adapter.ForwardedHeaderTransformer

@SpringBootApplication
class SpringDataRestDemoApplication {
	@Bean
	fun forwardedHeaderTransformer(): ForwardedHeaderTransformer? {
		return ForwardedHeaderTransformer().apply {
			isRemoveOnly = true
		}
	}

	@Bean
	fun webClientBuilder(configurer: HypermediaWebClientConfigurer): WebClient.Builder? {
		return configurer.registerHypermediaTypes(WebClient.builder())
	}

	@Bean
	fun restTemplateCustomizer(configurer: HypermediaRestTemplateConfigurer): RestTemplateCustomizer? {
		return RestTemplateCustomizer { restTemplate: RestTemplate? -> restTemplate?.let { configurer.registerHypermediaTypes(it) } }
	}
}

fun main(args: Array<String>) {
	runApplication<SpringDataRestDemoApplication>(*args)
}
