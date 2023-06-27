package app

fun main() {
	val list = listOf("Eko", "Kurniawan", "Khannedy")
	val list2 = list.filter { it.length > 5 }
	println(list)
	println(list2)
	val list3 = list.filterIndexed { index: Int, v: String -> index % 2 == 0 }
	println(list3)

	val list4: List<Any?> = listOf(null, 1, "Eko", "kurniawan", 2, null)
	val listString = list4.filterIsInstance<String>()
	val listInt = list4.filterIsInstance<Int>()
	val listNotNull = list4.filterNotNull()
	println(listString)
	println(listInt)
	println(listNotNull)
}