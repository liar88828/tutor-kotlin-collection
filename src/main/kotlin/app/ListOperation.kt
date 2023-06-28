package app

fun main() {
	val list = listOf<String>("Eko", "Kurniawan", "Kennedy")
	println(list.getOrNull(10))
	println(list.getOrElse(10) { index -> "Tidak ada" })
	println(list.subList(0, 2))

	val sorterList = list.sorted()
	println(sorterList)
	println(sorterList.binarySearch("Eko"))
	println(sorterList.binarySearch("Kurniawan"))
	println(sorterList.binarySearch("Kennedy"))


	val numberList = listOf<Int>(1, 1, 2, 2, 3, 4, 3, 4, 5, 5, 6, 6)
	val numbers = numberList.sorted()
//	println(numbers)
	println(numbers.indexOf(2))
	println(numbers.lastIndexOf(2))
	println(numbers.indexOfFirst { it > 3 })
	println(numbers.indexOfLast { it > 3 })

}