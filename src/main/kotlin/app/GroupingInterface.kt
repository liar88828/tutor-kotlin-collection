package app

fun main() {
	val list = listOf<String>("a", "a", "b", "b", "c", "c", "c")
	val grouping: Grouping<String, String> = list.groupingBy { it }
	println(grouping.eachCount())
	println(grouping.fold("") { first, second -> first + second })
	println(grouping.reduce { key, first, second -> first + second })
	println(grouping.aggregate { key, first: String?, second, isFirst ->
		if (isFirst) second
		else first + second
	})
}