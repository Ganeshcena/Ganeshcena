package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id , String name) {
		System.out.println(id+name);
	}
	public void getStudentInfo(String email , long phonenumber) {
		System.out.println(email+phonenumber);
		
	}

	public static void main(String[] args) {
		Students sd = new Students();
		sd.getStudentInfo(23);
		sd.getStudentInfo(23, "ganeshkumar");
		sd.getStudentInfo("ganeshkumar.yudish10@gmail.com", 9962003626L);
		

	}

}
