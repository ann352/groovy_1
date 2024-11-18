package collections.ranges

class Ranges {
    static void main(String[] args) {
        Range r = 1..10
        println(r.getClass().name)
        println(r.from)
        println(r.to)

//        Range range = 'a'..'z'
//        println(range)
//
//        Date date = new Date()
//        Date dateInAWeek = date + 7
//        Range dates = date..dateInAWeek
//        println(dates)

//        assert (1..10).contains(1)
//        assert (1..10).contains(11)==false
//        assert (1..<10).contains(10)
    }
}