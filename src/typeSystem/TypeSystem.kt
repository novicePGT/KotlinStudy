
// Null이 올 수 있는 타입을 넣을 경우 컴파일 에러를 발생시켜 NPE를 방지.
fun stringLen(s: String) = s.length
fun stringLenNullable(s: String?) = s?.length

fun main(args: Array<String>) {
//    stringLen(null)
    stringLenNullable(null)
}