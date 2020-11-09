package Class;

import static Class.AgeUtils.calculateAge;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Juan_K
 */
public class person implements Serializable {
    protected String name;
    protected int age;
    protected String ID;
    protected LocalDate birthDate;

   public person(String ID, String name, LocalDate birthDate) {
        this.ID = ID;
        this.name = name;
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);
    }

    public void editPerson(String ID, String name, LocalDate birthDate) {
        this.ID = ID;
        this.name = name;
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
        
    @Override
    public String toString() {
        return "person{" + "ID=" + ID + ", name=" + name + ", birthDate=" + birthDate + ", age=" + age + '}';
    }
    
    public Object[] getInfoAsObjectArray() {
        
        Object[] o = new Object[3];
        
        o[0] = this.age;
        o[1] = this.name;
        o[2] = this.ID;
        
        return o;
    }
}
