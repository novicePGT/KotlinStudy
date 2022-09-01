package typeSystem

fun ignoreNulls(s: String) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}