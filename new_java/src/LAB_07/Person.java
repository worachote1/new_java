package LAB_07;

public class Person {
	public String name;
	public String address;
	public String phone; 
	public String number;
	public String email;
	
    public Person() {

    }
    public void test_prn()
    {
    	
    }
    @Override
    public String toString() {
        return "Person{name=" + this.name +
                ", address=" + this.address +
                ", phoneNumber=" + this.phone +
                ", emailAddress=" + this.email + "} ";
    }
}
