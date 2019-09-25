class  Hello {
  private val message: String = "Hello!"
}

class Welcome{
  val message: String = "Hello!"
}

val hello = new Hello

hello.message

val welcome = new Welcome()
welcome.message

class BankAccount(
  val name: String,
  val balance: Float = 0,
  private val pinNumber: Int = 0
                 )

val John:BankAccount = new BankAccount("John Smith", 12500, 1224)
val Sara:BankAccount = new BankAccount("Sara Ski", 0, 2222)

john.pinNumber

object Hello {
  private val defaultMessage: String = "Hi"
}

class Hello(val message: String = Hello.defaultMessage) {
  import Hello._ // import all fields and methods from the companion class into here

  println(defaultMessage + "!") // since everything was imported above, we can refer to `defaultMessage` directly
  println(message)
}

new Hello

case class Time(hours: Int = 0, minutes: Int = 0)
val time1 = Time(9, 10)
time1.hours
time1.minutes
time1

val time2 = Time(9, 10)
time2.hours
time2.minutes
time2

time1 == time2

class Person(name: String)
case class Record(person: Person)
val recordComp = Record(new Person("petro")) == Record(new Person("petro"))

case class Records(records: Vector[Person])
val recordsComp = Records(Vector(new Person("petro"))) == Records(Vector(new Person("petro")))

val time3 = Time(9, 20)
time2 == time3

case class Data
case object Data
Data

case class Birthday(
                     day: Int,
                     month: Int,
                     year: Int
                   )


val pat = Birthday(11, 10, 1991)

println("day", pat.day)
println("month", pat.month)
println("year", pat.year)
println("instance of object", pat)

val bob = Birthday(11, 10, 1992)
bob == pat


case class Time(hours: Int = 0, minutes:Int = 0)
val t = Time
Time.apply(9, 0)

object Reverse {
  def apply(s: String): String = s.reverse
}

Reverse.apply("Hello")
Reverse("Hello")

val A=Array.apply(1,2,3)
println("A(0):",A(0))
println("A(1):",A(1))
println("A(2):",A(2))

val B=Array(1,2,3)
println("B(0):",B(0))
println("B(1):",B(1))
println("B(2):",B(2))

class OffTime(val name: String, val lunchTime: String , val breakTime: String)

object OffTime {
  def apply(Name:String, LunchTime : String, BreakTime: String): OffTime =
    new OffTime(Name, LunchTime, BreakTime)
}

val employ1 = OffTime("John", "12:30 pm", "3:15 pm")
employ1
println("Name: " + employ1.name)
println("Lunch Time: " + employ1.lunchTime)
println("Break Time: " + employ1.breakTime)

case class OffTime1(name: String, lunchTime: String , breakTime: String)
val employ2 = OffTime1("John", "12:30 pm", "3:15 pm")
employ1 == employ2

println("Name: " + employ2.name)
println("Lunch Time: " + employ2.lunchTime)
println("Break Time: " + employ2.breakTime)

val time1 = Time(8, 30)
Time.unapply(time1)

case class Time(hours: Int = 0, minutes: Int = 0)

val time = Time(8, 30)
time

time.hashCode
Time(8, 40).hashCode == Time(8, 50).hashCode
val time1 = Time(8, 40)
time1.hashCode

val time3 = time.copy(8, 40)
time3.hashCode

val time4 = Time(8, 40)
time1.hashCode

class Dog(name:String, breed: String)
val dog1 = new Dog("Max", "German Shepard")
println(dog1)

case class K9(name:String,Breed:String)
val dog2 = K9("Max","German Shepard")
print(dog2)

val dog1 = K9("Max","German Shepard")
dog1

val dog2 = dog1.copy()
dog2

dog1 == dog2

val dog3 = dog1.copy(name = "Bob")
dog3

dog1 == dog3

val d1 = K9("Killder", "Chihuahua")
val d2 = d1.copy(name="Orange")


case class Customer(fistName:String, lastName:String)
val person1 = new Customer("Joie", "JoJo")
person1
person1 = new Customer("Joie","JoJo")

person1.fistName
person1.fistName = "john"

@volatile var person2 = Customer("Martin","Odersky")
person2

person2 = person2.copy(lastName="Doe")
person2