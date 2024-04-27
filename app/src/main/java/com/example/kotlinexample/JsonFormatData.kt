import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


data class Person(
    val name: String,
    val salary: Int,
    val married: Boolean)

@Serializable
data class Users(val name:String, val age:Int)

fun main() {
    val person = Person("Joseph", 40000, true)



    val json = Json.encodeToString(person)
    println(json)
}
