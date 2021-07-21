package OOP

fun main(args: Array<String>) {
    var mtoto1 = Child("Junior", 12)
    println(mtoto1.name + mtoto1.age)
    mtoto1.cry()
    mtoto1.cook()
    mtoto1.wash()
}

open class Parent(open var name: String, open var age: Int){
    fun cook(){
        println("Yeah, i can cook")
    }
    fun wash(){
        println("Yeah, i can wash")
    }
}

class Child(override  var name: String, override var age: Int):Parent(name, age){
    fun cry(){
        println("Yeah, i can cry")
    }
}