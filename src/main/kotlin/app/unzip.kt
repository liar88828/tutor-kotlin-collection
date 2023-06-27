package app

fun main() {
	val list = listOf(
		"Eko" to "Programmer",
		"Khannedy" to "zaman",
		"kurniawan" to "now",
	)
	val pair: Pair<List<String>, List<String>> = list.unzip()
	println(pair.first)
	println(pair.second)
	val (d1, d2) = pair
	println(d1)
	println(d2)
}