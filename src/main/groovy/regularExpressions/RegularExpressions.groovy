package regularExpressions
import java.util.regex.*;

class RegularExpressions {
    //in groovy we have 3 basics regular expressions pattern
    //find operator (=~)
    //match operator (==~)
    //patern operator (~string)

    static void main(String[] args) {
        //In java we use Java Simple Pattern like here
        //import java.util.regex.*;
        Pattern pattern = Pattern.compile("a\\\\b")
        println(pattern)
        println(pattern.class)

        //groovy expression
        def slashy = ~/ex/   //or slashy dollars
        def url = $/ http://expressions.com/blog/$
        println(slashy.class)

        //find | match
        def text = "abdjdjjdjdabc abc jdjd"
        def pattern1 = ~/abc/   //we print
        def isPresent = text =~ pattern //in that text can we find our pattern?
        println(isPresent)
        println(isPresent)
        println(isPresent.size())
        //matcher
        def matcher = text ==~ pattern1

    }
}
