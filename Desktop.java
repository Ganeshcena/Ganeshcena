package week3.day1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("22 inches");
	}

	public static void main(String[] args) {
		Desktop des = new Desktop();
		des.computerModel();
		des.desktopSize();

	}

}
