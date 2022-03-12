package EPT_ES_12;

public class ES8 {

	public static String cutLast(String s)
	{
		s = s.substring(0,s.length()-1);
		return s;
	}
	public static void main(String[] args) {	
		System.out.println(cutLast("testWord"));
	}
}
