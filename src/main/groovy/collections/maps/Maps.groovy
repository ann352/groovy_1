package collections.maps

class Maps {
    static void main(String[] args) {
        def map = [:]
        println(map.getClass().name)
        def person = [name: "Ann", surname: "Smith", addres: "Warsow"]
        println(person)
        println(person.name)
        //to add new key - and value
        person.put("phone number", "12345")
        println(person)
        //we can also add variable to map
        def mailAddress = "email"
        def worker = [userName: "Jim Smith", (mailAddress): "kkk@gmail.com"]
        person.size()
        person.sort()

        //looping through person
        //for
        for (entry in person) {
            println(entry)
        }

        //for each
        for (key in person.keySet()) {
            println("$key:$person[key]")
        }
    }
}

