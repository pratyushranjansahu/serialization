/* Public No Arg constructor ,  we will get run time exception saying InvalidClassException*/
import java.io.*;

public class ExternalizableDemo implements Externalizable{
String s;
int i;
int j;
 public ExternalizableDemo(){
	System.out.println("Public No Arg Constructor.");
}
public ExternalizableDemo(String s,int i,int j){
	this.s=s;
	this.i=i;
	this.j=j;
	
}

public void writeExternal(ObjectOutput objectOutput) throws IOException{
	objectOutput.writeObject(s);
	objectOutput.writeInt(i);
}
public void readExternal(ObjectInput objectInput)throws IOException,ClassNotFoundException{
	s=(String)objectInput.readObject();
	i=objectInput.readInt();
	}
public static void main(String[] args)throws Exception{
	
	ExternalizableDemo externalizableDemo=new ExternalizableDemo("Pratyush",10,20);
	
	FileOutputStream fos=new FileOutputStream("externalizabledemo.src");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(externalizableDemo);
	
	FileInputStream fis=new FileInputStream("externalizabledemo.src");
ObjectInputStream ois=new ObjectInputStream(fis);
  ExternalizableDemo externalizableDemo2=(ExternalizableDemo)ois.readObject();
  System.out.println(externalizableDemo2.s+" , "+externalizableDemo2.i+" , "+externalizableDemo2.j);
}
}