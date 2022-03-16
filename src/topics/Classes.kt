package topics

fun main() {
    val child = Person("Child", "Child",1)
    val p1 = Person("Tom", "Jones", 35)
    print(p1.firstName)

    val rec1 = Rectangle(5.0,2.0)
    println("Perimeter is ${rec1.prime}")

    val rec2 = Rectangle(5.0,2.0)
    println("Perimeter is ${rec2.prime}")

    println(rec1==rec2) //true

}

//Primary Constructor - первичный конструктов
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child:Person): this(firstName,lastName,age) {
        children.add(child)
    }
    //конструкто без аргументов
    constructor(): this ("","",-1)
}

data class Rectangle(var height: Double, var length: Double) {
    var prime = (height + length) * 2

    var test = 1
        get() = field + 1 //this.none
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height + length

}