package collections.lists

class Lists {
    static void main(String[] args) {

        //creating array list
        def list1 = [1, 2, 3, 4]
        list1.getClass().name
        //creating linked list
        def list2 = [1, 2, 3, 4] as LinkedList
        list2.getClass().name
        //adding element to list
        list1.plus(3)
        list1.push(7)
        list1.putAt(3, 4)
        list1 << 4
        list1 + 99
        list1[0] = 102

        println(list1)
        //removing elements
        list2.pop()
        list2 - 1
        list2.removeAt(1)

        //empty list
        List list3 = []

        //to iterate over list
        list3 << 1
        list3 << [2, 3]
        list3 << [1, 5, 6]

        //for each
        for (i in list1) {
            println(i)
        }

        //flatten()
        println(list3.flatten())

        //unique()
        println(list3.unique())

        //or we can use a set
        list3 as Set
        //or
        def list4 = [1, 2, 3, 4, 5, 6, 7, 7, 7, 7] as SortedSet
        println(list4)

    }
}
