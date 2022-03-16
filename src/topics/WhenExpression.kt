package topics

fun main() {
    testWhen(1)
    testWhen("Hello")
}

fun testWhen(input: Any) { //Any - любой тип данных
    when (input) {
        1 -> println("Odin")
        2 -> println("Dva")
        in 10..20 -> println("От 10 до 20")
        is String -> println("Vvedena stroka ${input} длиной ${input.length}")
        else -> println("Что-то еще")
    }
}

