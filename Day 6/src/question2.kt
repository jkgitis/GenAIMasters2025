fun main() {
    val numbers = listOf(10,11,12,13,14,15,16,17,18,19)
    val evens = numbers.filter { it % 2 == 0 }
    println(evens)
}
