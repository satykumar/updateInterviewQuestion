package string.mutable;

import java.util.ArrayList;
import java.util.List;

public final class Student {

    private final String name;
    
    private final String lastname;
    private Address addres;
  //  private final HashMap<Integer,String> map;
    
  //  private List<Coures> coures;
    
    public Student(String name, String lastname, Address addres) {
        super();
        this.name = name;
        this.lastname = lastname;
        Address add= new Address();
        add.setId(addres.getId());
        this.addres=add;
    //    this.map=new HashMap<Integer, String>(map);
    //    this.coures = new ArrayList<Coures>();
    }
    public Address getAddres() {
        return addres;
    }
    public List<Coures> getCoures() {
        return  new ArrayList<Coures>();
    }
    public String getName() {
        return name;
    }
//    public HashMap<Integer, String> getMap() {
//        /** 5c) HashMap is mutable class,
//         *     any changes made to HashMap object won't produce new HashMap object.
//         *     so return copy/clone of object, not reference variable of HashMap.*/
//         return (HashMap<Integer, String>) map.clone(); 
//     }
    public String getLastname() {
        return lastname;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", lastname=" + lastname + ", addres=" + addres + "]";
    }
    
    
}
