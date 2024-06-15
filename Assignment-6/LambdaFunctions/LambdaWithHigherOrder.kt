fun higherOrderFunction(word: List<String>, transform: (String)->String ) : List<String>{
    return word.map(transform)
}
fun main(){
    var list = listOf("Ankit","Kumar","Binod", "Bhushan", "SachivJi", "Vikash")
    var upperCaseList= higherOrderFunction(list){it.uppercase()}
    var lowerCaseList= higherOrderFunction(list){it.lowercase()}
    var reversedList= higherOrderFunction(list){it.reversed()}
    println("For list : $list")
    println("UpperCase List: $upperCaseList")
    println("LowerCase List: $lowerCaseList")
    println("Reversed List: $reversedList")
}