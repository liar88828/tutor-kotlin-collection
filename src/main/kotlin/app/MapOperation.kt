package app

fun main() {
	val map = mapOf<String, String>(
		"a" to "eko",
		"b" to "kurniawan",
		"c" to "khannedy"
	)
	println(map.get("a"))
	println(map.get("Tidak ada"))
	println(map.getValue("a"))
//	println(map.getValue("tidak ada")) //error
	println(map.getOrElse("Tidak ada") { "Ups" })
	println(map.filter { entry -> entry.value.length > 5 })
	println(map.filterKeys { it != "b" })
	println(map.filterValues { it.length > 5 })

}