package typeSystem

fun elvis(s: String?) {
    // t가 null이면 결과는 elvis Type 임.
    val t: String = s ?: "elvis Type"
    println(t)
}

fun main(args: Array<String>) {
    elvis(null)
    elvis("abc")
}