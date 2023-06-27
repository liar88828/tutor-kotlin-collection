package app

fun main() {
	val list = listOf<String>("Eko", "kurniawan", "Khannedy")
	val list2 = list + "Programmer"
	println(list2)

	val list3 = list + listOf("Programer", "Zaman", "Now")
	println(list3)

	val list4 = list - "Eko"
	println(list4)

	val list5 = list - listOf<String>("Eko", "kurniawan")
	println(list5)

	val map = mapOf(
		"a" to "eko",
		"b" to "kurniawan"
	)
	val map2 = map + mapOf<String, String>("c" to "Khannedy")
	println(map2)

	val map3 = map - "a"
	println(map3)
}