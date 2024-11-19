package exceptions

class Infos {

    static void main(String[] args) {
        //in Groovy exception (even checked) are optional - we don't have to add them to the signature of method

        //java
//    public void foo () throws Exception {
//        throw new Exception("New exception throw")
//    }

        //groovy
//        def foo() {
//            throw new Exception("Throwing new exception")
//        }

        List log = []
        try {
            foo()
        } catch (Exception e) {
            log << e.message
        } finally {
            log << "finally"
        }

        println(log) //result: Foo Exception, finally

        //to catch multiple exception we can also use way from Java
        try {
            //do smth
        }
        catch(NullPointerException | FileNotFoundException e ){ //for 2 exceptions we can use 1 'e'
            println(e.class.name) //to check which exception was caught
            println(e.message)
        }

    }
}