fun main(args: Array<String>) {
    var number = 1..20
    for (num in number){
        println(num)
    }
    var alphabet = 'A'..'Z'
    for (char in alphabet){
        println(char)
    }
    //use range to() instead of '..'
    var namba = 1.rangeTo(5)
    for (x in namba){
        println(x)
    }
    var number1 = 5.downTo(1)
    for (y in number1){
        println(y)
    }
    var OneToTen = 10..50
    var even = OneToTen.step(10)
    for (w in even){
        println(w)
    }
}