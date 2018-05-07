import java.io.*;
class Animal implements Serializable{
int i=10;
}
class Dog extends Animal{
int j=20;
}

public class SerialInheritanceDemo1{
public static void main(String[] args) throws Exception {
Dog dog=new Dog();

FileOutputStream fos=new FileOutputStream("dog.src");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(dog);

FileInputStream fis=new FileInputStream("dog.src");
ObjectInputStream ois=new ObjectInputStream(fis);
  Dog dog2=(Dog)ois.readObject();
  System.out.println(dog2.i+" , "+dog2.j);

}
}