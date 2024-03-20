fun main(args: Array<String>) {
    for (n in 1..5){
        println("before continue, loop $n")
        if (n==2||n==4)
            continue
        println("after continue, loop $n")
    }
    for (m in 1..10){
        println("before break, loop $m")
    if (m==5)
        println("Terminating the loop.....")
        break
    }
    for (z in 'a'..'z'){
        println("before break loop $z")
        if (z == 'q'){
            println("Terminating the loop $z")
        }
    }


}