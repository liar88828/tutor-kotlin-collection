package app

fun main() {
//	val number =(1..10).toSet()
	val number = (1..10).toList()
	println(number.contains(5))
	println(number.containsAll(listOf(1, 2, 3)))
	println(number.containsAll(listOf(1, 2, 3, 11)))
	println(number.isEmpty())
	println(number.isNotEmpty())

}