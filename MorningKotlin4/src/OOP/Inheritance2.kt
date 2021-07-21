package OOP

fun main(args: Array<String>) {
    var Mkuu = Admin("bleak@123.com", "arte")
    Mkuu.login()
    Mkuu.accessPortal()
    Mkuu.addUser()
    Mkuu.removeUser()
}

open class NormalUser(open var email: String, open var password: String){
    fun login(){
        println("Yeah, i can log in to the system")
    }
    fun accessPortal(){
        println("Yeah, i can access the portal")
    }
}

class Admin(override var email: String, override var password: String): NormalUser(email,password){
    fun addUser(){
        println("Yeah, i can add user from the system")
    }
    fun removeUser(){
        println("Yeah, i can remove user from the system")
    }
}