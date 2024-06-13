abstract class Shape{
    abstract fun area(): Double
}

class Rectangle(val length : Double,val breadth: Double): Shape() {
    override fun area():Double = length * breadth
    
    fun perimeter():Double = 2*length*breadth
}

class Circle(val radius : Double): Shape() {
    override fun area():Double = 3.141*radius*radius
    
    fun perimeter():Double = 2*3.141*radius
}

fun main(){
    val rectangle = Rectangle(10.0,20.0)
    var circle = Circle(4.0)
    println("Area of rectangle is ${rectangle.area()}")
    println("Area of rectangle is ${rectangle.perimeter()}")
    println("Area of circle is ${circle.area()}")
	println("Area of rectangle is ${rectangle.perimeter()}")
}
