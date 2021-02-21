public class AccountDriver {

	public static void main(String[] args) {
		Account account = new Account("ac001","John",50000);
		account.deposit("10000");
		account.withdraw(250.5);
		account.details();
		
		SavingsAccount savings = new SavingsAccount("ac001","John",50000,2000);
		savings.withdraw(1500);
		savings.details();
		
		RetirementAccount retirement = new RetirementAccount("ac001","John",50000,2030, 0.5);
		retirement.setYearOfRetirement(2015);
		retirement.setBonusPercent(0.65);
		retirement.details();
		
		KidsAccount kids = new KidsAccount("ac001","John",50000,2000,"Father");
		kids.withdraw(500,"Father");
		kids.details();
	}

}
