package dp

interface Car {
	fun getPrice(): Int
}

interface Factory{
	fun getCar(): Car
}

class Tesla : Car {
	override fun getPrice(): Int {
		return 4
	}
}

class Honda : Car {
	override fun getPrice(): Int {
		return 3
	}
}

class HondaFactory: Factory {
	override fun getCar() : Honda{
		return Honda()
	}
}

class TeslaFactory: Factory {
	override fun getCar() : Tesla{
		return Tesla()
	}
}

fun main() {
	val teslaHash = TeslaFactory().getCar().getPrice()
	val hondaHash = HondaFactory().getCar().getPrice()

	println("tesla -> $teslaHash m")
	println("honda -> $hondaHash m")
}
