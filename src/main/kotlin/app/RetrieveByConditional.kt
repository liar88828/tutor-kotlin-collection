package app

fun main() {
	val number = (0..20).toList()
	println(number.first { it > 10 })
	println(number.last { it > 10 })
	println(number.firstOrNull { it > 10 })
	println(number.find { it > 10 })
	println(number.lastOrNull { it > 10 })
	println(number.findLast { it > 10 })
}