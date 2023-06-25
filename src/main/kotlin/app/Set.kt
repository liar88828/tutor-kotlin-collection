import data.Person

fun main() {
	val set: Set<Person> = setOf(
		Person("Eko"),
		Person("Kurniawan"),
		Person("Kennedy"),
		Person("Eko"),
	)
	println(set.size)
	println(set.contains(Person("Eko")))

	for (p in set) {
		println(p)
	}

}