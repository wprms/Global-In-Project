import java.util.Scanner;

public class Board_console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function_Board jjk = new Function_Board();

		while (true) {
			try {
			int answer = 0;
			answer = Integer.parseInt(sc.nextLine());// �Է¹޴� �������� ���ڰ����� ����
			if (answer == 1) {
				jjk.getListBoard();
				continue;
			} else if (answer == 2) {
				jjk.Regist_Board();
				continue;
			} else if (answer == 3) {
				System.out.println("�˻� ������ ��ȣ�� �Է����ּ���.");
				int select = 0;
				try {
					select = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("�ش� ������ �����ϴ�.");
					continue;
				}
				jjk.Contents_Board(select);
				continue;
			} else if (answer == 4) {
				System.out.println("���� �� ������ ��ȣ�� �Է����ּ���.");
				int select = 0;
				try {
					select = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("�ش� ������ �����ϴ�.");
					continue;
				}
				jjk.Delete_Board(select);
			} else if (answer == 0) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
				continue;
			}
			}catch(Exception e) {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}

		sc.close();
	}
}
