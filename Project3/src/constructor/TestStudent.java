package constructor;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Student2");
		Student student3 = new Student("Student3", 4);
		
		student1.getStudentInfo();
		student2.getStudentInfo();
		student3.getStudentInfo();
		System.out.println(Student.getStudentCount());
	}

}
