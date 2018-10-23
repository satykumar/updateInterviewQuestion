package abs.finals.test;

public class Employee {

    private String name;
    
    private String lName;
    public Employee() {
    // TODO Auto-generated constructor stub
}

    public Employee(String name, String lName) {
    super();
    this.name = name;
    this.lName = lName;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", lName=" + lName + "]";    }
    
}
