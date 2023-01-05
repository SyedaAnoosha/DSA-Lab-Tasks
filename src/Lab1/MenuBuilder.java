package Lab1;
import java.util.ArrayList;

public class MenuBuilder {
    public void menuBuilder(){
        String menuTitle="My Dream Menu:";
        System.out.println(menuTitle);
        ArrayList<String> menu = new ArrayList<>();
        String starter = "Soup";
        menu.add(starter);
        String mainCourse = "Biryani";
        menu.add(mainCourse);
        String dessert="Custard";
        menu.add(dessert);
        System.out.println(menu);
    }
}
