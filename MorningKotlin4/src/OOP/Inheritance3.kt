package OOP

import java.awt.Color

fun main(args: Array<String>) {
    var Tunda = Properties("Apple", "Red", 0.5)
    Tunda.name()
    Tunda.color()
    Tunda.weight()
    Tunda.allowsBoiling()
    Tunda.canBeEatenRaw()
    Tunda.canBeUsedInAConcoction()
}

open class Fruit(open var name: String, open var color: String, open var weight: Double){
    fun name(){
        println("Apple")
    }
    fun color(){
        println("Red")
    }
    fun weight(){
        println("500g")
    }
}

class Properties(override var name: String, override var color: String, override var weight: Double):Fruit(name,color,weight){
    fun allowsBoiling(){
        println("Yes, can be boiled")
    }
    fun canBeEatenRaw(){
        println("Yes, can be eaten raw")
    }
    fun canBeUsedInAConcoction(){
        println("Yes, can be used in a concoction")
    }
}