package typeSystem

//Null Safe 연산자를 사용해 간결하게 표현.
fun printAllCars(s: String?) {
    val allCars: String? = s?.toUpperCase()
    println(allCars)
}

fun main(args: Array<String>) {
    printAllCars("CarA")
    printAllCars(null)
    printAllCars("CarB")
}