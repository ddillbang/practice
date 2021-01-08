package wordtest;

import java.util.Scanner;
import java.util.Vector;
public class Wordtest {
	private Vector<Word> vec = new Vector<>();
	private int selection; //사용자의 선택을 위한 변수
	private Quiz quiz = new Quiz();
	private NewWord newWord = new NewWord();
	private Scanner sc = new Scanner(System.in);
	
	public void play(){
		newWord.firstPlay(vec); //최초실행시 기본단어 10개 설정
		
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다.");
		
		
		while(true) {//프로그램의 반복실행을 위한 while문
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>>");
			
			while(true) {//정상적인 입력을 유도하기 위한 while문
				try {
					selection = sc.nextInt();;
					
					break; //입력예서 예외 발생하지 않으면 정상입력, while문 종료
				}
				catch(Exception e) {
					System.out.println("숫자만 입력하세요!");;
				}
			}
			
			switch(selection) {
			case 1://단어테스트
				quiz.play(vec);
				break;
			case 2://단어 삽입
				newWord.insert(vec);
				break;
			case 3://종료
				System.out.println("\"명품영어\"를 종료합니다.");
				sc.close();
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Wordtest player = new Wordtest();
		player.play();
	}
}
