package fpoly.giapdqph34273.myapplication.ui.theme

fun main() {
//    vd1()
//    vd2()
//    vd3()
//    vd4()
//    vd5()
//    vd6()
//    vd7()
//    vd8()
//    vd9()
    vd10()
}

fun vd1() {
    println("Hello, World!")
}

fun vd2() {
    fun inRaManHinh(message: String): Unit {
        println("Hello, World!")
    }

    fun inRaTinNhanCoTienTo(message: String, prefix: String = "Info") {
        println("[$prefix]: $message")
    }

    fun tinhTong(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y

    inRaManHinh("Hello")
    inRaTinNhanCoTienTo("Hello", "Log")
    inRaTinNhanCoTienTo("Hello")
    inRaTinNhanCoTienTo(prefix = "Log", message = "Hello")
    println(tinhTong(1, 2))
    println(multiply(1, 2))
}

fun vd3() {
    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3
}

fun vd4(){
    var neverNull: String? = "This cant be null"

    neverNull = "haha"

    var nullable:String? = "You can keep a null here"

    nullable = "hihi"

    var inferredNonNull:String? = "The compiler assumes non-null"

    inferredNonNull = null

    fun strLength(notNull:String):Int{
        return notNull.length
    }

    strLength(neverNull)
    strLength(nullable)
}

class Customer

class Contact(val id: Int, var email: String)

fun vd5() {
    val customer = Customer()

    val contact = Contact(1, "Giap@gmail.com")

    println(contact.id)

    contact.email = "mai@gmail.com"
    println(contact.email)
}

fun vd6() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}

fun vd7() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}

fun vd8() {
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

fun vd9() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}

open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun vd10() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

