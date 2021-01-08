package wordtest;

import java.util.Vector;
import java.util.Scanner;
public class Quiz {
	private Word word;
	private Word tempWord;
	private int randomNum;
	private int collection;
	private int selection;
	
	public void play(Vector<Word> vec) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 "+ vec.size() + "개의 단어가 들어있습니다. -1을 입력하면 테스트를 종료합니다.");
		
		while(true){//사용자가 -1을 입력해 종료할때까지 반복시행
			randomNum = (int)(Math.random()*vec.size());//Vector에 저장된 Word중 무작위로 꺼내오기 위한 변수
			collection = (int)(Math.random()*4 + 1); //정답이 될 번호 1~4중 무작위 생성
			
			word = vec.get(randomNum);
			System.out.println(word.getEnglish() + "?"); //문제
			
			for(int i = 1; i <= 4; i++) { //보기생성
				randomNum = (int)(Math.random()*vec.size());
				tempWord = vec.get(randomNum);
				
				makeDif(vec); //Word의 korean과 tempWord의 korean이 같아 중복보기를 생성하지 않기 하기위함
				
				if(collection == i) //정답번호와 보기번호가 같을때
					System.out.print("(" + i + ")" + word.getKorean() + " ");
				else //정답번호와 보기번호가 다를때
					System.out.print("(" + i + ")" + tempWord.getKorean() + " ");
			}
			System.out.print(" :> ");
			
			try {
				selection = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("숫자만 입력하세요 !!");
			}
			
			if(selection == -1) return;
			
			if(selection == collection) System.out.println("Excellent !!");
			else System.out.println("No. !!");
		}
		
	}
	
	private void makeDif(Vector<Word> vec) { //중복정답이 될 경우를 제거하기 위한 메소드
		if(word.getKorean().equals(tempWord.getKorean())) { //정답의 한글과 보기를 생성할 한글이 같은경우
			randomNum = (int)(Math.random()*vec.size());
			tempWord =  vec.get(randomNum);
			
			makeDif(vec); //재귀함수를 호출하여 재검사
		}
		
		else return;
	}
	
}
