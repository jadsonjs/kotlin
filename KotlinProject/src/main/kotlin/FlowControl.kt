

/***
 * Flow Control
 * https://www.tutorialspoint.com/kotlin
 */
fun main(args: Array<String>) {

    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }

    println("Maximum of a or b is " +max)

    for (j in 1..4)
        println(j) // prints "1234


    val items = listOf(1, 22, 83, 4)

    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }

    val i:Int  = 2
    if (i in 1..10) {
        println("we found your number -->"+i)
    }

    var y:Int = 0
    println("Example of While Loop--")

    while(y <= 10) {
        println(y)
        y++
    }

    var z:Int = 0
    do {
        z = z + 10
        println("I am inside Do block---"+z)
    } while(z <= 50)


    val x:Int = 5
    when (x) {
        1 -> print("x = = 1")
        2 -> print("x = = 2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    println("The value of X is--"+doubleMe(x))

}

/**
 * Example of function declaration in kotlin
 */
fun doubleMe(x:Int):Int {
    return 2*x;
}