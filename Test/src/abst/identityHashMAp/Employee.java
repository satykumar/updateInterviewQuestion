package abst.identityHashMAp;

public class Employee {

    private String name;
    private int id;
    private String work;
    private int age;
    public Employee() {
        // TODO Auto-generated constructor stub
    }
    public Employee(String name, int id, String work, int age) {
        super();
        this.name = name;
        this.id = id;
        this.work = work;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int hashCode() {
      /*  final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((work == null) ? 0 : work.hashCode());*/
        return 10;
    }
    @Override
    public boolean equals(Object obj) {
       /* if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age != other.age)
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (work == null) {
            if (other.work != null)
                return false;
        } else if (!work.equals(other.work))
            return false;*/
        return true;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", work=" + work + ", age=" + age + "]";
    }
    
}
