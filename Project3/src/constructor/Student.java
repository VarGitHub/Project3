package constructor;

public class Student {
	
	String name;
	int Id;
	public static int studentCount;
	
	Student(){
		//studentCount++;
		this.Id = ++studentCount;
		System.out.println("Default Constructor");
	};
	
	Student(String name){
		this.name = name;
		this.Id = ++studentCount;
		System.out.println("Constructor with name");
	}
	
	Student(String name, int Id){
		this.name = name;
		this.Id = Id;
		System.out.println("Constructor with name and Id");
	}

	public void getStudentInfo(){
		System.out.println("Name: "+ name  + ", ID: " + Id);
	}
	
	public static int getStudentCount(){
		return studentCount;
	}
}
