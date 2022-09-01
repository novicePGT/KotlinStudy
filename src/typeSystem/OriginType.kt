package typeSystem

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 25)
    println("We're ${percent}% done!")
}

//fun main(args: Array<String>) {
//    var value: Int = 120
//    showProgress(value)
//}