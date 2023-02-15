package docsconsole;

import java.util.Objects;

public class Employee {

    private Integer id;
    private String name;
    Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
   public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id)  && Objects.equals(this.name,  employee.name);
    }
    public int hashCode() {
        final int prime = 19;
        int result = 1;
        result = prime * result + this.id;
        return  prime * result + this.name == null? 0 : this.name.hashCode();
    }
}
