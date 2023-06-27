package app

fun main() {
	val list = listOf<String>("a", "b", "c", "a", "c", "b", "d", "aa", "bb", "cc", "abc")
	val map: Map<String, List<String>> = list.groupBy { value -> value }
	println(map)

	val map2: Map<Int, List<String>> = list.groupBy { it.length }
	println(map2)

	val grouping: Grouping<String, String> = list.groupingBy { it }
	println(grouping)
}