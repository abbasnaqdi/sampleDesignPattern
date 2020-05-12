package dp

enum class CarType(){
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
        return (power * speed).toString()
    }
}

class Honda(power: Int, speed: Int) : Car() {
    override val power = power
    override val speed = speed
    override fun goScore(): String {
        return (power * speed).toString()
    }
}

class CarFactory(){
    fun getCar(type: CarType): Car{
        return if(type == CarType.ELECTRONIC) 
        Tesla(1000, 200)
        else Honda(1000, 360)
    }
}

fun main() {
    val electronicCar = CarFactory().getCar(CarType.ELECTRONIC)
    val mechanicaCar = CarFactory().getCar(CarType.MECHANICA)

    println(electronicCar.goScore())
    println(mechanicaCar.goScore())
}
