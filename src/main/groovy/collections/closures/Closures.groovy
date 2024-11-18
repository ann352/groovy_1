package collections.closures

class Closures {
    //we can put method to the variable, and later use that variable as method

    static void main(String[] args) {
        //when we don't name parameter in closure it always be it
        def closure1 = { println it }
        closure1("kkk")

        //when we wan't any parameter in closure we should write
        def closure2 = { -> println("Hallo!") }
        closure2()

        //creating closure with an argument
        def closure = { n -> println(n) }

        //two arguments
        def closure3 = { first, second -> println "Hallo $first $second" }
        closure3("Tom", "Smith")

        //var-args -> we can put here differnt numbers of parameter
        def closure4 = { String... vargs -> vargs.join('') }
        closure4("one", "3")
        closure4("5", "5", "6")

        //collect
        def list = [1, 2, 3, 4, 5, 6]
        def listMultiplyByTen = []
        list.each { n -> listMultiplyByTen << n * 10 }
        println(list)
        println(listMultiplyByTen)

        def newList = list.collect(n -> n * 10)

        //we can also create method with closure as argument
//        def printInfos(Closure c){
//            println c.class.getTypeParameters ( )
//            println c.maximumNumberOfParameters
//        }
//        def closure5 = { int a, int b -> a + b }

        //each(with closure)
        def nums = [1, 2, 3, 4, 5]
        nums.each { it -> println(it) }

        //we can create closure with default values
        def greet = { String name, greeting = "Hi!" -> println("$greeting $name") }
        greet("Jim", "Hello")
        //method which takes closure
        //        def times3(n, closure) {
        //            closure(n * 10)
        //        }

        Closure c = {} //we can also define closure in that way

        //currying -> we can use it for closures with multile paameters if we want to set some default values in it
        def log = { String name, Date date, String message -> println "$date [$name] $message" }
        def logWithDefaultName = log.curry("Wrong name")
        //example
        logWithDefaultName(new Date(),"Wrong action")
    }


}
