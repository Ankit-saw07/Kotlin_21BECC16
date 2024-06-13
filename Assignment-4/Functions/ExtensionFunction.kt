fun String.isPalindrome():Boolean {
    var word= this.filter{it.isLetterOrDigit()}.lowercase()
    var length= word.length
    for(i in 0..length/2){
        if(word[i]!=word[length-i-1]) return false
    }
    return true
}

fun main(){
    var word= "naman"
    var flag= word.isPalindrome()
    if(flag) println("$word is palindrome")
    else println("$word is not plaindrome")
}
