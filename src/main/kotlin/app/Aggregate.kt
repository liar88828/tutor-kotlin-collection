package app

fun main() {
	val numbers = (0..100).toList()
	println(numbers.max())
	println(numbers.min())
	println(numbers.average())
	println(numbers.sum())

//	println(numbers.sumBy { it/2 })// dependence/ tidak di support
	println(numbers.sumOf { it / 2 })
}