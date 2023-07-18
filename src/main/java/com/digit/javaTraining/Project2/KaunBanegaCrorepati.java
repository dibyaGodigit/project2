package com.digit.javaTraining.Project2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * rules :
 * - There will be 1 question with 4 options .
 * - There will be two life-line .
 * - if any-one life line used then we can't use that life line again .
 * - if candidate answer the question right then that candidate will rewarded some amount and another question will pop up.
 *
 */

class Candidate{
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String id;
	static byte age;
	static String Location;
	static HashMap<String,Long> acc = new HashMap<String, Long>();
	static String n;
	public static void add_account() {
		System.out.println("\nEnter your account number");
		n = sc.nextLine();
		acc.put(n,0l);
		System.out.println("\nAccount Added\n");
	}
	
	public static  void add_reward(long reward ) {
		acc.put(n, acc.get(n)+reward);
		System.out.println("\nReward Recived\n");
	}
}

class Questions{
	
	String[] qs = new String[] {
			"What is the name of our Country ?","What is the name of our national Bird ?",
			"What is the color of Sky ?", "Who is our prime minister ?","What is the chemical formula for Water ?",
			"What is the name of our national Fruit ?","What is the name of our national Animal ?","On which year IPL started ?",
			"What is the full form of RCB ?","How many times RCB Won IPL ?"		
	};
	
	static String[][] opts = new String[][] {
		{"India","Austrelia","Dubai","Iran"},
		{"Chicken","Peacock","Pegion","Duck"},
		{"Red","White","Blue","Yellow"},
		{"Narendra Modi","Dibya kumar","Ujjwal","Sajal"},
		{"N2O","CH4","NH3","H2O"},
		{"Banana","Lichi","Mango","Apple"},
		{"Elephant","Tiger","Lion","Fox"},
		{"2001","2018","2020","2008"},
		{"Royal challengers Banglore","Royal chance Bhutan ","Rabel Chalengers Bengaluru","Red Color Blood"},
		{"13","4","1","None"}
	};
	
	static int[] ans = new int[] {1,2,3,1,4,3,2,4,1,4};
	
	
}

class Fifty_fifty extends KaunBanegaCrorepati{
	
	public void m5050( String[] opts, int ans) {
		String[] opts50;
		if(opts[0].equals(opts[ans-1])) {
		 opts50 = new String[] {opts[ans-1],opts[1]};
		}
		else if(opts[1].equals(opts[ans-1])) {
			opts50 = new String[] {opts[ans-1],opts[0]};
		}
		else if(opts[2].equals(opts[ans-1])) {
			opts50 = new String[] {opts[ans-1],opts[1]};
		}
		else  {
			opts50 = new String[] {opts[ans-1],opts[2]};
		}
		
		Questions.opts[KaunBanegaCrorepati.count_qs-1] = opts50;
		Questions.ans[KaunBanegaCrorepati.count_qs-1] = 1; 
		askQuestions();
		
	}
}

class AudiencePoll extends KaunBanegaCrorepati{
	public void audiencepoll(String ans) {
		System.out.println("\nMaximum Audience Choose '"+ans+"' \n This Is Correct Answer . ");
		System.out.println("\nCongratulations..... You Gave The Right Answer .");
		Candidate.add_reward(100000);
		System.out.println("\n100000 Added to your Account no : "+Candidate.n+"\n");
	}
}


public class KaunBanegaCrorepati {
	Scanner sc = new Scanner(System.in);
	Questions qs = new Questions();
	static int _5050 = 1;
	static int audiencepoll = 1;
	
	static int count_qs = 1;
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		Candidate.name = sc.nextLine();
		
		System.out.println("\nEnter Your age : ");
		Candidate.age = sc.nextByte();
		sc.nextLine();
		System.out.println("\nEnter your LOcation : ");
		Candidate.Location = sc.nextLine();
		
		Candidate.add_account();
		
		new KaunBanegaCrorepati().askQuestions();
		
}
	
	public void askQuestions() {
		
		while(true) {
			
			switch(count_qs) {
			case 1:
				int ip;
				Question1(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 2:
				
				Question2(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 3:
				
				Question3(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 4:
				
				Question4(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 5:
				
				Question5(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 6:
				
				Question6(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 7:
				
				Question7(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 8:
				
				Question8(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 9:
				
				Question9(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			case 10:
				
				Question10(qs.opts[count_qs-1]);
				if(_5050 == 1 || audiencepoll == 1) {
					System.out.println("\nWant Life-Line ?? (Y/N)");
				String ip1 = sc.next();
				if((ip1.toLowerCase()).equals("y")) {
					LL();
					break;
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
					break;
				}
				}
				else {
					System.out.println("\nEnter Your Answer -> ");
					ip = sc.nextInt();
					checkAnswer(ip);
					count_qs++;
				}
				break;
			
			}
		}
	}
	
	public void LL() {
		while(true) {
		System.out.println("\nAvialable LIFE-LINES :\n");
		System.out.println("1. 50-50\n2. Audience Poll");
		System.out.println("\nEnter your choice -->");
		int ip = sc.nextInt();
		if(_5050 == 0 && ip == 1) {
			System.out.println("\nMay Be You have Already Used this LIFE_LINE.\n");
			continue;
		}
		if(ip == 1) {
			Fifty_fifty f = new Fifty_fifty();
			_5050--;
			f.m5050(qs.opts[count_qs-1], qs.ans[count_qs-1]);
			break;
		}
		else if(ip == 2) {
			AudiencePoll ap = new AudiencePoll();
			audiencepoll--;
			ap.audiencepoll(qs.opts[count_qs-1][qs.ans[count_qs-1]-1]);
			count_qs++;
		break;	
		}
		
		}
	}

public void checkAnswer(int ans) {
	if(qs.ans[count_qs-1] != ans) {
		System.out.println("\n\nOpps!!... You Lose The Game .");
		System.out.println("\n\n Your Total Reward is : $ "+Candidate.acc.get(Candidate.n));
		System.exit(0);
	}
	else {
		System.out.println("\nCongratulations..... You Gave The Right Answer .");
		Candidate.add_reward(100000);
		System.out.println("\n100000 Added to your Account no : "+Candidate.n+"\n");
	}
}


public void Question1(String[] opts1) {
	
	System.out.println("1. "+qs.qs[0]+"\n");
	for(int i=0;i<opts1.length;i++) {
		System.out.println((i+1)+". "+opts1[i]);
	}
}

public void Question2(String[] opts2) {
	
	System.out.println("2. "+qs.qs[1]+"\n");
	for(int i=0;i<opts2.length;i++) {
		System.out.println((i+1)+". "+opts2[i]);
	}
}

public void Question3(String[] opts3) {
	
	System.out.println("3. "+qs.qs[2]+"\n");
	for(int i=0;i<opts3.length;i++) {
		System.out.println((i+1)+". "+opts3[i]);
	}}

public void Question4(String[] opts4) {
	
	System.out.println("4. "+qs.qs[3]+"\n");
	for(int i=0;i<opts4.length;i++) {
		System.out.println((i+1)+". "+opts4[i]);
	}
}


public void Question5(String[] opts5) {
	
	System.out.println("5. "+qs.qs[4]+"\n");
	for(int i=0;i<opts5.length;i++) {
		System.out.println((i+1)+". "+opts5[i]);
	}
}


public void Question6(String[] opts6) {
	
	System.out.println("6. "+qs.qs[5]+"\n");
	for(int i=0;i<opts6.length;i++) {
		System.out.println((i+1)+". "+opts6[i]);
	}
}

public void Question7(String[] opts7) {
	
	System.out.println("7. "+qs.qs[6]+"\n");
	for(int i=0;i<opts7.length;i++) {
		System.out.println((i+1)+". "+opts7[i]);
	}
}
public void Question8(String[] opts8) {
	
	System.out.println("8. "+qs.qs[7]+"\n");
	for(int i=0;i<opts8.length;i++) {
		System.out.println((i+1)+". "+opts8[i]);
	}
}
public void Question9(String[] opts9) {
	
	System.out.println("9. "+qs.qs[8]+"\n");
	for(int i=0;i<opts9.length;i++) {
		System.out.println((i+1)+". "+opts9[i]);
	}
}
public void Question10(String[] opts10) {
	
	System.out.println("10. "+qs.qs[9]+"\n");
	for(int i=0;i<opts10.length;i++) {
		System.out.println((i+1)+". "+opts10[i]);
	}
}

}
