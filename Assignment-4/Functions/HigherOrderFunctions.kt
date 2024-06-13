//Q2- Higher Order Function
fun add(x: Int, y: Int): Int= x+y
fun sub(x: Int, y: Int): Int= x-y
fun mul(x: Int, y: Int): Int= x*y
fun div(x: Int, y: Int): Int= x/y

fun higherOrder(x: Int, y: Int, func :(Int, Int)->Int) : Int {
    return func(x,y)
}

fun main(){
    var x= 10
    var y= 5
    var sum= higherOrder(x,y,::add)
    var difference= higherOrder(x,y,::sub)
    var product= higherOrder(x,y,::mul)
    var quotient= higherOrder(x,y,::div)
    println("For $x and $y")
    println("Sum = $sum")
    println("Difference = $difference")
    println("Product = $product ")
    println("Quotient = $quotient")
}
