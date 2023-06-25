package app

import data.Person

fun main() {
	val mutableSet: MutableSet<Person> = mutableSetOf()

	mutableSet.add(Person("Eko"))
	mutableSet.add(Person("Kurniawan"))
	mutableSet.add(Person("Eko"))
	mutableSet.add(Person("Khannedy"))
	mutableSet.add(Person("Eko"))

	for (p in mutableSet) println(p)
	println()
	val mutableString = mutableSetOf("Eko", "Kurniawan", "khannedy")
	mutableString.remove("Eko")
	for (s in mutableString) println(s)

}