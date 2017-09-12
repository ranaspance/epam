import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		StudentGroup cse=new StudentGroup(2);
		String csea = "1000-09-14";
        String cseb = "1220-07-08";
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date d1,d2;
        try{
         d1 = df.parse(csea);
         d2 = df.parse(cseb);
        
           
            cse.getStudents()[0]=new Student(1,"Akhil",d1,100);
            cse.getStudents()[1]=new Student(2,"sam",d2,39);
}catch(Exception e)
{}
	Student s=cse.getStudent(1);
	System.out.println(s);
	
	
	}

}
