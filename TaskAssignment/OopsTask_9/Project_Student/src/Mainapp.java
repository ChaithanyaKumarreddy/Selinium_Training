import model.Student;
import service.StudentService;
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Chaithanya",23);
		StudentService s2 = new StudentService();
		s2.save(s1);
		s2.print(s1);
		

	}

}
