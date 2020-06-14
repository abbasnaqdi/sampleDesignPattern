package dp

interface Car {
    fun getInstance(): Car
    fun getHash(): String
}

object Tesla : Car {
    override fun getInstance(): Tesla {
        return this
    }

    override fun getHash(): String {
        return this.hashCode().toString()
    }
}

object Honda : Car {
    override fun getInstance(): Honda {
        return this
    }

    override fun getHash(): String {
        return this.hashCode().toString()
    }
}

object CarFactory {
    fun getTeslaCar() = Tesla.getInstance()
    fun getHondaCar() = Honda.getInstance()
}

fun main() {
    val tesla = CarFactory.getTeslaCar()
    val honda = CarFactory.getHondaCar()

    println("tesla -> ${tesla.getHash()}")
    println("honda -> ${honda.getHash()}")
}
