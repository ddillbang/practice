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
		
		System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
		
		while(true) {//����ڰ� "�׸�"�� �Է��ϱ� ������ �ݺ��ؼ� �Է¹ޱ�
			System.out.print("���� �ѱ� �Է� >> ");
			
			english = sc.nextLine();
			
			token = new StringTokenizer(english, " ");
			
			if(token.hasMoreTokens()) {
				english = token.nextToken();
				
				if(english.equals("�׸�")) return; //����ڰ� "�׸�"�� �Է��Ͽ� ����
				else if(token.hasMoreTokens()) {
					korean = token.nextToken();
					
					vec.add(new Word(english, korean));
				}
			}
		}
	}
	
	public void firstPlay(Vector<Word> vec) { //���� ����� �⺻�ܾ� 10�� ����
		vec.add(new Word("aplle", "���"));
		vec.add(new Word("future", "�̷�"));
		vec.add(new Word("mother", "����"));
		vec.add(new Word("father", "�ƺ�"));
		vec.add(new Word("dinner", "����"));
		vec.add(new Word("nature", "�ڿ�"));
		vec.add(new Word("friend", "ģ��"));
		vec.add(new Word("bear", "��"));
		vec.add(new Word("dog", "��"));
		vec.add(new Word("cat", "�����"));
	}
}
