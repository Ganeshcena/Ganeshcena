package week3.day1;

public class Student extends College  {
	public void studentName() {
		System.out.println("Ganeshkumar");
	}
	public void studentDept() {
		System.out.println("Mechanical");
	}
	public void studentId() {
		System.out.println("311417114023");
	}
	

	public static void main(String[] args) {
		Student st = new Student(); 
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();

	}

}
