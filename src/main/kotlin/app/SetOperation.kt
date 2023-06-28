package app

fun main() {
	val number1 = (1..10).toSet()
	val number2 = (6..15).toSet()

	println(number1.union(number2))
	println(number1.intersect(number2))
	println(number1.subtract(number2))
	println(number2.subtract(number1))

}