package app

fun main() {
	val list = listOf<String>("Eko", "Kurniawna", "Khannedy")
	println(list.any { it.length > 5 })
	println(list.none { it.length > 5 })
	println(list.all { it.length > 2 })
	println(list.any())
	println(list.none())
	println(list.isEmpty())
}