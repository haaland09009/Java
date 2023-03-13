package ch12;


public class Account1Ex {
	public static void main(String[] args) {
		Account1 act = new Account1(10000); // 잔액이 10000원인 통장 개설, 같은 통장을 밑에 5명이서 같이 쓴다 / 통장 : act
		Account1User[] au = new Account1User[5];
		au[0] = new Account1User(act, "보검");
		au[1] = new Account1User(act, "세정");
		au[2] = new Account1User(act, "하니");
		au[3] = new Account1User(act, "은우");
		au[4] = new Account1User(act, "로제");
		
		
		for(Account1User a : au) {
			a.start();
		}
		
	}

}
