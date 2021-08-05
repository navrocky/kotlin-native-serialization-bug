import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer

@Serializable
sealed class Event {

    @SerialName("CREATED")
    @Serializable
    data class Created(
        val data: String
    ) : Event()

}

fun main() {
    val s = serializer<Event>()
    println(Json.encodeToString(s, Event.Created("111")))
}
