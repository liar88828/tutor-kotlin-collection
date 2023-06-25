package app

fun main() {
	var list: List<String> = listOf("Eko", "Kurniawan", "khannedy")
	println(list[0])
	println(list[1])
	println(list[2])
	println(list.indexOf("Eko"))
	println(list.indexOf("tidak ada"))
	println(list.contains("Eko"))
	println(list.containsAll(listOf("Eko", "Kurniawan")))
	println(list.isEmpty())
	println(list.isNotEmpty())
}