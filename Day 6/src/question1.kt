//HOF are functions that take functions as paramenter and return function as well

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val result = applyOperation(4, 5) { x, y -> x + y }
    println("Result: $result")
}
