package app

fun main() {
	val list1 = listOf<String>("eko", "Kurniawan", "")
	val list2 = listOf<String>("Programmer", "Zaman", "kosong")
	val list3 = list1.zip(list2)
	println(list3)


	val list4 = list1.zip(list2) { value, value2 ->
		"$value $value2"
	}
	println(list4)

}