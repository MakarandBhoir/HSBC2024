import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableCollections
{
    public static void main(String[] args)
    {
        List<String> listOfSports = new ArrayList<String>();

        listOfSports.add("Hockey");
        listOfSports.add("Cricket");
        listOfSports.add("Tennis");
        //Output : [Hockey, Cricket, Tennis]
        System.out.println("Before modification: " +listOfSports);

        List<String> unModifiableListOfSports = Collections.unmodifiableList(listOfSports);
        //Output : [Hockey, Cricket, Tennis]
        System.out.println("Before modification: " +unModifiableListOfSports);

        //Adding a new sport in list and will be reflected in unModifiableListOfSports
        listOfSports.add("Kabaddi");

        System.out.println("After modification: " +listOfSports);  
	//Output : [Hockey, Cricket, Tennis, Kabaddi]

        System.out.println("After modification: " +unModifiableListOfSports);    
	//Output : [Hockey, Cricket, Tennis, Kabaddi]

        //It gives run-time error because modifications are not allowed
        unModifiableListOfSports.add("Wrestling");
    }
}