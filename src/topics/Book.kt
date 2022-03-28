package topics

fun main () {
    var x = 5000000000000000L
    var z: Int = x.toInt()
    println(z)

    var myArray = arrayOf(1,2,3)
    println(myArray.size)

    val wordArray1: Array<String> = arrayOf("Только сегодня","24 часа","Супер пупер", "Не пропустите")
    val wordArray2 = arrayOf("продажа","аренда","ремонт")
    val wordArray3 = arrayOf("автомобилей","помидоров","техники", "часов")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}