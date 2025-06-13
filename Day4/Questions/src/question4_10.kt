fun main(){

    //q4
    var size1 = "Small"
    var size2 = "Large"
    val temp = size1
    size1 = size2
    size2 = temp
    println("Size1: $size1, Size2: $size2")

    //q5
    val orderNumber = 7
    if (orderNumber % 2 == 0)
        println("Even order! The coffee gods are smiling.")
    else
        println("Odd order! It might be a magical brew.")

    //q6
    val day = 3
    when(day) {
        1 -> println("Monday Mocha Madness")
        2 -> println("Tuesday Espresso Shot")
        3 -> println("Wednesday Latte Love")
        4 -> println("Thursday Cappuccino Chill")
        5 -> println("Friday Flat White Fiesta")
        6 -> println("Saturday Cold Brew Buzz")
        7 -> println("Sunday Sweet Macchiato")
        else -> println("Invalid day!")
    }

    //q7
    for (price in 1..10) {
        if (price % 2 == 0)
            println("\$$price coffee – what a deal!")
    }

    //q8
    for (cups in 5 downTo 1) {
        println("Only $cups cup(s) of coffee left! Hurry!")
    }

    //q9
    val age = 65
    if (age >= 60)
        println("You're eligible for a senior discount!")
    else
        println("No discount yet, but coffee still loves you!")

    //q10
    val caffeineLevel = 85
    val strength = when (caffeineLevel) {
        in 0..30 -> "Mild"
        in 31..70 -> "Medium"
        else -> "Strong"
    }
    println("Coffee strength: $strength")



}