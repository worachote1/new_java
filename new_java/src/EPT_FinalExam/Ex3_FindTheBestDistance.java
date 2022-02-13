package EPT_FinalExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/* In Text File :
 
 	Country,City,AccentCity,Region,Population,Latitude,Longitude
*/
public class Ex3_FindTheBestDistance{
	public static Double findDistFromLatAndLong(double lat1, double lon1, double lat2, double lon2) {
	    double theta = Math.abs(lon1 - lon2);
	    double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
	    dist = Math.acos(dist);
	    dist = rad2deg(dist);
	    dist = dist * 60 * 1.1515;       
	    
	    //Kilometer
	    dist = (dist * 1.609344);
	 
	    return dist;
	}
	
	public static double deg2rad(double deg) {
	    return (deg * Math.PI / 180.0);
	}
	public static double rad2deg(double rad) {
	    return (rad * 180 / Math.PI);
	}

	public static void main(String[] args) throws IOException {
		double k; 
		String name;
		
		try {
			File file = new File("D:/worldcitiespop_revise.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			Scanner sc = new Scanner(System.in);
			
			String ss[];
			String s;
			
			//create ArrayList
			ArrayList<String> city_name;
			city_name = new ArrayList<String>();
			
			ArrayList<Double> latitude,longitude;
			latitude = new ArrayList<Double>();
			longitude = new ArrayList<Double>();
			
			//Contain distance calculated from latitude and longitude
			ArrayList<Double> distance = new ArrayList<Double>();
			
			while(reader.readLine() != null)
			{
				s = reader.readLine();
				ss = s.split(",");
				System.out.println(Arrays.toString(ss));
				//ss[1] => city_name
				//ss[5] => latitude
				//ss[6] => longtitude
				city_name.add(ss[1]);
				latitude.add(Double.parseDouble(ss[5])); 
				longitude.add(Double.parseDouble(ss[6]));
			}
			
			//Input cities and distance
			while(true)
			{
				System.out.println("City : ");
				name = sc.nextLine().toLowerCase().trim();
				if(city_name.contains(name))
				{
					break;
				}
				else System.out.println("Not found "+name);
			}	
			System.out.println("Distance : ");
			k = sc.nextDouble();
			
			final int CITY_INDEX = city_name.indexOf(name);
			
			//Now find all city that its distance less than input(k)
			for(int i=0 ; i < city_name.size() ; i++)
			{
				if(k > findDistFromLatAndLong(
						latitude.get(CITY_INDEX), longitude.get(CITY_INDEX) , latitude.get(i) , longitude.get(i)
					)
					&& (i!=CITY_INDEX)	
				)
				{
					System.out.println(city_name.get(i));
				}
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

