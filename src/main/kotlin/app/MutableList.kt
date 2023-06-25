package app

fun main() {
	val mutableList: MutableList<String> = mutableListOf("joko")
	mutableList.add("Eko")
	mutableList.add("Kurniawan")
	mutableList.add("khannedy")

	mutableList[0]="Budi"
	mutableList.set(0, "Budi")
	mutableList.remove("Eko")
	println(mutableList[0])
	println(mutableList[1])
	println(mutableList[2])
	println()
	for (v in mutableList){
		println(v)
	}
}