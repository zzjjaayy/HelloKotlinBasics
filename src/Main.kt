
//COPY OF LIST DECLARATION TO FACILITATE USING IT AS A PARAM IN INVOKING A FUNCTION
val list1 = listOf("item1", "item2", "item3")

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
            // "$dad1" is used to display the value of the variable dad1 {Known as String Template}
            //it is used as an substitute to String concatenation when only values are to displayed

            else -> println()// similar to default case in switch statements in JAVA
        }

        //EXAMPLE 2
        val dad2 = when(dad1){
            null -> "Empty" //sets the value to "Empty"
            else -> "HEHE" //default case
        }

        // INVOKING THE getGreeting FUNCTION
        println(getGreeting())

        // INVOKING THE getGreeting2 FUNCTION
        println(getGreeting2())

        // INVOKING THE sayHello FUNCTION
        println(sayHello("jay")) // accepts one parameter

        // INVOKING THE greeting FUNCTION
        println(greeting("Hello", "jay")) // accepts two parameters

        // INVOKING THE helloFromList FUNCTION
        println(helloFromList("Hello", list1 ))
    }

/**
 * FUNCTIONS
 * NOTE : the functions those are not associated with any class are known as Top-Level Functions
 */

    //EXAMPLE 1
    fun getGreeting() : String {
        //this is how a basic function looks like
        // fun keyword shows that it is a new function
        // getGreeting is the name of the function
        // String is the return type
        //{By default the return type is "Unit" which basically means returns nothing useful}

        return "anything" // returns the value
    }

    // EXAMPLE 2
    fun getGreeting2() = "anything"
    //Alternative method to declare a function
    // generally used for short function declarations
    // the function returns a String "anything"

    //EXAMPLE 3
    fun sayHello(name:String) {
        print("Hello $name")

        //"name" is the name of the parameter
        //String is the data type of the parameter
    }

    //EXAMPLE 4
    fun greeting(greet:String, name:String) {
        print("$greet $name")

        //takes in two parameters
    }

/**
 * COLLECTIONS & LOOPS
 */

    fun collections() {

        //ARRAY
        val array1 = arrayOf("Value1", "Value2", "Value3")
        // created an array of Strings

        println(array1.size) //displays size of array "3"
        println(array1[0]) // displays value at index 0

        for (item in array1) {
            println(item)
        }
        // A for-loop that displays all items in an array
        // item is a specific item in the array
        // array1 is the target array whose items are being displayed

        array1.forEach{item ->
            println(item)
        }
        // This is a Lambda Function which does the same job as the previous
        // for-loop.
        // we specify the name of the placeholder of single item in th array.
        // here the placeholder name is "item".

        array1.forEachIndexed {index, item ->
            println("$item at index : $index")
        }
        //this function keeps a track of the index at which the item is.

        //LIST
        val list1 = listOf("item1", "item2", "item3")
        list1.forEachIndexed {index, item ->
            println("$item at index : $index")
        }

        //MUTABLE LIST
        val list2 = mutableListOf("item1", "item2", "item3")
        list2.add("item4")

        //MAP
        val map1 = mapOf(1 to "a", 2 to "b", 5 to "e")
        // map is collection with key and value pairs
        map1.forEach {key, value ->
            println("$key -> $value")
        }

        //MUTABLE MAP
        val map2 = mutableMapOf(1 to "a", 2 to "b", 5 to "e")
        map2.put(3, "c") // it can also be written as " map2[3] = "c" "

    }

    //EXAMPLE : Function showing usage of list to display data
    fun helloFromList(greet:String, itemsToGreet:List<String>) {
        itemsToGreet.forEach {item ->
            println("$greet $item")
        }
    }
