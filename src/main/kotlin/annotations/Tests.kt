package annotations

import junit.framework.Assert.assertEquals
import org.junit.Test

class Tests {
    @get:Rule val tempFolder = TemporaryFolder()

    @Test
    fun simple() {
        val f = tempFolder.newFile()
        assertEquals(42, getTheAnswer())
    }

    private fun getTheAnswer(): Int {
        return 42
    }
}