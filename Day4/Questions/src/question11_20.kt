fun main(){

    //q11
    var strength = 0
    while (strength < 80) {
        println("Brewing... strength: $strength")
        strength += 10
    }
    println("Coffee ready! Strength: $strength")

    //q12
    val price = 6.0
    when {
        price < 3 -> println("Cheap brew")
        price <= 6 -> println("Mid-range sip")
        else -> println("Luxury latte")
    }

    //q13
    for (discount in 10..50 step 10) {
        println("Get $discount% off your coffee!")
    }

    //q14
    val temp = 75
    when {
        temp < 60 -> println("Too Cold!")
        temp in 60..75 -> println("Perfect!")
        else -> println("Too Hot!")
    }

    //q15
    var stock = 10
    do {
        println("Coffee stock: $stock")
        stock--
    } while (stock > 0)

    //q16
    val orderName = "Mocha"
    if (orderName.length >= 5)
        println("That’s a solid coffee name!")
    else
        println("Short and sweet!")

    //q17
    for (i in 1..4) {
        for (j in 1..4) {
            print("Coffee ")
        }
        println()
    }

    //q18
    val tipNumber = (1..4).random()
    when (tipNumber) {
        1 -> println("Tip: Always stir your espresso!")
        2 -> println("Tip: Never trust a cold coffee.")
        3 -> println("Tip: More beans, more power!")
        4 -> println("Tip: Life begins after coffee.")
    }

    //q19
    for (i in 1..10) {
        if (i == 5) {
            println("Rush hour!")
            break
        }
        println("Order #$i")
    }

    //q20
    for (i in 1..10) {
        if (i == 3 || i == 7) {
            println("Skipping decaf order #$i")
            continue
        }
        println("Processing order #$i")
    }





}