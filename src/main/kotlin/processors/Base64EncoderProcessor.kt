package org.siprikorea.processor

import org.siprikorea.DataProcessor
import java.util.*
import kotlin.jvm.Throws

class Base64EncoderProcessor : DataProcessor {
    @Throws(Exception::class)
    override fun process(inputs: List<ByteArray>, options: Map<String, String>): List<ByteArray> {
        return inputs.map { byteArray ->
            Base64.getEncoder().encode(byteArray)
        }
    }
}