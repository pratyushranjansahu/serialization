/* If there is no default constructor in parent class,  we will get run time exception saying InvalidClassException*/
import java.io.*;
class Animal {
int i=10;
}
class Dog extends Animal implements Serializable{
int j=20;
}

public class SerialInheritanceDemo2{
public static void main(String[] args) throws Exception {
Dog dog=new Dog();
dog.i=888;
dog.j=999;

FileOutputStream fos=new FileOutputStream("dog.src");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(dog);

FileInputStream fis=new FileInputStream("dog.src");
ObjectInputStream ois=new ObjectInputStream(fis);
  Dog dog2=(Dog)ois.readObject();
  System.out.println(dog2.i+" , "+dog2.j);

}
}
