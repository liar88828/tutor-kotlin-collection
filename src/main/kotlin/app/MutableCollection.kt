package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
	for (e in collection) println(e)
}

fun main() {
//	displayMutableCollection(listOf("Eko", "Kurniawan"))// bukan turunan dari mutable collection
	displayMutableCollection(mutableListOf("Eko", "Kurniawan"))
//	displayMutableCollection(setOf("Eko", "Kurniawan"))// bukan turunan dari mutable collection
	displayMutableCollection(mutableSetOf("Eko", "Kurniawan"))
//	displayMutableCollection(mapOf("Eko" to "Kurniawan").entries)// bukan turunan dari mutable collection
	displayMutableCollection(mutableMapOf("Eko" to "Kurniawan").entries)
}