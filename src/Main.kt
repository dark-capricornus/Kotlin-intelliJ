fun main() {
    val userName ="Harish" // string
    val age = 20 //Integer

    println("Hello $userName,\nYour age is $age")

    //    var number = 2147483647

    val minIntegerValue :Int =Int.MIN_VALUE
    val maxIntegerValue :Int =Int.MAX_VALUE

    println("$minIntegerValue to $maxIntegerValue")  // See the output for the min and max value of integer

    val minByteValue:Byte =Byte.MIN_VALUE
    val maxByteValue :Byte =Byte.MAX_VALUE

    println("$minByteValue to $maxByteValue") // min and max Byte value

    val minShortValue:Short =Short.MIN_VALUE
    val maxShortValue:Short =Short.MAX_VALUE

    println("$minShortValue to $maxShortValue") // max and min short value

    val minLongValue:Long =Long.MIN_VALUE
    val maxLongValue:Long =Long.MAX_VALUE

    println("$minLongValue to $maxLongValue") // min and max long

    val myNumber  = 2.5f //float type variable
    val mySecondNumber = 2.5 //double
    println("myNumber = $myNumber and mySecondNumber = $mySecondNumber")

    val myCharValue : Char = 'H' // for single character use "char" keyword
    val myBoolean : Boolean = true // or simply val myBoolean = "true" shall be used

    print("character : $myCharValue and Boolean : $myBoolean ") // or "$myCharValue" can be used.

}