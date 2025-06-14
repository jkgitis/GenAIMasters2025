// 1. Show a welcome message
fun welcomeMessage(coffeeType: String): String {
    return "Enjoy your $coffeeType!"
}

// 2. Calculate total price (nullable price)
fun calculateTotal(quantity: Int, pricePerCup: Double?): Double {
    if (pricePerCup == null) {
        return 0.0
    }
    return quantity * pricePerCup
}

// 3. Coffee order with type and size
class CoffeeOrder(val type: String, val size: String) {
    fun printSummary() {
        println("You ordered a $size $type")
    }
}

// 4. Greet customer (nullable name)
fun greetCustomer(name: String?): String {
    if (name == null) {
        return "Welcome, Guest!"
    }
    return "Welcome, $name!"
}

// 5. Coffee shop with name and hours
class CoffeeShop(val name: String) {
    fun printOpeningHours() {
        println("$name is open from 7 AM to 7 PM")
    }
}

// 6. Find highest coffee price
fun highestCoffeePrice(prices: List<Double>): Double {
    var max = 0.0
    for (price in prices) {
        if (price > max) {
            max = price
        }
    }
    return max
}

// 7. Make coffee with sugar
fun prepareCoffee(coffeeType: String, sugar: Int = 1) {
    println("Making $coffeeType with $sugar spoon(s) of sugar")
}

// 8. Barista with favorite coffee (nullable)
class Barista(val name: String, val favoriteCoffee: String?) {
    fun printFavorite() {
        if (favoriteCoffee != null) {
            println("Favorite coffee: $favoriteCoffee")
        } else {
            println("Favorite coffee: Unknown")
        }
    }
}

// 9. Filter coffee types that start with "C"
fun filterCoffees(coffeeList: List<String>): List<String> {
    val result = mutableListOf<String>()
    for (coffee in coffeeList) {
        if (coffee.startsWith("C")) {
            result.add(coffee)
        }
    }
    return result
}

// 10. Coffee cup temperature check
class CoffeeCup(val temperature: Int) {
    fun isTooHot(): Boolean {
        return temperature > 70
    }
}

// Main function
fun main() {
    println(welcomeMessage("Latte"))

    val total = calculateTotal(2, 4.0)
    println("Total price: $total")

    val order = CoffeeOrder("Espresso", "Medium")
    order.printSummary()

    println(greetCustomer(null))
    println(greetCustomer("John"))

    val shop = CoffeeShop("Coffee Time")
    shop.printOpeningHours()

    val prices = listOf(3.0, 5.5, 4.25)
    println("Highest price: ${highestCoffeePrice(prices)}")

    prepareCoffee("Americano")
    prepareCoffee("Latte", 2)

    val barista = Barista("Emily", null)
    barista.printFavorite()

    val coffeeList = listOf("Latte", "Cappuccino", "Cold Brew", "Mocha")
    val filtered = filterCoffees(coffeeList)
    println("C coffees: $filtered")

    val cup = CoffeeCup(75)
    println("Too hot? ${cup.isTooHot()}")
}
