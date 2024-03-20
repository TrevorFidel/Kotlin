fun main(args: Array<String>) {
    println(birthdayGreeting("Andrew", 43,"Beatrice"))
    println(birthdayGreeting("Trevor",45,"Fidel"))
    println(birthdayGreeting("Larry", 18, "Lincoln"))
    println(welcome("Cecilia", "Syokimau"))
    println(area(56))
    println(area(43))
    println(BMI())
    println(BMI(3.4, 76.4))
}
fun birthdayGreeting(name: String,age: Int, first:String): String{
    val m = "Happy Birthday $name"
    val n = "You are $age years old"
    val o = "Regards from $first"
    return "$m\n$n\n$o"
}
fun welcome(name:String,location:String):String{
    val z = "$name you are welcomed to $location"
    return "$z"
}
fun area(radius:Int,pi:Double=3.14): String{
    val k ="The area is "
    val j = pi*radius*radius
    return "$k $j"
}
fun BMI(height:Double=1.7, weight:Double=54.3):String{
    val p ="Your BMI is"
    val b = weight/ (height*height)
    return "$p $b"

}