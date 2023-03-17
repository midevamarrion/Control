
fun main() {
    number(12)
println(maneno(arrayOf("Mario","angel","Nakakande","violet","Yvonne")))
    robot(4)
    robot(13)
    robot(20)
    nambari()
    println(mixedTypes(arrayOf(2.5,56.8,"Hello",34,50,1.55,10,true,)))
}
//Write a function that takes in an array of mixed types and returns the sum of the decimal element
fun mixedTypes(num:Array<Any>):Double{
    var sentence = 0.00
    for (x in num) {
        if (x is Double) {
            sentence +=x
        }
    }
    return sentence
 }

//Create a function that prints out all the odd numbers between 1 and 100
fun number(num:Int) {
    for (num in 1..100)
        if (num % 2 != 0) {
            println("$num odd")
        }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun maneno(names:Array<String>) :Int{
    var x = 0
    for (y in names) {
if (y.length>5){
    x++
}
    }
    return x
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.

fun robot(age:Int) {
    when (age) {
        in 0..5 -> println("take milk")
        in 7..14 -> println("take bottle of fanta orange")
        else -> println("take a bottle of coca Cola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun nambari() {
    for (num in 1..100)
        if (num%5==0 &&num%3==0) {
            println("FizzBuzz")
        }
        else if (num%3 == 0) {
            println("Fizz")
        }
    else if (num%5==0){
println("Buzz")
        }
    else{

    println(num)

    }

    }



