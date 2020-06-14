package dp

enum class CarType() {
    ELECTRONIC,
    MECHANICA
}

abstract class Car {
    abstract val power: Int
    abstract val speed: Int
    abstract fun goScore(): String
}

class Tesla(power: Int, speed: Int) : Car() {
    override val power = power
    override val speed = speed
    override fun goScore(): String {
        return "tesla score -> ${power * speed}"
    }
}

class Honda(power: Int, speed: Int) : Car() {
    override val power = power
    override val speed = speed
    override fun goScore(): String {
        return "honda score -> ${power * speed}"
    }
}

class CarFactory() {
    fun getCar(type: CarType): Car {
        return if (type == CarType.ELECTRONIC)
                Tesla(1000, 480)
        else Honda(1000, 360)
    }
}

fun main() {
    val electronicCar = CarFactory().getCar(CarType.ELECTRONIC)
    val mechanicaCar = CarFactory().getCar(CarType.MECHANICA)

    println(electronicCar.goScore())
    println(mechanicaCar.goScore())
}
