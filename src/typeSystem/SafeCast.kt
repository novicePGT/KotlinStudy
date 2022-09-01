package typeSystem

// 안전한 캐스트 연산자를 이용한 equals 구현 패턴
// 보통 안전한 캐스트를 사용할 때, 뒤에 엘비스 연산자를 사용하는 패턴을 자주 사용한다.

class SafePerson(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? SafePerson ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
         super.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val p1 = SafePerson("Dmitry", "Jemerov")
    val p2 = SafePerson("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
}