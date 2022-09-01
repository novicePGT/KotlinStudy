package typeSystem

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor: Processor<Unit> {
    override fun process() { // Unit을 반환하지만 타입을 저장할 필요는 없음.
        TODO("Not yet implemented")
        // Unit == Void, return을 명시 할 필요가 없다.
    }
}