fun main(args: Array<String>) {
val child1 = Child()
    child1.myFunction()
    val dog1 = Dog("Black",6)
    dog1.woof()
    val cow1 = Cow("White",3)
    cow1.moo()
    val cat1 = Cat("White",2)
    cat1.miaw()
    val bird1 = Bird("Yellow",4)
    bird1.chirps()
}
open class Parent{
    val x = 5
}
class Child:Parent(){
    fun myFunction(){
        println(x)
    }
}
open class Animal(color:String,age:Int){
    init{
        println("Color is: $color")
        println("Age is: $age")
    }
}
class Dog(color: String,age: Int):Animal(color, age){
    fun woof(){
        println("Dog makes a sound woof")
    }
}
class Cow(color: String,age: Int):Animal(color,age){
    fun moo(){
        println("Cow makes a sound moo")
    }
}
class Cat(color: String,age: Int):Animal(color,age){
    fun miaw(){
        println("Cat makes a sound miaw")
    }
}
class Bird(color: String,age: Int):Animal(color, age){
    fun chirps(){
        println("Bird makes as sound chirps")
    }
}