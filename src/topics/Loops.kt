package topics

fun main() {

    //for each
    val items = listOf("apple", "banana", "orange")
    //mogno menat
    var itemsMutable = mutableListOf("apple", "banana", "orange")

    for (item in items)
        println(item)

    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    //Diapazon

    println(5 in 3..10) //true

    for (i in 1..10)
        println(i)

    for (i in 1 until 10) // не включает 10
        println(i)

    for (i in 10 downTo 1) //обратный порядок
        println(i)

    for (i in 1..10 step 3)
        println(i)

}