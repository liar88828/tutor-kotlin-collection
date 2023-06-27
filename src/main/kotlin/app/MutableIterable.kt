package app

fun <T> displayMutableIterable(i: MutableIterable<T>) {
//	for (v in iterable){
//		println(v)
//	}

	val iterator = i.iterator()
	while (iterator.hasNext()) {
		val value = iterator.next()
		iterator.remove() // untuk menghapus data
		println(value)
	}

}

fun main() {
	displayMutableIterable(mutableListOf("Eko", "Kurniawan", "Khannedy"))
	println()
	displayMutableIterable(mutableListOf("Eko", "Kurniawan", "Khannedy"))

}