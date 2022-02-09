package LAB_06;

public class Tax {
	private int fillingStatus;
	public static final String STATUS[]=
		{
				"SINGLE_FILER",
				"MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER)",
				"MARRIED_SEPARATELY",
				"HEAD_OF_HOUSEHOLD"
		};
	private int brackets[][];
	private double rates[];
	private double taxableIncome;
	
	Tax()
	{
		
	}
	Tax(int fillingStatus,int brackets[][],double rates[],double taxable_income)
	{
		this.fillingStatus = fillingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxable_income;
	}
	
	void setFillingStatus(int fillingStatus)
	{
		this.fillingStatus= fillingStatus;
	}
	void setBrackets(int brackets[][])
	{
		this.brackets = brackets;
	}
	void setRates(double []rates)
	{
		this.rates = rates;
	}
	void setTaxableIncome(int taxableIncome)
	{
		this.taxableIncome = taxableIncome;
	}
	
	int getFillingStatus()
	{
		return fillingStatus;
	}
	int[][] getBrackets()
	{
		return brackets;
	}
	double[] getRates()
	{
		return rates;
	}
	double getTaxableIncome()
	{
		return taxableIncome;
	}
	
	double getTax()
	{
		return brackets[getFillingStatus()][0] * rates[0] +
				(brackets[getFillingStatus()][1] - brackets[getFillingStatus()][0]) * rates[1] +
				(brackets[getFillingStatus()][2] - brackets[getFillingStatus()][1]) * rates[2] +
				(brackets[getFillingStatus()][3] - brackets[getFillingStatus()][2]) * rates[3] +
				(brackets[getFillingStatus()][4] - brackets[getFillingStatus()][3]) * rates[4] +
				(getTaxableIncome() - brackets[getFillingStatus()][4]) * rates[5];
	}
}
