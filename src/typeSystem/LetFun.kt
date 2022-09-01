package typeSystem

// let과 안전연산자 ?.dmf 사용해 null 객체를 다룰 때 좀 더 간결해지는 예제이다.
fun sendEmailTo(email: String) {
    println("Sending email to $email") // $는 받은 email 정보를 가져옴
}

fun main(args: Array<String>) {
    var email: String? = "ex@email.com" // ?를 붙이면서 nullable 함을 알림
    // email이 null이 아닐 경우, let의 람다로 전달되어 sendEmailTo 함수가 호출된다.
    email?.let { sendEmailTo(it) } // it == email
}