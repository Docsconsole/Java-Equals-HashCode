package docsconsole;

import java.util.*;

public class EqualsHashCodeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(101,"name1");
        Employee employee2 = new Employee(101,"name1");
        System.out.println("employee1 hashcode: " + employee1.hashCode());
        System.out.println("employee2 hashcode: " + employee2.hashCode());
        System.out.println(employee1.equals(employee2));

        Set set = new HashSet();
        set.add(employee1);
        set.add(employee2);
        System.out.println("size: " + set.size());
		
 
   }
}