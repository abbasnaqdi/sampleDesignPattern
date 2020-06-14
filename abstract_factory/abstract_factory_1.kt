package dp

interface Car {
    fun getStartPower(): Int
}

interface Driver{
    fun getLevel(): Int
}

interface RaceFactory{
    fun getCar(): Car
    fun getDriver(): Driver
}

class Tesla : Car {
    override fun getStartPower(): Int {
        return 50
    }
}

class Honda : Car {
    override fun getStartPower(): Int {
        return 70
    }
}

class Professional: Driver{
    override fun getLevel(): Int{
        return 6
    }
}

class TeslaRaceFactory : RaceFactory {
    override fun getCar(): Car {
        return Tesla()
    }

    override fun getDriver(): Driver{
        return Professional()
    }
}

class HondaRaceFactory : RaceFactory {
    override fun getCar(): Car {
        return Honda()
    }

    override fun getDriver(): Driver{
        return Professional()
    }
}

fun main() {
    val tesla = TeslaRaceFactory()
    val honda = HondaRaceFactory()

    println("speed tesla -> ${tesla.getCar().getStartPower() * tesla.getDriver().getLevel()}km")
    println("speed honda -> ${honda.getCar().getStartPower() * honda.getDriver().getLevel()}km")
}
