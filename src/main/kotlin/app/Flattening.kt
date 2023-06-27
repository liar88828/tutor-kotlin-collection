package app

class Member(val name: String, val hobbies: List<String>)


fun main() {
	val list: List<List<String>> = listOf(
		listOf("eko", "kurnawan", "Khannedy"),
		listOf("maybe", "whoever", "accuse"),
		listOf("march", "rule", "find"),
		listOf("new", "member", "believe")
	)

	val listString: List<String> = list.flatten()
	println(listString)

	val member: List<Member> = listOf(
		Member("eko", listOf("Reading", "Codding")),
		Member("budi", listOf("Gaming", "Traveling"))
	)
	val hobbies = member.map { it.hobbies }.flatten()
	val hobies2 = member.flatMap { it.hobbies }
	println(hobbies)
	println(hobies2)
}