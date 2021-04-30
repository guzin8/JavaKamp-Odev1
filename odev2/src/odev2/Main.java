package odev2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new Student(1,"Güzin", "Kanburoglu","guzinkanburoglu@gmail.com","12345","url1","Kastamonu");
		User user2 = new Instructor(1, "Engin", "Demirog", "engin@gmail.com", "679895", "Java");
		
		UserManager userManager1 = new UserManager();
		userManager1.Login(1, user1);
		
		UserManager userManager2 = new UserManager();
		userManager2.Login(2, user2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.RegisterToCourse(user1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(user2);
		
	}

}
