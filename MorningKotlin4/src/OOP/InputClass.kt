package OOP

import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)

    println("Enter employee name")
    var jina = chukua.next()

    println("Enter employee salary")
    var mshahara = chukua.nextDouble()

    println("Enter employee number")
    var sajili = chukua.nextInt()

    var mfanyikazi1 = Employees(jina,mshahara,sajili)
    println(mfanyikazi1.name)
    println(mfanyikazi1.salary)
    println(mfanyikazi1.id)

}

class Employees(name:String,salary:Double,id:Int){
    var name:String
    var id:Int
    var salary:Double

    init {
        this.name = name
        this.id = id
        this.salary = salary
    }
}




