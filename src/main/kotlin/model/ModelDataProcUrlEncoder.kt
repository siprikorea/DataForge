package model

import java.net.URLDecoder
import java.net.URLEncoder

class ModelDataProcUrlEncoder : ModelDataProc {
    override val name: String
        get() = "Url Encoder"

    @Throws(Exception::class)
    override fun process(inputs: List<ByteArray>, options: Map<String, String>): List<ByteArray> {
        return inputs.map { byteArray ->
            if (options["mode"] == "encode") {
                URLEncoder.encode(String(byteArray), options["charset"]).toByteArray()
            } else {
                URLDecoder.decode(String(byteArray), options["charset"]).toByteArray()
            }
        }
    }
}