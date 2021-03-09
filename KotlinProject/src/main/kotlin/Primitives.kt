
/***
 * Primitive types in Kotlin
 * https://www.tutorialspoint.com/kotlin
 */
fun main(args: Array<String>) {

    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    val letter: Char
    letter = 'A'

    val flag: Boolean = true

    val text: String = "This is a sequence of caracters in Kotlin"

    println("Your Int Value is "+a)
    println("Your Double  Value is "+d)
    println("Your Float Value is "+f)
    println("Your Long Value is "+l)
    println("Your Short Value is "+s)
    println("Your Byte Value is "+b)

    println("Your Char Value is "+letter)

    println("Your Char Value is $letter")

    println("Your Boolean Value is $flag")

    println("Your String Value is $text")


    //////// arrays //////////

    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Hey!! I am array Example"+numbers[2])

    //////// Collection //////////

    val items = listOf(1, 2, 3, 4)

    println("First Element of our list----"+items.first())
    println("Last Element of our list----"+items.last())
    println("Even Numbers of our List----"+items.filter { it % 2 == 0 })   // returns [2, 4]

    val items2 = listOf("1", "2", 3, 4)
    for (i in items2) {
        println(i is String)
        println(i is Int)
    }

    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)
    println(numbersList)

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"


}