package dp

abstract class Car {
    abstract val power: Int
    abstract val speed: Int
    abstract fun getPrice(): String
}

interface CarFactory{
    fun theMostExpensiveCar(): Car
    fun theCheapestCar(): Car
}

class Tesla(power: Int, speed: Int) : Car() {
    override val power = power
    override val speed = speed
    override fun getPrice(): String {
        return "${((power * speed) / 10)}m"
    }
}

class Honda(power: Int, speed: Int) : Car() {
    override val power = power
    override val speed = speed
    override fun getPrice(): String {
        return "${((power * speed) / 10)}m"
    }
}

class ElectronicFactory(): CarFactory  {
    override fun theMostExpensiveCar(): Car {
        return Tesla(9, 250)
    }

    override fun theCheapestCar(): Car {
        return Tesla(2, 120)
    }
}

class MechanicaFactory(): CarFactory{
    override fun theMostExpensiveCar(): Car {
        return Honda(11, 350)
    }

    override fun theCheapestCar(): Car {
        return Honda(3, 180)
    }
}

fun main() {
    val theElectronicMostExpensive = ElectronicFactory().theMostExpensiveCar().getPrice()
    val theElectronicCheapestCar = ElectronicFactory().theCheapestCar().getPrice()

    val theMechanicaMostExpensive = MechanicaFactory().theMostExpensiveCar().getPrice()
    val theMechanicaCheapestCar = MechanicaFactory().theCheapestCar().getPrice()

    println("electronic car -> the most expensive is ${theElectronicMostExpensive} and the cheapest is ${theElectronicCheapestCar}")
    println("mechanica car -> the most expensive is ${theMechanicaMostExpensive} and the cheapest is ${theMechanicaCheapestCar}")
}



