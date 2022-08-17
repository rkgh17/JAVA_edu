package exercise_20;
import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static int a = 0;
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1)
				createAccount();
			else if (selectNo == 2)
				accountList();
			else if (selectNo == 3)
				deposit();
			else if (selectNo == 4)
				withdraw();
			else if (selectNo == 5)
				run = false;
		}
		System.out.println("프로그램 종료");
	}
	
	public static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌 생성");
		System.out.println("---------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("계좌주");
		String owner = scanner.next();
		System.out.print("초기입금액");
		int balance = scanner.nextInt();
		if(accountArray[a]== null)
			accountArray[a] = new Account(ano, owner, balance);
		a++;	
		System.out.println("계좌가 생성되었습니다.");
	}
	
	public static void accountList() {
		System.out.println("---------");
		System.out.println("계좌 목록");
		System.out.println("---------");
		while(true) {
			int n=0;
			System.out.println("" + accountArray[n].getAno() + "\t" + accountArray[n].getOwner() + "\t" + accountArray[n].getBalance());
			n++;
			if(accountArray[n] == null)
				break;
		}
	}
	
	public static void deposit() {
		int a = 0;
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호");
		String findno = scanner.next();
		a = findAccount(findno).getBalance();
		System.out.print("예금액");
		int plus = scanner.nextInt();
		a+=plus;
		findAccount(findno).setBalance(a);
		
		
		
	}

	public static void withdraw() {
		int a = 0;
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호");
		String findno = scanner.next();
		a = findAccount(findno).getBalance();
		System.out.print("출금액");
		int minus = scanner.nextInt();
		a-=minus;
		findAccount(findno).setBalance(a);
		
	}
	
	private static Account findAccount(String ano) {
		int a = 0;
		while(true) {
			if(ano.equals(accountArray[a].getAno()))
				return accountArray[a];
			else
				a++;
		}
	}
}
