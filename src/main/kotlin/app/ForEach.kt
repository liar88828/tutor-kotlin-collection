package app

fun main() {
//	for (v in listOf("Eko", "Kurniawan", "Khannedy")){
//		println(v)
//	}
	listOf("Eko", "Kurniawan", "Khannedy").forEach {
		println(it)
	}

	mutableListOf<String>(
		"Eko",
		"Kurniawan",
		"Khannedy"
	).forEachIndexed { index: Int, value: String -> println("$index : $value") }
}