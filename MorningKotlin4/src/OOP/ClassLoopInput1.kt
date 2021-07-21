package OOP

import java.util.*

class User(name:String, email:String, password:String){
    var name:String
    var email:String
    var password:String

    init {
        this.name = name
        this.email = email
        this.password = password
    }
}

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("how many users do you have?")
    var number = input.nextInt()

    var users = arrayOfNulls<User>(number)
    println("Enter the $number users details:")

    var x = 0
    while (x < number){

        println("Enter user "+(x+1)+"'s name:")
        var name = input.next()

        println("Enter user "+(x+1)+"'s email:")
        var email = input.next()

        println("Enter user "+(x+1)+"'s password:")
        var password = input.next()

        users[x] = User(name, email, password)
        x++
    }

    for (user in users){
        if (user != null){
            println(user.name+"....."+user.email+"....."+user.password)
        }
    }
}

