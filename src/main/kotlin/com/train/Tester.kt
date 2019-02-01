package com.train

import java.util.*

fun main(args: Array<String>) {
    var total = 0
    val scanner = Scanner(System.`in`)
    while (total != -1) {
        print("Please enter number of ticket:")
        total = scanner.nextInt()
        if(total == -1)
            break
        print("How many round-trip tickets:")
        var round = scanner.nextInt()
        //var oneway = total - round
        val ticket = Ticket1(total, round)
        ticket.print()
    }
}

class Ticket1(var total:Int,var round:Int){

    fun print(){
        println("Total ticket:$total"+"\n"+"Round-trip:$round"+"\n"+
                "Total:${totalval()}")
    }

    fun totalval() = (total-round)*1000+round*2000*0.9

}