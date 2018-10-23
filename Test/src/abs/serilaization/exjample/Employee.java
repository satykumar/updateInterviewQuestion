package abs.serilaization.exjample;

import java.io.Serializable;

public class Employee implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
  private String addedField;
    //without serial version id then will give :ava.io.InvalidClassException: abs.serilaization.exjample.Employee; 
    public Employee(Integer id, String name) {
           this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + ", name=" + name + "]";
    }
}
