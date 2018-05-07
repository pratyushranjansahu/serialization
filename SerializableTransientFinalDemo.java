import java.io.*;
class Dog implements Serializable{
int i=10;
final transient int j=20;
}
public class SerializableTransientFinalDemo{
public static void main(String[] args)throws Exception{
Dog dog=new Dog();

//FileOutputStream fos=new FileOutputStream("D:/Study/java/durgasirvideo/demoprograms/serializationtest");
FileOutputStream fos=new FileOutputStream("dogtransientfinal.src");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(dog);
FileInputStream fis=new FileInputStream("dogtransientfinal.src");
ObjectInputStream ois=new ObjectInputStream(fis);
  Dog dog2=(Dog)ois.readObject();
  System.out.println(dog2.i+" , "+dog2.j);

}

}