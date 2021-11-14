import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class car{
    String color;
    int no;


}


public class listofclass {
    
     public static void main(String [] args) {

        List<car> man =new ArrayList<>();
        car toya =new car();
        man.add(toya) ;
        toya.color ="blue";
        toya.no=3;
        System.out.println(man.toArray());


        
    }
}
