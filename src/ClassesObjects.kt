fun main(args: Array<String>) {
    var car1 =Car("Ford","Mustang", 1960)
//    car1.model = "Ford"
//    car1.brand = "Mustang"
//    car1.year = "1960"
    println(car1.model)
    println(car1.brand)
    println(car1.year)
    var car2 = Car("Subaru","Forester",2008)
//    car2.model = "Subaru"
//    car2.brand = "Forester"
//    car2.year = "2008"
    println(car2.model)
    println(car2.brand)
    println(car2.year)
    var bulb1 =Bulb()
    bulb1.turnOn()
    println( bulb1.displayLightStatus("bulb1"))
    bulb1.turnOff()
    println(bulb1.displayLightStatus("bulb1"))
    var bulb2 =Bulb()
    bulb2.turnOn()
    println( bulb2.displayLightStatus("bulb2"))
    bulb2.turnOff()
    println(bulb2.displayLightStatus("bulb2"))
    val person1 = Person("Trevor",23)
    person1.canVote(25)
    val person2 = Person("Larry",14)
    person2.canVote(14)
    val person3 = Person("Barasa",27)
    person3.canVote(27)
    val person4 = Person("Mbula",13)
    person4.canVote(13)
}
class Car(var model:String,var brand:String, var year: Int){
    //body
    //data variables
//    var model =""
//    var brand =""
//    var year =""
    //functions(methods)
}
class Bulb{
    var isOn:Boolean=false
    fun turnOn(){
        isOn=true
    }
    fun turnOff(){
        isOn=false
    }
    fun displayLightStatus(bulb:String){
        if (isOn==true){
            println("The $bulb is ON")
        }else{
            println("The $bulb is OFF")
        }
    }
}
class Person(var name: String, var age: Int){
    fun canVote(age:Int){
        if (age<18){
            println("Can not vote")
        }else{
            println("Can vote")
        }
    }
}