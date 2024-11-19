package oop

class Person {
    //by default classes in groovy are public so we don't need write 'public' access modifier here like in Java


    String firstName, lastName
    //if we don't add modifier here by default it will be private, and groovy add getters and setters
    //but when we explicitly add modifier private getters and setters we have to create alone

    def age //groovy configure out what type o data we have in it , when we initialize variable
    static welcomeMessage = 'Hello'
    //when we create static field, we didn't create instance of a class to use it, because that field is owned by a class
    //we can also add final key word (like constant in other languages) to the field - when it shouldn't be changed
    public static final String WELCOME_MESSAGE = 'Hello'

    //constructor - default constructor with fields of class is created by groovy, but we can crate own constructor
    Person(String fullName) {
        List partsOfFullName = fullName.split(' ')
        firstName = partsOfFullName[0]
        lastName = partsOfFullName[1]
    }

    //methods
    //when we create method in Java, we have to write, e.g
    public String introduceYourself(String a, String b) {
        println(a + " " + b)
    }

    //in groovy - we din't have to add modifier and write return - yhe last line in method is return
    String getFullName() {
        "$firstName $lastName"
    }

    //we can also create a method where we don't care about returned type and type of arguments
    def newMethod(someArguments) { //but when we now type of arguments we should write it

    }

    //we can also create a static method which will be accesses by a class not by an instance
    static String greet() {
        println("Hello")
    }

    //we can also add default calues to arguments, in case not specify them alle the tims
    List myMethod(List numbers = [4,5,6], Boolean canAccessAllNumbers = false){

    }

    //if we don't know how many arguments we will pass to the method, we can use var args - and don't care about numbers of arguments
    def concatWords (String... args){
        args.length
    }



    //local variables
    def greetJames() {
        String welcomeMessage = "Hello, "
        String firstName = "James"
        println("$welcomeMessage $firstName")
        //those fields can have the same names as properties of the class, because they have only local scope, class do not use them
    }

}

