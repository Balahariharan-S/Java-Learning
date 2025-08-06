class Father{
	void printName(){
		System.out.println("Father:Michael");
	}
}
class Mother{
	void printName(){
		System.out.println("Mother:Lara");
	}
}
class Brother{
	void printName(){
		System.out.println("Brother:John");
	}
}
class Sister{
	void printName(){
		System.out.println("Sister:Emma");
	}
}
public class Main{
	public static void main(String[]args){
		Father father = new Father();
		Mother mother = new Mother();
		Brother brother = new Brother();
		Sister sister = new Sister();
		System.out.println("Family members:");
		father.printName();
		mother.printName();
		brother.printName();
		sister.printName();
	}
}