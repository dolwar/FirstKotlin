package topics

fun main() {
    var a: String = "Hello"
        //a = null //NPE исключены
    print(a.length)

    var b: String? = "Test" //? - может иметь значение null
    b = null
    //b.length // метод не сработает, т.к. может иметь null, те NullPointerException

    //вернет длину строки, если нулл, то вернет нулл
    b?.length //так работает safecall

    //bob?.departmant?.head?.name -> null - пример

    //Elvis оператор - ?: если нулл, то подставь значение после оператора
    var l = b?.length ?: -1

    b = if ((0..10).random() > 5) "asdf" else null
    //!! - выбрасывает NPE в случае если в переменной null
    val t = b!!.length



}