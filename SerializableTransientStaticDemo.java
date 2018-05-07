import java.io.*;
class Dog implements Serializable{
int i;
static transient int j;
}
public class SerializableTransientStaticDemo{
public static void main(String[] args)throws Exception{
Dog dog=new Dog();
dog.i=10;
dog.j=20;
//FileOutputStream fos=new FileOutputStream("D:/Study/java/durgasirvideo/demoprograms/serializationtest");
FileOutputStream fos=new FileOutputStream("dogtransientstatic.src");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(dog);
FileInputStream fis=new FileInputStream("dogtransientstatic.src");
ObjectInputStream ois=new ObjectInputStream(fis);
  Dog dog2=(Dog)ois.readObject();
  System.out.println(dog2.i+" , "+dog2.j);

}

}