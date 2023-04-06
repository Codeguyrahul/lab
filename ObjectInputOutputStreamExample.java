package lab_6_April;

import java.io.*;

class Person implements Serializable {
   
     String name;
     transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) {
        String fileName = "H:\\lab_6_3";
        Person person = new Person("ram kumar", 28);
        System.out.println("Before serialize : " + person);
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
        } catch (IOException e) {
           System.out.println(e);;
        }
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person dp = (Person) ois.readObject();
            System.out.println("After serialize: " + dp);
            dp.setAge(35);
            System.out.println("After changing age: " + dp);
        } catch (IOException | ClassNotFoundException e) {
           System.out.println(e);
        }
    }
}

