package app

fun <T> diplayListIterator(listIterator: ListIterator<T>) {
	println("Disply Next")
	while (listIterator.hasNext()) {
		println(listIterator.next())
	}

	println("Display Previous")
	while (listIterator.hasPrevious()) {
		println(listIterator.previous())
	}

}


fun main() {
	diplayListIterator(listOf("Eko", "Kurniawan", "Khannedy").listIterator())
}