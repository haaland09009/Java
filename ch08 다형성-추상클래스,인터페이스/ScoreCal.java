package ch08;

public class ScoreCal{
	String subject; int len, sum = 0;
	String[] name; String[] title; int[][] score; int[] tot;
	public ScoreCal(String subject, String[] name, String[] title, int[][] score, int len) {
		this.subject = subject; this.title = title; this.score = score; this.name = name;
		this.len = len;
		tot =  new int[score[0].length];
	}
	public void print() {
		System.out.println(subject);
		System.out.println();
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
			
		System.out.println();
			
		for(int i = 0; i < len; i++) {
			System.out.print("=");
		}
			
		System.out.println();
			
		for(int i = 0; i < score.length; i++) { 
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j]; 
				tot[j] += score[i][j]; 
				}
				System.out.println(sum + "\t" + sum/score[i].length);
				sum = 0;
			}
			
		for(int i = 0; i < len; i++) {
			System.out.print("=");
			}
			
		System.out.print("\n합계\t");
		for(int j = 0 ; j < tot.length; j++) {
			System.out.print(tot[j] + "\t");
			sum += tot[j];
		}
			
		System.out.print(sum + "\t" + sum / tot.length / name.length);
			
		}

	}

