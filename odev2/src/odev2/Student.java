package odev2;

public class Student extends User {
	
	String imagePath;
	String address;
	
	public Student(int id, String firstName, String lastName, String email, String password, String imagePath, String address) {
		super(id, firstName, lastName, email, password);
		this.imagePath = imagePath;
		this.address = address;
	}
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
