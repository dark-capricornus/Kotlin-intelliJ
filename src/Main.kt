fun main() {
    val userName : String ="Harish" // string
    var age : Int = 20 //Integer
    var number = 2147483647
    val minIntegerValue :Int =Int.MIN_VALUE
    val maxIntegerValue :Int =Int.MAX_VALUE

    val minByteValue:Byte =Byte.MIN_VALUE
    val maxByteValue :Byte =Byte.MAX_VALUE

    val minShortValue:Short =Short.MIN_VALUE
    val maxShortValue:Short =Short.MAX_VALUE

    val minLongValue:Long =Long.MIN_VALUE
    val maxLongValue:Long =Long.MAX_VALUE

    println("Hello $userName,\nYour age is $age")

    println("$minIntegerValue to $maxIntegerValue")  // See the output for the min and max value of integer

    println("$minByteValue to $maxByteValue") // min and max Byte value

    println("$minShortValue to $minShortValue") // max and min short value

    println("$minLongValue to $maxLongValue") // min and max long
}