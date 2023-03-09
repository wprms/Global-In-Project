import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Function_Board {
	Scanner sc = new Scanner(System.in);
	List<object_Board> boardList = new ArrayList<>();

	public void List_Board() {
		System.out.println("===============================================");
		System.out.print(" 1.목록   2.등록   3.내용   4.삭제   0.종료 >");
	}

	public void getListBoard() { // 목록 출력
		System.out.println("        <<게시판>>");
		System.out.println("번호    제목    작성자");
		for (object_Board jk : boardList) {
			System.out.println("No." + (boardList.indexOf(jk) + 1) + "|" + jk.getTitle() + "|" + jk.getWriter());
		}
	}

	public void Regist_Board() { // 등록 출력
		object_Board jk = new object_Board();
		System.out.print("제목>");
		String title = sc.nextLine();
		System.out.print("내용>");
		String content = sc.nextLine();
		System.out.print("작성자>");
		String Writer = sc.nextLine();
		System.out.println("제목 :" + title + " " + "내용 :" + content + " " + "작성자 :" + Writer + "이 등록되었습니다.");
		jk.setTitle(title);
		jk.setContent(content);
		jk.setWriter(Writer);
		// 현재 날짜 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String registDate = sdf.format(new Date());
		jk.setRegisDate(registDate);
		boardList.add(jk); // List에 해당 객체 추가
	}

	public void Contents_Board(int select) { // 내용 출력
		object_Board jk = new object_Board();
		if (boardList.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return;
		} else {
			jk = boardList.get(select - 1); // 해당 인덱스의 객체를 가져옴
			System.out.println("----------내용----------");
			System.out.println("제목 :" + jk.getTitle());
			System.out.println("작성자 :" + jk.getWriter());
			System.out.println("내용 :" + jk.getContent());
			System.out.println("작성일 :" + jk.getRegisDate());
			System.out.println("-----------------------");
		}
	}

	public void Delete_Board(int select) { // 삭제 함수
		if (boardList.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return;
		}
		boardList.remove(boardList.get(select - 1));
		System.out.println(select + "번 글이 삭제되었습니다.");
	}
}