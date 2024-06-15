fun main() {
    val people = listOf(
        "Ankit" to 30,
        "Bhushan" to 25,
        "Amish" to 35,
        "Deepansh" to 20
    )

    val sortedPeople = people.sortedBy { it.second }
    
    println(sortedPeople)
}