package entities;

public class SavingsAccountUpEndDownCasting extends AccoutHeranca{

	private Double interesRate;
	
	public SavingsAccountUpEndDownCasting() {
		super();
	}

	public SavingsAccountUpEndDownCasting(Integer number, String holder, Double balance, Double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}

	public Double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}
	
	public void updateBalance() {
		balance += balance * getInteresRate();
	}
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
