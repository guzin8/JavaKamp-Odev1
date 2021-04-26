package odev1;

public class Main {

	public static void main(String[] args) {
		
		Instructor egitmen1 = new Instructor(1, "Engin", "Demirog");
		Instructor egitmen2 = new Instructor(2, "Kerem", "Varýþ");
		
		Instructor[] egitmenler = {egitmen1, egitmen2};
		
		Category kategori1 = new Category(1, "Programlama");
		Category kategori2 = new Category(2, "Siber Güvenlik");
		
		Category[] kategoriler = {kategori1, kategori2};
		
		for (Instructor egitmen : egitmenler) {
			
			System.out.println(egitmen.firstName + " " + egitmen.lastName);
		
		}
		
		for (Category kategori : kategoriler) {
			System.out.println(kategori.categoryName);
			
		}
		
		InstructorManager instructerManager = new InstructorManager();
		instructerManager.SelectInstructor(egitmen1);
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(kategori2);

	}

}
