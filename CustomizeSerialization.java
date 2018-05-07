import java.io.*;
class Account implements Serializable{
	String userName;
	transient String password;
	Account(String userName,String password){
		this.userName=userName;
		this.password=password;
	} 
	
	 private void writeObject(ObjectOutputStream objectOutputStream) throws Exception{
		 objectOutputStream.defaultWriteObject();
		String encryptPassword="123"+password;
		objectOutputStream.writeObject(encryptPassword); 

	}
	
	private void readObject(ObjectInputStream objectInputStream) throws Exception{
		objectInputStream.defaultReadObject();
		String decryptPassword=(String)objectInputStream.readObject();
		password=decryptPassword.substring(3);
		
	} 

}
public class CustomizeSerialization{
public static void main(String[] args) throws Exception{
	
	Account account=new Account("Pratyush","Pratyush@123");
	System.out.println("Before Serialization : "+account.userName+" , "+account.password);
	FileOutputStream fos=new FileOutputStream("customserialization.src");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(account);
	
	FileInputStream fis=new FileInputStream("customserialization.src");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Account account2 =(Account)ois.readObject();
	System.out.println("After DeSerialization : "+account2.userName+" , "+account2.password);
}

}