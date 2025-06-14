// 11. Get price from nullable coffee size
fun getCoffeePrice(size: String?): Double {
    if (size == null) {
        return 0.0
    }
    if (size == "Small") return 2.5
    if (size == "Medium") return 3.5
    if (size == "Large") return 4.5
    return 0.0
}

// 12. Coffee menu with items list
class CoffeeMenu(val items: List<String>) {
    fun printItems() {
        for (item in items) {
            println(item)
        }
    }
}

// 13. Print number of unique coffee orders
fun countUniqueOrders(orders: Set<String>) {
    println("Number of unique orders: ${orders.size}")
}

// 14. Apply discount to coffee prices
fun applyDiscount(prices: List<Double>): List<Double> {
    val discounted = mutableListOf<Double>()
    for (price in prices) {
        val discount = price * 0.9
        discounted.add(discount)
    }
    return discounted
}

// 15. Customer with loyalty points
class Customer(val name: String, var points: Int) {
    fun addPoints(newPoints: Int) {
        points += newPoints
    }
}

// 16. Check if coffee type is valid
fun isValidCoffee(coffeeType: String?): Boolean {
    val validList = listOf("Latte", "Espresso", "Cappuccino", "Americano")
    if (coffeeType == null) return false
    return coffeeType in validList
}

// 17. Coffee bean data class
data class CoffeeBean(val name: String, val roast: String)

// 18. Find most expensive coffee from map
fun findMostExpensive(coffeeMap: Map<String, Double>) {
    var maxPrice = 0.0
    var maxCoffee = ""
    for ((coffee, price) in coffeeMap) {
        if (price > maxPrice) {
            maxPrice = price
            maxCoffee = coffee
        }
    }
    println("Most expensive: $maxCoffee at $$maxPrice")
}

// 19. CoffeeMachine class with brew function
class CoffeeMachine(var status: String) {
    fun brew() {
        if (status == "On") {
            println("Brewing coffee...")
        } else {
            println("Machine is off")
        }
    }
}

// 20. Sort coffee names and print first
fun printFirstSorted(coffeeNames: List<String>) {
    val sorted = coffeeNames.sorted()
    if (sorted.isNotEmpty()) {
        println("First coffee alphabetically: ${sorted[0]}")
    }
}

fun main() {
    println("Price for Medium: ${getCoffeePrice("Medium")}")
    println("Price for null size: ${getCoffeePrice(null)}")

    val menu = CoffeeMenu(listOf("Latte", "Espresso", "Mocha"))
    println("Coffee Menu:")
    menu.printItems()

    val orders = setOf("Latte", "Espresso", "Latte", "Cappuccino")
    countUniqueOrders(orders)

    val prices = listOf(5.0, 3.5, 4.0)
    val discounted = applyDiscount(prices)
    println("Discounted prices: $discounted")

    val customer = Customer("Alice", 10)
    customer.addPoints(5)
    println("${customer.name} now has ${customer.points} points")

    println("Is 'Espresso' valid? ${isValidCoffee("Espresso")}")
    println("Is null valid? ${isValidCoffee(null)}")

    val beans = listOf(
        CoffeeBean("Arabica", "Light"),
        CoffeeBean("Robusta", "Dark")
    )
    println("Coffee Beans:")
    for (bean in beans) {
        println("${bean.name} - ${bean.roast}")
    }

    val coffeeMap = mapOf("Latte" to 3.5, "Mocha" to 4.0, "Espresso" to 2.5)
    findMostExpensive(coffeeMap)

    val machine = CoffeeMachine("On")
    machine.brew()

    val coffeeNames = listOf("Mocha", "Latte", "Cappuccino", "Americano")
    printFirstSorted(coffeeNames)
}

