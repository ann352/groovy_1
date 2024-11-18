package dataTypes

class DataTypes {
    //in groovy we can use the same 8 data Types (and their warappers) like in Java
    //additionally we have 'def' -> we can use this type, e.g. when we don't now to which data type will evaluate our variable
    //in groovy we can check type of data in def variable by -> defName.getClass().getName()

    static void main(String[] args) {
        //we can also cast data
        def mydata = (Float) 1.0
        println(mydata.getClass().getName())

        //GDK methods
        // conversion
        assert 3 == 3.5.toInteger()
        //enforced coercion
        assert 3 == 3.5 as Integer
        //cast
        assert 4 == (int) 4.5
        //isNumber()
        assert '5.50'.isNumber()

        //we can thing about those number as about objects
        //times
        10.times { it ->
            println(it)
        }
        //upto
        1.upto(10) {
            println(it)
        }
        //downto
        10.downto(2) {
            println(it)
        }
        //step
        0.step(1, 0.2) {
            println(it)
        }

        //when we add two numbers
        int a = 2, b = 3
        println(a + b)
        //we actually do that
        println(a.plus(b)) //we cane use it when we are creating our methods - example Account class

        Account savings = new Account(balance: 300)
        Account checking = new Account(balance: 500)

        println(savings + checking)

        //in java - this is "string" and this is 'a' char
        //in groovy this "is" and 'this' are strings
        //string interpolation
        String name = "Tom"
        String msg = "Hello" + name
        String msg2 = "Hello + ${name}" //that expression we can use only in ""
        println('Hello +${name}') //that expression print what is actually in ''

        //we can also use multiline strings ''' ''' or """ """
        def hugeMsg = '''
        a
        bc
        d
        '''
        //dollar slashy - e.g. when we need to use special characters $/  /$
        def folder = $/C:\groovy\bin\env/$
        println(folder)
    }


}
