fun main(args: Array<String>) {
    //data structure
    var arr = arrayOf(10, 23.6,"John", 'W')
    var arr1 = arrayOf<Int>(12,24,54,67,879)
    var aar2 = arrayOf<String>("Trevor","John",)
    // modifying a value within array
    var fruits = arrayOf("Oranges","Pineapples", "Mangoes")
    println(fruits[2])
    fruits[2] = "Apples"
    println(fruits[2])
    // Modify arrays using set function
    var names = arrayOf("Cecilia", "Larry", "Wainaina", "Francis")
    names.set(2,"Andrew")
    println(names[2])
    names.set(3,"Trevor")
    println(names[3])

    // value using get function
    var browsers = arrayOf("Firefox", "Safari", "Chrome", "Brave", "Edge")
    println(browsers[2])
    println(browsers.get(2))
    println(browsers.get(4))
}