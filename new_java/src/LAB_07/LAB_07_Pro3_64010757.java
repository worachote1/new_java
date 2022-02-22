package LAB_07;

public class LAB_07_Pro3_64010757 {

	public static void main(String[] args) {
		
		//Person
		System.out.println("Person");
		Person person = new Person();
        person.name = "Somsak";
        person.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        person.phone = "012-345-6789";
        person.email = "somsak@mymail.com";
		
        System.out.println(person);
        System.out.println();
        
		//Student
        System.out.println("Student");
		Student student = new Student();
		student.name = "Somsak";
		student.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
		student.phone = "012-345-6789";
		student.email = "somsak@mymail.com";
		
        System.out.println("Name = " + student.name);
        System.out.println("Address = " + student.address);
        System.out.println("Phone Number = " + student.phone);
        System.out.println("Email Address = " + student.email);	
		
		System.out.println(student);
        System.out.println();
		
		// Employee
        System.out.println("Employee");
        Employee employee = new Employee();
        employee.name = "Somsak";
        employee.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        employee.phone = "012-345-6789";
        employee.email = "somsak@mymail.com";
        employee.office = "KMITL";
        employee.salary = 20000;

        System.out.println("Name = " + employee.name);
        System.out.println("Address = " + employee.address);
        System.out.println("Phone Number = " + employee.phone);
        System.out.println("Email Address = " + employee.email);
       
        System.out.println(employee);
        System.out.println();

        // Faculty
        System.out.println("Faculty");
        Faculty faculty = new Faculty();
        faculty.name = "Somsak";
        faculty.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        faculty.phone = "012-345-6789";
        faculty.email = "somsak@mymail.com";
        faculty.office = "KMITL";
        faculty.salary = 44000;
        faculty.officeHours = 44;
        faculty.rank = "officer";

        System.out.println("Name = " + faculty.name);
        System.out.println("Address = " + faculty.address);
        System.out.println("Phone Number = " + faculty.phone);
        System.out.println("Email Address = " + faculty.email);
      
        System.out.println(faculty);
        System.out.println();

        //Staff
        System.out.println("Staff");
        Staff staff = new Staff();
        staff.name = "Somsak";
        staff.address = "1 Chalongkrung Road, Ladkrabang, BKK, 10520";
        staff.phone = "012-345-6789";
        staff.email = "somsak@mymail.com";
        staff.office = "KMITL";
        staff.salary = 20000;
        staff.title = "Title";

        System.out.println("Name = " + staff.name);
        System.out.println("Address = " + staff.address);
        System.out.println("Phone Number = " + staff.phone);
        System.out.println("Email Address = " + staff.email);
       
        System.out.println(staff);
        System.out.println();
    	
		}		
		
	}


