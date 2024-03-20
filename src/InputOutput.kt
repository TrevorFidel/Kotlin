import java.util.Scanner
fun main(args: Array<String>) {

    print("Please enter your name: ")
    var enteredString = readLine()
    println("You have entered the string $enteredString")

    println("Please enter a number ")
    var enteredNumber = Integer.valueOf(readLine())
    println("You have entered a number $enteredNumber")

    var read = Scanner(System.`in`)
    println("please enter an Integer ")
    var enteredInteger = read.nextInt()
    println("The integer entered is $enteredInteger")


    println("please enter a Float ")
    var enteredFloat = read.nextFloat()
    println("The integer entered is $enteredFloat")

    println("please enter your first lucky number ")
    var enteredInteger1 = read.nextInt()
    println("The integer entered is $enteredInteger1")

    println("please enter your second lucky number ")
    var enteredInteger2 = read.nextInt()
    println("The integer entered is $enteredInteger2")

    var lucky = enteredInteger1 * enteredInteger2
    println("Your ticket number is $lucky")

}