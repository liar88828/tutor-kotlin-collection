package app


fun main() {
	val list = listOf<String>("Eko", "Kurniawn", "Khannedy")
	val string1: String = list.joinToString(" ", "|", "|")
	println(string1)
	val string2: String = list.joinToString(" ", "|", "|") { it.uppercase() }
	println(string2)
	val buider = StringBuilder()
	list.joinTo(buider, " ", "|", "|")
	list.joinTo(buider, " ", ">", "<")
	list.joinTo(buider, " ", "@", "@")
	val string3 = buider.toString()
	println(string3)


	val numbers: List<Int> = (1..10).toList()
	println(numbers.joinToString())
}