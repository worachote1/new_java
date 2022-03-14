package EPT_ET_13;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ET5 {
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.bot.or.th/App/RSS/fxrate-all.xml");
		Scanner sc = new Scanner(url.openStream());
		StringBuffer sb = new StringBuffer(); 
		String ss="";
		String titleTag="<title>",endTiltleTag="</title>";
		int startTiltleIndex=-1,endTitleIndex=-1;
		while(sc.hasNext()) {
			ss = sc.nextLine();
			if(ss.indexOf("<item")!=-1 && ss.indexOf("</item>")!=-1)
			{
				startTiltleIndex = ss.indexOf(titleTag);
				endTitleIndex = ss.indexOf(endTiltleTag);
				System.out.println(ss.substring(startTiltleIndex+titleTag.length(), endTitleIndex));
			}
		}
		
		/*
		// You can print double quotes in java by escape double quotes using backslash character(\).
		String test = "<item rdf:about=\"https://www.bot.or.th/App/RSS/fxrate-PKR.xml\"><title>TH: 0.1844 THB = 1 PKR 2022-03-11 Bank of Thailand Buying Rate</title><link>http://www.bot.or.th/english/statistics/financialmarkets/exchangerate/_layouts/Application/ExchangeRate/ExchangeRate.aspx</link><description>0.1844 Thai Baht = 1 PKR</description><dc:language>en</dc:language><dc:date>2022-03-11</dc:date><dc:format>text/html</dc:format><cb:country>TH</cb:country><cb:baseCurrency>THB</cb:baseCurrency><cb:targetCurrency>PKR</cb:targetCurrency><cb:value frequency=\"business\" decimals=\"4\">0.1844</cb:value><cb:rateType>Daily</cb:rateType><cb:application>statistics</cb:application></item>";
		System.out.println("\n\ntest : ");
		System.out.println(test);
		System.out.println("After replaceAll");
		System.out.println(test.replaceAll("<[^>]*>", ""));
		*/
	}
	
}
