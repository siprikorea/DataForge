package org.siprikorea

interface DataProcessor {
    @Throws(Exception::class)
    fun process(inputs: List<ByteArray>, options: Map<String, String>): List<ByteArray>
}
