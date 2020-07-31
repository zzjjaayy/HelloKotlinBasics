
val dad : String = "HEHE"
//Top-Level variable {can be accessed from any function or class}
//Can be accessed from other files too if it is public

val dad1 : String? = null
// the question mark sign after the data type shows that the variable is nullable

fun main() {
    print("jay")//displays text {NOT in a new line}
    println("jay")//displays text {in a new line}

    /**
     * VARIABLES
     */

    val number : Int = 5
    //val means value which is a variable whose value CANNOT be changed
    //number is the name of the variable
    //"Int" is the data type of the variable {NOT NECESSARY ALWAYS}
    //"5" is the value of the variable

    var num1 : Int = 6
    num1 = 4
    // var is a variable whose value CAN be changed

    var name = "anything"
    //Kotlin supports type inference {NO NEED TO SPECIFY TYPE}
    //type needs to be specified if we want a nullable variable

    /**
     * CONTROL FLOW STATEMENTS
     * */

    // IF-ELSE Statements
    if(dad1 != null) {
        println(dad1)
    } // prints the value of "dad1" if it isn't null
    else{
        println("Value not specified")
    }
    //OR
    if(dad1 != null) println(dad1) else println("Value not specified")
    //This is a more concise way of writing a if-else statement


    //WHEN Statements {Similar to switch statements in JAVA}
    //EXAMPLE 1
    when (dad1) {
        null -> print("Value is null")
        "jay" -> print("Value is $dad1")
        // "$dad1" is used to display the value of the variable dad1
        //it is used as an substitute to String concatenation when only values are to displayed

        else -> println()// similar to default case in switch statements in JAVA
    }

    //EXAMPLE 2
    val dad2 = when(dad1){
        null -> "Empty" //sets the value to "Empty"
        else -> "HEHE" //default case
    }



}