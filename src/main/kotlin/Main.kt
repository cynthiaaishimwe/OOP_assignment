fun main() {
 val person = Human("Joy",22, 55)
    person.speak("today was a good day")
    person.eat(5)
    person.weight
    println(person.weight)
    person.birthday()





    val admin = User("Divine" ,"Brittany","divinebrittany@gmail.com" ,777777,999)
println(admin.firstName)
println(admin.phoneNumber)
}
class Human(var name: String, var age: Int ,var  weight: Int){
  fun speak(speech: String){
      println(speech)
  }
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight Kg of food")
        weight+= foodWeight
    }
    fun birthday(){
        age++
        println(age)
    }
}
data class User(var firstName: String,var lastName: String,var email: String,var phoneNumber: Int , var password: Int)

