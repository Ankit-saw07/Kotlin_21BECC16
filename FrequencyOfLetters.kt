fun main(){
    var string="ankit kumar"
    val frequency= mutableMapOf<Char,Int>()
    for(char in string){
        if(char.isLetter()){
        	frequency[char]=frequency.getOrDefault(char, 0) + 1;
        }
    }
    println("$frequency")
}