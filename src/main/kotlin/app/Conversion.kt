package app

fun main() {
	val array = arrayOf(6, 4, 6, 7, 8, 9, 6, 4, 3, 2)
	val range = 1..100

	val list = array.toList()
	val set = array.toSet()

	val mutableSet = range.toMutableSet()
	val mutableList = range.toMutableList()

	val listToMutableList = list.toMutableList()
	val setToMutableSet = set.toMutableSet()

	val sortedSet = array.toSortedSet()

	println(sortedSet)

}