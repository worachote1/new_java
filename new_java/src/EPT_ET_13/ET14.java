package EPT_ET_13;

public class ET14 {

	public static void main(String[] args) {
		RecentlyUsed r = new RecentlyUsed(3);
		System.out.println(r.toString());
		r.add("A");
		System.out.println(r.toString());
		r.add("B");
		System.out.println(r.toString());
		r.add("C");
		System.out.println(r.toString());
		r.add("B");
		System.out.println(r.toString());
		r.add("B");
		System.out.println(r.toString());
		r.add("D");
		System.out.println(r.toString());
		
	}

}
