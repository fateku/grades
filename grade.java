import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入分數:"); //去除ln則是不空行
		int score = scanner.nextInt();
		int level = score / 10;
		switch(level) {
		case 10:
			System.out.println("得A+");
			break;
		case 9:
			System.out.println("得A");
			break;
		case 8:
			System.out.println("得B");
			break;
		case 7:
			System.out.println("得C");
			break;
		case 6:
			System.out.println("得D");
		case 5:
			System.out.println("得E(不及格)");
		}
		
	}
}
