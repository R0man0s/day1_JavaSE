package section11_L28;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        HashSet<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(new Employee("Mike", 3500, "Accounting"));
        hashSet.add(new Employee("Paul", 3000, "Admin"));
        hashSet.add(new Employee("Peter", 4000, "IT"));
        hashSet.add(new Employee("Angel", 2000, "Maint"));

        ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);

        Collections.sort(myList);

        System.out.println(myList);


    }
}
