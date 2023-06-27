package app

fun main() {
	val number: List<Int> = listOf(1, 12, 3, 4, 5, 6, 7, 12, 89, 908, 7, 6)
	println(number.sorted())
	println(number.sortedDescending())
}