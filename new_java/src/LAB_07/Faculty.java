package LAB_07;

public class Faculty extends Employee{
	public double officeHours; 
	public String rank;
	
	Faculty() {
		
	}
	
    @Override
    public String toString() {
        return super.toString()+"Faculty{office hours=" + this.officeHours + ", rank=" + this.rank + "} ";
    }
}
