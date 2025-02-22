package app


fun <T> displayCollection(collection: Collection<T>) {
	for (e in collection) println(e)
}

fun main() {
	displayCollection(listOf("Eko", "Kurniawan"))
	displayCollection(mutableListOf("Eko", "Kurniawan"))
	displayCollection(setOf("Eko", "Kurniawan"))
	displayCollection(mutableSetOf("Eko", "Kurniawan"))
	displayCollection(mapOf("Eko" to "Kurniawan").entries)
//	displayCollection(mapOf("Eko" to "Kurniawan"))// error, Map bukan turunan Collection
}