/**
 * By default kotlin classes are final.
 * we need to add "open" to allow Inheritance
 */
open class Employee(name: String, age: Int, salary: Float) {

    // like classes and methods, variable are final by default
    open val x = 10

    // like classes, methods are final by default
    open fun socialLife() {
        println("Is good")
    }
}

/**
 *  interface in Kotlin contains abstract method declarations as well as *** implementation of method. ***
 */
interface Java {
    fun sayHello() {
        println("Java is good")
    }
}

interface Kotlin {
    fun sayHello() {
        println("Kotlin is good")
    }
}

interface C {
    fun sayHello() {
        println("C is good")
    }
}

class Programmer(name: String, age: Int, salary: Float): Employee(name,age,salary), C, Java, Kotlin {

    override var x = 10

    fun foo() {
        println("x is equal to " + x)
    }

    // override a method in kotlin
    override fun socialLife() {
        println("Is bad")
    }

    override fun sayHello() {
        // To solve the above problem we need to specify particular method of interface which we are calling
        super<Kotlin>.sayHello()
    }
}



fun main(args: Array<String>) {
    val p = Programmer("Jadson", 38, 50000.00f)
    p.foo()
    p.socialLife()
    p.sayHello()
}