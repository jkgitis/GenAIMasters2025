fun operateOnList(list: List<Int>, op: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        result.add(op(item))
    }
    return result
}

fun main() {
    val nums = listOf(1, 2, 3, 4)
    val doubled = operateOnList(nums) { it * 2 }
    println(doubled)
}
