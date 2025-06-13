fun main() {
    println("Hello, World!")

    val name = "Gayatri"
    val age = 21

    greet(name)
    checkAge(age)
}

fun greet(name: String) {
    println("Welcome, $name!")
}

fun checkAge(age: Int) {
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }
}
