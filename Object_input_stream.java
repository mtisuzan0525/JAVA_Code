
package class_3;

import java.io.*;

public class Object_input_stream {
    
    public static class Person implements Serializable {
    public String name = null;
    public int age = 0;
    }
    public static void main(String[]args) throws IOException, ClassNotFoundException{
        
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream("E:\\person.bin"));
        Person person = new Person();
        person.name = "suzan";
        person.age = 24;
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
        ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream("E:\\person.bin"));
        Person personRead = (Person) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(personRead.name);
        System.out.println(personRead.age);
    }
}
