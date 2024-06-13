//Assignment 4 June 13

//Functions
//Q1- Function overloading
fun calculateArea( length : Int, breadth: Int): Int {
    var area = length* breadth
    return area
}
fun calculateArea(radius : Double): Double {
    var area = 3.141 * radius *radius
    return area
}
fun main(){
    var radius= 6.0
    var length= 5
    var breadth= 4
    var rectangleArea= calculateArea(length, breadth)
    var circleArea= calculateArea(radius)
    println("The area of rectangle is $rectangleArea")
    println("The area of circle is $circleArea")
}