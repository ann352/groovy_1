package operators

class Main {
    static void main(String[] args) {

        //trenary operator
        String s = ""
        def result = (s != null && s.length() > 0) ? 'found' : 'not found'

        //elvis operator - os like shortening from ternary operator
        String name = "ania"
        def nameOfUser =  name ? name.toUpperCase() : "Anonymous" // if expression evaluate to true we take as result option on the left
        println(nameOfUser)

        //shorter version
        def nameOfUser1 =  name.toUpperCase() ?: "Anonymous"
        println(nameOfUser1)

        //afe navigation operator (?.)
        // is used to avoid NullPointerException errors when accessing properties or calling methods on potentially null objects
        //allows safely access an object property or method by returning null if the object itself is null
    }   //example: def cityName = person.address?.city

}
