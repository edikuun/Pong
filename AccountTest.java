public class AccountTest{
		public static void main(String[] args){
			Account mine = new Account(201504586, 28000);
			System.out.println(mine);
			mine.setBalance(30000);
			System.out.println(mine); // changes to 30000
			mine.debit(5000);
			System.out.println(mine); // changes to 25000
			mine.debit(26000);
			System.out.println(mine); // prints exceeds
		}
	}