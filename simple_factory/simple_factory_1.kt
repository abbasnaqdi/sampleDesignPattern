package dp

interface Car {
    fun gogo(): Tesla
}

object Tesla : Car {
    override fun gogo(): Tesla {
        return this
    }
}

object CarFactory {
    fun makeTeslaCar(): Tesla {
        return Tesla.gogo()
    }
}Ï

fun main() {
    val tesla = CarFactory.makeTeslaCar()
}
