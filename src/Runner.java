import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

// before:
        System.out.println(names);

// complete me:
        for (int index = 0; index < names.size(); index++)
        {
            if (names.get(index).length() == 5){
                names.remove(index);
                index--;
            }
        }

// after:
        System.out.println(names);

    }
}
