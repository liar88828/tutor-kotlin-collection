package app

fun main() {
//	val number = listOf<Number>(1,2,3,4,5,6,7,8,9,10)
	val number = (1..10).toList()
	println(number.windowed(3, 1, true))
	println(number.windowed(3, 1, true) { it.size })
	println(number.windowed(3, 1, false))
	println(number.windowed(3, 1, false) { it.size })
	println()
	println(number.windowed(3, 2, true))
	println(number.windowed(3, 2, true) { it.size })
	println(number.windowed(3, 2, false))
	println(number.windowed(3, 2, false) { it.size })
}