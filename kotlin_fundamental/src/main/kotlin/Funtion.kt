fun main() {
    val user = setUser("Safira", "reading",  16)
    println(user)

}
fun setUser(name : String, hobby : String, age : Int) = "My name is $name, I like $hobby, and I'm $age years old"