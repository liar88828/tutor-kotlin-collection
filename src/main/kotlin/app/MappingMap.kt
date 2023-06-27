package app

fun main() {
	val map: Map<Int, String> = mapOf(
		1 to "Eko",
		2 to "Kurniawan",
		3 to "Khannedy"


	)

	val mapKey = map.mapKeys { it.key * 10 }
	val mapValue = map.mapValues { it.value.uppercase() }

	println(mapKey)
	println(mapValue)
}