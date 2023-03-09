import java.util.Scanner;

public class Board_console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function_Board jjk = new Function_Board();

		while (true) {
			try {
			int answer = 0;
			answer = Integer.parseInt(sc.nextLine());// 입력받는 정수값을 문자값으로 변경
			if (answer == 1) {
				jjk.getListBoard();
				continue;
			} else if (answer == 2) {
				jjk.Regist_Board();
				continue;
			} else if (answer == 3) {
				System.out.println("검색 내용의 번호를 입력해주세요.");
				int select = 0;
				try {
					select = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("해당 내역이 없습니다.");
					continue;
				}
				jjk.Contents_Board(select);
				continue;
			} else if (answer == 4) {
				System.out.println("삭제 할 내용의 번호를 입력해주세요.");
				int select = 0;
				try {
					select = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("해당 내역이 없습니다.");
					continue;
				}
				jjk.Delete_Board(select);
			} else if (answer == 0) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			}catch(Exception e) {
				System.out.println("잘못 입력했습니다.");
			}
		}

		sc.close();
	}
}
