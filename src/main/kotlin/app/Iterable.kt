package app

fun <T> displayIterable(iterable: Iterable<T>) {
//	for (v in iterable){
//		println(v)
//	}

	val iterator = iterable.iterator()
	while (iterator.hasNext()) {
		val value = iterator.next()
		println(value)
	}

}

fun main() {
//	displayIterable(listOf("Eko", "Kurniawan", "Khannedy"))
	println()
//	displayIterable(setOf("Eko", "Kurniawan", "Khannedy"))

}