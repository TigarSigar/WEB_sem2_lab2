import org.assertj.core.api.Assertions
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

val baseUrl: String by env
val path: String by env

GET("$baseUrl/$path") {
    accept("application/json")
} then {
    val responseBody = body?.string() ?: throw IllegalStateException("Body is null")

    Assertions.assertThat(code).isEqualTo(200)

    Assertions.assertThat(responseBody).contains("\"text\"")

    Assertions.assertThat(responseBody).contains("Hello World")

    println("Успех! Ответ сервера: $responseBody")
}