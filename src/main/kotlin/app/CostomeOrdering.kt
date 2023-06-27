package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
	val fruits: List<Fruit> = listOf(
		Fruit("Apple", 10), Fruit("Banana", 9), Fruit("Orange", 7), Fruit("Avocado", 6)
	)
//	println(fruits.sortedBy { fruit: Fruit -> fruit.name })
	println(fruits.sortedBy { it.name })
	println(fruits.sortedBy { it.quantity })
	println()
	println(fruits.sortedByDescending { it.name })
	println(fruits.sortedByDescending { it.quantity })
	println()
	println(fruits.sortedWith { fruit1, fruit2 ->
		fruit1.quantity.compareTo(fruit2.quantity)
	})
	println(fruits.sortedWith(compareBy { it.quantity }))
}