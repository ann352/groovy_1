package groovy.ASTtransformation

static void main(String[] args) {
    println "Hello world!"
    def date = new Date()
        Worker worker1 = new Worker(firstname: "Tom",lastname: "Jones", age: 30, date: date, favouriteItems:["books", "moovies"])
        Worker worker2 = new Worker("Tom","Jones",30, date, ["books", "moovies"])
        assert worker1 == worker2
}