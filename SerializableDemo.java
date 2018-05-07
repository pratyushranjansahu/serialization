import java.io.*;
class Dog implements Serializable{
int i;
int j;
}
public class SerializableDemo{
public static void main(String[] args)throws Exception{
Dog dog=new Dog();
dog.i=10;
dog.j=20;
//FileOutputStream fos=new FileOutputStream("D:/Study/java/durgasirvideo/demoprograms/serializationtest");
FileOutputStream fos=new FileOutputStream("dog.src");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(dog);
FileInputStream fis=new FileInputStream("dog.src");
ObjectInputStream ois=new ObjectInputStream(fis);
  Dog dog2=(Dog)ois.readObject();
  System.out.println(dog2.i+" , "+dog2.j);

}

}