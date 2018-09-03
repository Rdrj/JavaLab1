package assign1;
import java.io.*;
import java.util.*;
public class CSX_358_HW1_16103068 
{
		public static void main(String[] args)throws Exception
		{
			File file=new File("//home//rdrj-hunt//Java Lab//lab1//HW1-data.txt");
			Scanner sc =new Scanner(file);
			String str;
			List<Student> students =new ArrayList<Student>();
			Student student;
			while(sc.hasNextLine())
			{
				student =new Student();
				str=sc.nextLine();
				student.init(str);
				students.add(student);
			}
			sc.close();
			
			Filecreator fw=new Filecreator();
			fw.init(students);
			System.out.println("complete");
		}
}
