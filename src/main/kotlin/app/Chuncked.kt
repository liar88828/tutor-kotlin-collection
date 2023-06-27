package app

fun main() {
	val number = (1..96).toList()
	val list1 = number.chunked(10)
	println(list1)

	val list2 = number.chunked(10).map { values ->
		var total = 0
		for (v in values) {
			total += v
		}
		total
	}
	println(list2)

	val list3 = number.chunked(10) { list: List<Int> ->
		var total = 0
		for (v in list) {
			total += v
		}
		total
	}
	println(list3)
}