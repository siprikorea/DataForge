package model

import java.util.*
import kotlin.jvm.Throws

class ModelDataProcBase64Encoder : ModelDataProc {
    override val name: String
        get() = "Base64 Encoder"

    @Throws(Exception::class)
    override fun process(inputs: List<ByteArray>, options: Map<String, String>): List<ByteArray> {
        return inputs.map { byteArray ->
            if (options["mode"] == "encode") {
                Base64.getEncoder().encode(byteArray)
            } else {
                Base64.getDecoder().decode(byteArray)
            }
        }
    }
}