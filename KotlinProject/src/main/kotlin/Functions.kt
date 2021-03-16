

fun main(args: Array<String>) {
    println(MyFunction("tutorialsPoint.com"))

    // example of a lambda function
    // In the above code, we have created our own lambda known as “mylambda”
    // and we have passed one variable to this lambda
    // mylambda receives a string a do not return a value
    // if the code returns no value we use the type Unit:
    val mylambda : (String) -> Unit  = { s:String -> println(s)}

    mylambda("TutorialsPoint.com")

    myFun("TutorialsPoint.com", mylambda) //passing lambda as a parameter of another function

    // receive a String and return a boolean
    val mylambda2 : (String) -> Boolean  = { nome -> nome.length >= 6}

    println( mylambda2("teste") )

    // Kotlin will understand that this lambda is of type (String) -> Boolean
    val mylambda3 = { nome: String -> nome.length >= 6}

    println( mylambda3("teste") )
}

/**
 * Example of simple function
 */
fun MyFunction(x: String) : String {
    var c:String  = "Hey!! Welcome To : "
    return (c+x)
}


fun myFun(a :String, action: (String)->Unit) { //passing lambda
    print("Heyyy!!!")
    action(a)// call to lambda function
}