/**
 * First Class in Koltin
 */
class ClassHelloWorld {

    private var name: String = "Kotlin "

    fun printMe() {
        println("What is the best programming language: "+name)
    }
}

/**
 * First interface in Kotlin
 */
interface Human {
    fun think()
}


/**
 * Classe with primary constructor
 */
class Person(val firstName: String, var age: Int) {
    var message:String  = ""

    // Secondary constructor
    constructor(firstName : String , age :Int , message :String) : this( firstName, age) {
        this.message = message;
    }

}

/**
 * This type of class can be used to hold the basic data apar
 * All the data classes need to have one primary constructor and all the primary constructor
 * should have at least one parameter. Whenever a class is marked as data, we can use some
 * of the inbuilt function of that data class such as “toString()”,”hashCode()”,
 */
data class Book(val name: String, val publisher: String, var reviewScore: Int)


/**  A sealed class can have its own subclass but all those subclasses need
 *  to be declared inside the same Kotlin file along with the sealed class.
 */
sealed class MyExample {
    class OP1 : MyExample()
    class OP2 : MyExample()
}


fun main(args: Array<String>) {

    val obj = ClassHelloWorld() // create obj object of myClass class
    obj.printMe()

    // creating an instance of the interface
    var programmer :Human = object:Human {
        override fun think() { // overriding the think method
            println("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()

    val person1 = Person("TutorialsPoint.com", 15)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")

    val person2 = Person("TutorialsPoint.com", 15, "using secondary constructor")
    println("First Name = ${person2.firstName}")
    println("Age = ${person2.age}")
    println("Message = ${person2.message}")


    val book: Book = Book("Kotlin", "TutorialPoint.com", 5)
    println("Name of the Book is: "+book.name) // "Kotlin"
    println("Puclisher Name: "+book.publisher) // "TutorialPoint.com"
    println("Review of the book is: "+book.reviewScore) // 5
    book.reviewScore = 7
    println("Printing all the info all together: "+book.toString())
    println("Example of the hashCode function: "+book.hashCode())

}