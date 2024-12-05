package model

class ModelDataProcManager {

    companion object {
        val processors = ArrayList<ModelDataProc>()

        init {
            processors.add(ModelDataProcBase64Encoder())
            processors.add(ModelDataProcHexEncoder())
            processors.add(ModelDataProcUrlEncoder())
        }
    }
}