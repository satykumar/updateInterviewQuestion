package abs.serilaization.exjample;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeExternalization extends Person implements Externalizable {
    int employeeId;
    String department;

    public EmployeeExternalization()
    {

    }
    public EmployeeExternalization(int employeeId,String name,String department,String nationality)
    {
     super(name,nationality);
     this.employeeId=employeeId;
     this.department=department;
     System.out.println("Employee:Constructor");
    }

    public int getEmployeeId() {
     return employeeId;
    }
    public void setEmployeeId(int employeeId) {
     this.employeeId = employeeId;
    }

    public String getDepartment() {
     return department;
    }
    public void setDepartment(String department) {
     this.department = department;
    }

   @Override
   public void writeExternal(ObjectOutput out) throws IOException {

    /*since superclass does not implement externalizable, you need to serialize super class field in this class itself*/
    //superclass fields
    out.writeObject(name);
    out.writeObject(nationality);

    // its own fields
    out.writeInt(employeeId);
    out.writeObject(department);
   }

   @Override
   public void readExternal(ObjectInput in) throws IOException,
     ClassNotFoundException {
    /*since superclass does not implement externalizable, you need to deserialize super class field in this class itself*/
    //superclass fields
    name=(String) in.readObject();
    nationality=(String) in.readObject();

    // its own fields
    employeeId=in.readInt();
    department=(String) in.readObject();

   }
}
