package topics

fun main() {
println(testSimple2(3,10))
println(testString(x=10))
    testNamedArguments(3,4,5)
    testDafaultArguments(y=4)
    println(foo("John"))
    printEvent(1,2,3,4,5,6)
    printEvent(*intArrayOf(1,2,3,4,5,6,7,8),9,10) //* - разбивает массив на элементы
}

fun testSimple():Int {
    return 5+5
}

fun testSimple1(x:Int, y:Int):Int = x+y

fun testSimple2(x:Int, y:Int) = x+y //сам орпделяет тип возвращаемого значения

fun testString(x:Int):String {
    return "String is $x"
}

fun testNamedArguments(x:Int, y:Int, z:Int):List<Int> {
    return listOf(x,y,z)
}

fun testDafaultArguments(x: Int = 1, y: Int = 2) {
    println(x+y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false):String {
    return (if (toUpperCase) name.uppercase() else name) + number
}

//vararg
fun printEvent(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}