package wordtest;

import java.util.Scanner;
import java.util.Vector;
public class Wordtest {
	private Vector<Word> vec = new Vector<>();
	private int selection; //������� ������ ���� ����
	private Quiz quiz = new Quiz();
	private NewWord newWord = new NewWord();
	private Scanner sc = new Scanner(System.in);
	
	public void play(){
		newWord.firstPlay(vec); //���ʽ���� �⺻�ܾ� 10�� ����
		
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�.");
		
		
		while(true) {//���α׷��� �ݺ������� ���� while��
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>>");
			
			while(true) {//�������� �Է��� �����ϱ� ���� while��
				try {
					selection = sc.nextInt();;
					
					break; //�Է¿��� ���� �߻����� ������ �����Է�, while�� ����
				}
				catch(Exception e) {
					System.out.println("���ڸ� �Է��ϼ���!");;
				}
			}
			
			switch(selection) {
			case 1://�ܾ��׽�Ʈ
				quiz.play(vec);
				break;
			case 2://�ܾ� ����
				newWord.insert(vec);
				break;
			case 3://����
				System.out.println("\"��ǰ����\"�� �����մϴ�.");
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
