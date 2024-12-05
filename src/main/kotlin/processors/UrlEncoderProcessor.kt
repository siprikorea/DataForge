package org.siprikorea.processor

import org.siprikorea.DataProcessor
import java.net.URLEncoder

class UrlEncoderProcessor : DataProcessor {
    @Throws(Exception::class)
    override fun process(inputs: List<ByteArray>, options: Map<String, String>): List<ByteArray> {
        return inputs.map { byteArray ->
            URLEncoder.encode(String(byteArray), options["charset"]).toByteArray()
        }
    }
}