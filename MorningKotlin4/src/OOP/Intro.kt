package OOP

fun main(args: Array<String>) {
    //create an object from the class
    var car1:Car
    car1 = Car()
    println(car1.color)

    var car2 = Car()
    println(car2.manufacturer)

    car1.accelerate()
    car2.brake()

    var std1 = Students("Jeff","jeff@123.com","Male","456",20)
    println(std1.admin)

}

//contains properties and methods:- hard-coded|constructors
class Car{
    var color = "maroon"
    var wheels = 24
    var drive = "left"
    var manufacturer = "Mercedes"

    fun accelerate(){
        println("Yeah, i can accelerate")
    }
    fun brake(){
        println("Yeah, i can brake")
    }
}

//Data input class
class Students(name:String,email:String,gender:String,admin:String,age:Int){
    //properties for students
    var name:String
    var email:String
    var gender:String
    var admin:String
    var age:Int

    //this is the constructor
    init {
        this.name = name
        this.email = email
        this.gender = gender
        this.admin = admin
        this.age = age
    }
}