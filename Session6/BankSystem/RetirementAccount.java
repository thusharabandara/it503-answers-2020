import java.util.Calendar;

public class RetirementAccount extends Account {
		 
	private int yearOfRetirement;
	private double bonusPercent;
	int additionalYears;
	private Interest interest;

	RetirementAccount(String accountID, String accountHolder, double amount, int retire, double bonusP) {
	  super(accountID, accountHolder, amount); 
	  this.yearOfRetirement = retire;
	  this.bonusPercent = bonusP;
	  this.interest = new Interest(0.15);
	}
	
	public void setBonusPercent(double bonusPercent) {
		this.bonusPercent = bonusPercent;
	}
	public double getBonusPercent() {
		return this.bonusPercent;
	}
	
	public void setYearOfRetirement(int year) {
		this.yearOfRetirement = year;
	}
	
	public int getYearOfRetirement() {
		return this.yearOfRetirement;
	}
	
	
	public double calculateBonus(double bonus) {
		bonus = additionalYears * getBonusPercent();
		return bonus;
	}
	
	public boolean withdraw(double withdrawAmount, int year) {
		this.amount += this.interest.calInterest(this.amount);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if(withdrawAmount <= amount && getYearOfRetirement() <= currentYear ) {
			amount -= withdrawAmount;
			return true;
		}else{
			System.out.println("Cannot withdraw until the year " + getYearOfRetirement());
			return false;
		}
	}

	public void details() {
		super.details();
		System.out.println("Year of Retirement: " + this.getYearOfRetirement());
		System.out.println("Bonus Percent: " + this.getBonusPercent());
	}
}
