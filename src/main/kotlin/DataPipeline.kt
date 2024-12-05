package org.siprikorea

class DataPipeline(private val processors: List<DataProcessor>) {
    fun execute(inputs: List<ByteArray>): List<ByteArray> {
        var current = inputs
        for (processor in processors) {
            current = processor.process(current, HashMap())
        }
        return current
    }
}
