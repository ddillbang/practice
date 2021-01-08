package wordtest;

import java.util.Vector;
import java.util.Scanner;
import java.util.StringTokenizer;
public class NewWord {
	private StringTokenizer token;
	private String english;
	private String korean;
	
	public void insert(Vector<Word> vec) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		
		while(true) {//사용자가 "그만"을 입력하기 전까지 반복해서 입력받기
			System.out.print("영어 한글 입력 >> ");
			
			english = sc.nextLine();
			
			token = new StringTokenizer(english, " ");
			
			if(token.hasMoreTokens()) {
				english = token.nextToken();
				
				if(english.equals("그만")) return; //사용자가 "그만"을 입력하여 종료
				else if(token.hasMoreTokens()) {
					korean = token.nextToken();
					
					vec.add(new Word(english, korean));
				}
			}
		}
	}
	
	public void firstPlay(Vector<Word> vec) { //최초 실행시 기본단어 10개 설정
		vec.add(new Word("aplle", "사과"));
		vec.add(new Word("future", "미래"));
		vec.add(new Word("mother", "엄마"));
		vec.add(new Word("father", "아빠"));
		vec.add(new Word("dinner", "저녁"));
		vec.add(new Word("nature", "자연"));
		vec.add(new Word("friend", "친구"));
		vec.add(new Word("bear", "곰"));
		vec.add(new Word("dog", "개"));
		vec.add(new Word("cat", "고양이"));
	}
}
