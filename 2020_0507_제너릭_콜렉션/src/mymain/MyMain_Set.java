package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MyMain_Set {

	public static void main(String[] args) {
		
	
		// �������̽� = Ŭ����
		// ��뼳�� = ������� (���輭)

		Random rand = new Random();										
													// �ߺ����� �����������
													// Hashset : ���ĵ�������
													// Treeset : �������� ����
		// �ζ� 6�ڸ��̱� (����) 		// �ݺ�Ƚ�� 6��
		Set<Integer> set = new TreeSet<Integer>();
		int n = 6;
		while (n > 0) {
			// n = 6 5 4 3 2 1 (6�� ȸ��)

			int su = rand.nextInt(45) + 1;
			if (set.add(su) == false)
				continue;
			n--;								// if (!set.add(su)==true) (���� ������) ����, �ȵ���. Set �� add���� ���� ���� �ִ°��
												// �ݺ��� üũ�ϱ�

			

		}

		System.out.println(set.toString());
		
		//Set �ǿ�� �����ϴ� ���     //(1)// //set �� ��ġ������ ���� (÷�ڹ�� ���Ұ�)
				
			//���
		System.out.println("--����loop--");
		
		for (int su : set) {  //����loop��� : set�ȿ� su (����) �� ���´�. �ѹ����������� ����loop �� �������
				
			//���
			System.out.print(su + " ");
		}
		//����
		System.out.println();
		
		//Set �ǿ�� �����ϴ� ���     //(2)// //set �� ��ġ������ ���� (÷�ڹ�� ���Ұ�)
		
		System.out.println("--iterator���--"); //interator ��� : Ž����/�˻��� �̿��� �������̽� 
												//�б������̶� ������ �Ҽ��ִ� ���� ���� �Ұ���
		
		Iterator<Integer> it = set.iterator();
		
		//while �Ἥ �̾ƿ���
		
		while(it.hasNext()){ //���� ������ �ִ��� hasnext ������Ȯ�� > �����̵� > �����̵� > �����ð� �ֳ� > ���� while Ż��
			
			int su = it.next();
			System.out.print(su + " ");
		}
		
		System.out.println();
		
		//(3) ��� �����
		System.out.println();
		
		set.clear();
		System.out.println(set);
		
		if (set.isEmpty())
			System.out.println("set is empty");
		}
		
	}


