package odev1;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
		Instructor instructor2 = new Instructor(2, "Kerem", "Varýþ");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Siber Güvenlik");
		
		Category[] categories = {category1, category2};
		
		for (Instructor instructor : instructors) {
			
			System.out.println(instructor.firstName + " " + instructor.lastName);
		
		}
		
		for (Category category : categories) {
			System.out.println(category.categoryName);
			
		}
		
		InstructorManager instructerManager = new InstructorManager();
		instructerManager.SelectInstructor(instructor1);
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category2);

	}

}
