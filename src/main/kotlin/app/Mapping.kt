package app


fun main() {
	val list: List<String> = listOf("Eko", "Kurniawan", "Khannedy")

	val temp = mutableListOf<String>()

//	for (v in list) {
//		temp.add(v.uppercase())
//	}
//	val list2 = temp.toList()
//	println(list2)

//val 	list2 = list.map{it.uppercase()}
	val list2 = list.map { value -> value.uppercase() }
	println(list2)

	val set1 = setOf("Eko", "Kurniawan", "Khannedy")
	val set2 = set1.map { it.lowercase() }
	println(set2)


	val names = listOf("Eko", "Joko", "Dani", "Andi", "Hendri")
	val nameGanjil = names.mapIndexedNotNull { index: Int, name: String ->
		if (index % 2 == 0) null
		else name
	}
	println(nameGanjil)
	val numbers = (1..100).toList()
	val ganjil = numbers.mapNotNull {
		if (it % 2 == 0) null
		else it
	}
	println(ganjil)
}