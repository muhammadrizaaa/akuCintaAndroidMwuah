package org.example

fun main() {
    var teamList = ArrayList<String>()
    var win = ArrayList<Int>()
    var lost = ArrayList<Int>()
    var draw = ArrayList<Int>()
    addTeam(teamList, win, draw, lost)
    printAll(teamList, win, draw, lost)
}

fun  addTeam(team:ArrayList<String>, wins:ArrayList<Int>, draws:ArrayList<Int>, loses:ArrayList<Int>) {
    while (true){
        print("Add Team : ")
        val inp = readLine()
        print("How much win : ")
        val win = readLine()
        print("How much Draw : ")
        var draw = readLine()
        print("How much Lost : ")
        val lost = readLine()
        team.add(inp.toString())
        if (win != null) {
            if(win.all { it.isDigit() }){
                wins.add(win.toInt())
            }else{
                println("The input is not a number, Ending the process")
                team.removeAt(team.lastIndex)
                continue
            }
        }
        if (draw != null) {
            if(draw.all     { it.isDigit() }){
                draws.add(draw.toInt())
            }else{
                println("The input is not a number, Ending the process")
                team.removeAt(team.lastIndex)
                continue
            }
        }
        if (lost != null) {
            if(lost.all { it.isDigit() }){
                loses.add(lost.toInt())
            }else{
                println("The input is not a number, Ending the process")
                team.removeAt(team.lastIndex)
                continue
            }
        }
        println("type 'N' to stop")
        val confirm = readLine()
        if(confirm == "N"||confirm == "n"){
            break
        }
    }
}

fun printAll(team:ArrayList<String>, win:ArrayList<Int>, draw:ArrayList<Int>, loses:ArrayList<Int>){
    for(i in team.indices){
        val point = (win[i]*3)+(draw[i])
//        val pointnxt = (win[i+1]*3)+(draw[i+1])
        print(team[i]+" ")
        print(win[i].toString() + " ")
        print(draw[i].toString() + " ")
        print(loses[i].toString() + " ")
        print(point.toString() + " ")

        println()
    }
}