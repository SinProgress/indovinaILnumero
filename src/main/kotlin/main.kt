import kotlin.random.Random

fun main() {
    println("Indovina un numero da 1 a 100")
    var input=true
    while(input){
        val number= Random.nextInt(0,100)
        val maxAttempt= Random.nextInt(1,10)
        println("Hai $maxAttempt tentativi per indovinare un numero da 1 a 100")
        for(i in 0 until maxAttempt){
            println("Inserisci il numero")
            val num= readLine()!!.toInt()
            if(num==number){
                println("Bravo! Hai indovinato!")
                break
            } else if (num<number){
                        print("Non hai indovinato,è più grande. ")
            } else {
                print("Non hai indovinato,è più piccolo. ")
            }
            println("Hai ancora ${maxAttempt-i-1} tentativi.")
        }
        println("Vuoi giocare ancora? Y / N")
        if(readLine()?.toUpperCase()!='Y'.toString()){
            input=false
        }
    }
}