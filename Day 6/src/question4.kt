fun main() {
    val names = listOf("alice", "bob", "carol")

    val upperNames = names.map { it.uppercase() }
    println(upperNames)

    names.forEach { println("Hello, $it!") }
    
}
