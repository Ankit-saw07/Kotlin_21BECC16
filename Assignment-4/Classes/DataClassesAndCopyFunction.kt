//Classes Q2

data class Person(
 	var name: String="Ankit",
    var age: Int= 22,
    var address: String="Chaibasa"
)

fun main(){
    var person1 = Person()
    person1.name="Sai"
    person1.age=21
    person1.address="Rourkela"
    println("Name: ${person1.name} Age: ${person1.age} Address: ${person1.address}")
    var person2= person1.copy(name="Kumar",age=22)
    println("Name: ${person2.name} Age: ${person2.age} Address: ${person2.address}")

}