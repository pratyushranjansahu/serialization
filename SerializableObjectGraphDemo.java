import java.io.*;
class Dog implements Serializable{
Cat cat=new Cat();

}
class Cat implements Serializable{
	Rat rat=new Rat();
}
class Rat implements Serializable{
	int  i=10;
}
public class SerializableObjectGraphDemo{
public static void main(String[] args)throws Exception{
Dog dog=new Dog();

//FileOutputStream fos=new FileOutputStream("D:/Study/java/durgasirvideo/demoprograms/serializationtest");
FileOutputStream fos=new FileOutputStream("objectgraph.src");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(dog);
FileInputStream fis=new FileInputStream("objectgraph.src");
ObjectInputStream ois=new ObjectInputStream(fis);
  Dog dog2=(Dog)ois.readObject();
  System.out.println(dog2.cat.rat.i);

}

}