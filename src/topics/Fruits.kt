package topics

fun main() {
    val fruit = arrayOf("Apple","Bannana","Cherry", "BlueVerry", "Pomegrante")
    val index = arrayOf(1, 3, 4, 2)
    var x = 0
    var y: Int
    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}