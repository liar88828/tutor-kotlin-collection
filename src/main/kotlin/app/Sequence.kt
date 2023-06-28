package app

fun main() {

	val words: List<String> = "The quick brown fox jumps over the lazy dog".split(" ")
	val lengthList = words
		.filter {
			println("filter: $it")
			it.length > 3
		}
		.map {
			println("map: $it")
			it.uppercase()
		}
		.take(4)

	println("Lengths of first 4 words longer than 3 chars")
	println(lengthList)
	println("===================")
//	val sequence:Sequence<String> = sequenceOf("a","b")
//	val sequence:Sequence<String> = sequenceOf(words)
	val sequence: Sequence<String> = words.asSequence()

	val resultSequence = sequence
		.filter {
			println("filter: $it")
			it.length > 3
		}
		.map {
			println("map: $it")
			it.uppercase()
		}
		.take(4)

	println(resultSequence.toList())

}