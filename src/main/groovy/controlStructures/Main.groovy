package controlStructures

class Main {
    static void main(String[] args) {

        //if - expression evaluate to true

        int i = 1
        if (i > 0)
            println("$i is bigger than 0")

        //if else
        if (i > 0)
            println("$i is bigger than 0")
        else
            println("" +
                    "$i isn't bigger than 0")

        //while -expression is true we do smth
        while (i <= 10) {
            println(i)
            i++
        }

        //for each
        def list = [1, 2, 3, 4]
        for (num in list)
            println(num)

        //closure
        def list2 = [5, 6, 7, 8, 9]
        list2.each { println(it) }

        //switch
        def myNumber = 10
        switch (myNumber) {
            case 1:
                println("the number is 1")
                break //after finding 1
            case 10:
                println("the number is 10")
                break //after finding
            default:
                println("We hit deafault case for other numbers") //for others numbers
        }

        //we can check different types of variable in one switch
        //switch
        def number = 12
        switch (number) {
            case 1:
                println("the number is 1")
                break
            case 1..3:
                println("the number is from range 1..3")
                break
            case [1,2,12]:
                println("the number is in [1,2,12] ")
                break
            case Integer:
                println("The number is Intrger")
                break
            case Float:
                println("The number is Float")
                break
            default:
                println("default value...")


                //loops
                if (true) {
                    println(true)
                }

                if (false) {
                    println("In that case - if false - we print true")
                } else {
                    println("In that case - if true - simply print true")
                }

                //trenary operator
                //def variable = EXPRESSION ? answer for true : answer for false
                String name = 'Anna'
                String isItNamePrintedWithUpperCase = (name.toUpperCase() == "ANNA") ? "yes it is" : "no it isn't"
                println(isItNamePrintedWithUpperCase)

                //elvis   def variable =  expression ?: 'default'
                def msg = "My message"

                //def msgOutput = msg != null ? msg : "default message"  -> trenary operator vs elvis operator
                def msgOutput = msg ?: "default message"
                println(msgOutput)

        }

        //in

        def names = ["Matt", "James", "Adam"]
        String name = "Adam"
        println(name in names)
    }
}