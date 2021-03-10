/**
 * the null safe in kotlin
 */
fun main(args: Array<String>) {

    // it is not possible to assign "null" to a variable by default in kotlin
    var str: String = "hello"
    //str = null // compile error


    var str2: String? = "hello"
    str2 = null  // now is possible

    println(str.length)
    //println(str2.length) // compile error
    println(str2?.length ?: 0) // if is null, return 0

    // java.lang.ClassCastException class java.lang.Integer cannot be cast to class java.lang.String
    val obj: Any = 123
    //val strOfNumber: String = obj as String

    // OK, return "null" is cast is not allowed.
    val strOfNumber2: String? = obj as? String
    println(strOfNumber2)


    var string: String? = "Hello!"
    // print(string.length) // Compile error

    if(string != null) { // smart cast
        println(string.length) // It works now!
    }

    // Smart cast
    val obj2: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj2 is String) {
        // No Explicit Casting needed.
        println("String length is ${obj2.length}")
    }
}