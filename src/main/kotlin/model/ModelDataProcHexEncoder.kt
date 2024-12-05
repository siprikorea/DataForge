package model

import org.bouncycastle.util.encoders.HexEncoder
import java.io.ByteArrayOutputStream
import kotlin.jvm.Throws

class ModelDataProcHexEncoder : ModelDataProc {
    override val name: String
        get() = "Hex Encoder"

    @Throws(Exception::class)
    override fun process(inputs: List<ByteArray>, options: Map<String, String>): List<ByteArray> {
        return inputs.map { byteArray ->
            if (options["mode"] == "encode") {
                val output = ByteArrayOutputStream()
                HexEncoder().encode(byteArray, 0, byteArray.size, output)
                output.toByteArray()
            } else {
                val output = ByteArrayOutputStream()
                HexEncoder().decode(byteArray, 0, byteArray.size, output)
                output.toByteArray()
            }
        }
    }
}