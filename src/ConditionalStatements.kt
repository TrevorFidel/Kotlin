fun main(args: Array<String>) {
//    var num = -100
//    if(num<0){
//        println("This is a negative number")
//    }else{
//        println("This is a positive number")
//    }
//    var age = 17
//    if(age<10){
//        println("You are primary")
//    }
//    else if(age>10&&age<=14){
//        println("You are in Junior Secondary")
//    }
//    else if(age>=15&&age<=18){
//        println("You are in Senior Secondary")
//    }
//    else if(age>=19&&age<=25){
//        println("You are in Tertiary Institution")
//    }
//    else{
//        println("You should be out of school already")
//    }
//
//// WHEN STATEMENT
//    var letter = 'o'
//    when(letter){
//        'a'-> println("a is a vowel")
//        'e' -> println("b is vowel")
//        'i' -> println("i is a vowel")
//        'o' -> println("o is a vowel")
//        'u' -> println("u is a vowel")
//
//        else -> println("$letter is consonant")
//    }
//    var number = 3
//    when(number){
//        1-> println("Too bad, you failed the game")
//        2-> println("Wow, you almost got the number")
//        3-> println("Congratulations you are the winner ")
//
//        else -> println("$number is invalid.Try again")
//    }
    var Height = 50
    var weight = 89
    var BMI = Height/weight
    println(BMI)
    if (BMI<18){
        println("You are underweight")
    }
    else if(BMI>=18&&BMI<=24){
        println("you are normal")
    }
    else if(BMI>=25&&BMI<=30){
        println("you are overweight")
    }
    else{
        println("you are obese")

    }

}