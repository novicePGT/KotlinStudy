package typeSystem

import org.junit.Before
import org.junit.Test

class LateinitEx {
    fun performAction(): String = "foo"
}
// lateinit을 사용해 늦은 초기화를 할 수 있다.
class MyTest {
    private lateinit var myLateinitEx: LateinitEx

    @Before
    fun setUp() {
        myLateinitEx = LateinitEx()
    }

    @Test
    fun testAction() {
        myLateinitEx.performAction()
    }
}