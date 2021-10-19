/*
 * �ڹ� ������ �Է� �޾� ����� ���ϴ� ����ó�� ������Ʈ�� �õ��غ���.
 * ������ ������ ����.
 * 1. �л��� �й�, �ڹ�����, ����� 2���� �迭(int score[10][3])�� �����Ѵ�.
 * 2. �б� �� �л����� �ִ� 10���̴�.
 * 3. �� ������ ����, ����, �ڹ��̸� 0~100�� ������ ������ ���´�.
 * 4. ������ ���� ���� ������ ����.
 * 5. ��� ���� ó���� ������ 1�� ���� 10�� ������ ����Ѵ�.
 * 6. ������� ����ϱ� ���� bubble ������ �̿��Ѵ�.
 */
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = new int[][] {
			{1401, 100, 1}, {1402, 88, 1}, {1403, 89, 1},
			{1404, 100, 1}, {1405, 95, 1}, {1406, 79, 1},
			{1407, 65, 1}, {1408, 98, 1}, {1409, 83, 1},
			{1410, 88, 1}
		};
		//inputscore(); ���߿� ȥ�� ������ �� �غ� ��.
		getRank(score);
		dosortBubble(score);
		printResult(score);
	}
	//private�� �ƹ��� ���� �� �� ����.(���Ȱ�̶��� ��!~, public�� �ƹ��� �� �� �ֽ��ϴ�.)
	public static void getRank(int[][] score) {
		// TODO Auto-generated method stub
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i][1]<score[j][1])
					score[i][2]++;
			}
		}
	}
	
	public static void dosortBubble(int[][] score) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j>0; j--) {
				if(score[j][2]>score[j-1][2]) {
					for(int k = 0; k<3; k++) {
						temp = score[j][k];
						score[j][k] = score[j-1][k];
						score[j-1][k] = temp;
					}
				}
			}
		}
		/*int temp=0;
		for(int i = score.length-1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(score[j][2]>score[j+1][2]) {
					for(int k = 0; k<3; k++) {
						temp = score[j][k];
						score[j][k] = score[j+1][k];
						score[j+1][k] = temp;
					}
				}
			}
		}*/
		
	}
	
	public static void printResult(int[][] score) {
		// TODO Auto-generated method stub
		System.out.println("*****���� ó�� ���*****\n");
		System.out.println("�й�\t�ڹ�����\t���");
		for(int i = 0; i<score.length; i++) {//�࿡ ���� ��. i�� ����
			for(int j = 0; j<score[i].length; j++) { //���� ���� ��. j�� ����
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}



}