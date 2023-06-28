package app

fun main() {
	val list = mutableListOf<String>("eko", "Kurniawan", "khannedy")
	val listReversed = list.reversed()
	val listAsReversed = list.asReversed()
	println(listReversed)
	println(listAsReversed)

	list.add("programmer")
	println(listReversed)// tidak membuat collection baru
	println(listAsReversed)

}