package EPT_ES_12;

public class ES9 {

	public static String cutFirst(String s)
	{
		s = s.substring(1);
		return s;
	}
	public static void main(String[] args) {	
		System.out.println(cutFirst("testWord"));
	}

}
