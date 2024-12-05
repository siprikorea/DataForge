package model

interface ModelDataProc {
    val name: String

    @Throws(Exception::class)
    fun process(inputs: List<ByteArray>, options: Map<String, String>): List<ByteArray>
}

