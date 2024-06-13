fun factorial(x: Int): Int{
    if(x<=2) return x
    else return(x*factorial(x-1))
}
fun main(){
    var x= 5
    var fact= factorial(x)
    println("Factorial of $x is $fact")
}