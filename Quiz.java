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
		System.out.println("���� "+ vec.size() + "���� �ܾ ����ֽ��ϴ�. -1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
		
		while(true){//����ڰ� -1�� �Է��� �����Ҷ����� �ݺ�����
			randomNum = (int)(Math.random()*vec.size());//Vector�� ����� Word�� �������� �������� ���� ����
			collection = (int)(Math.random()*4 + 1); //������ �� ��ȣ 1~4�� ������ ����
			
			word = vec.get(randomNum);
			System.out.println(word.getEnglish() + "?"); //����
			
			for(int i = 1; i <= 4; i++) { //�������
				randomNum = (int)(Math.random()*vec.size());
				tempWord = vec.get(randomNum);
				
				makeDif(vec); //Word�� korean�� tempWord�� korean�� ���� �ߺ����⸦ �������� �ʱ� �ϱ�����
				
				if(collection == i) //�����ȣ�� �����ȣ�� ������
					System.out.print("(" + i + ")" + word.getKorean() + " ");
				else //�����ȣ�� �����ȣ�� �ٸ���
					System.out.print("(" + i + ")" + tempWord.getKorean() + " ");
			}
			System.out.print(" :> ");
			
			try {
				selection = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("���ڸ� �Է��ϼ��� !!");
			}
			
			if(selection == -1) return;
			
			if(selection == collection) System.out.println("Excellent !!");
			else System.out.println("No. !!");
		}
		
	}
	
	private void makeDif(Vector<Word> vec) { //�ߺ������� �� ��츦 �����ϱ� ���� �޼ҵ�
		if(word.getKorean().equals(tempWord.getKorean())) { //������ �ѱ۰� ���⸦ ������ �ѱ��� �������
			randomNum = (int)(Math.random()*vec.size());
			tempWord =  vec.get(randomNum);
			
			makeDif(vec); //����Լ��� ȣ���Ͽ� ��˻�
		}
		
		else return;
	}
	
}
