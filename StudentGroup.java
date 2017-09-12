import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	public Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if (students == null)
			throw new IllegalArgumentException("No students in the group");
		else
		{
			this.students=students;
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		{
			throw new IllegalArgumentException("Index out of bounds");
		}
		else
		{
		  return this.students[index];	
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student == null || index<0 || index>=this.students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		  this.students[index].Student(student);	
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int length=this.students.length;
		Student[] stud=new Student[length+1];
		stud[0].Student(student);
		for(int i=0;i<students.length;i++)
		{
			stud[i+1].Student(this.students[i]);
		}
	
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int length=this.students.length;
		Student[] stud=new Student[length+1];
		stud[length].Student(student);
		for(int i=0;i<students.length;i++)
		{
			stud[i].Student(this.students[i]);
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("No students in the group");
		else
		{
			int length=this.students.length;
			Student[] stud=new Student[length+1];
			stud[length].Student(student);
			for(int i=0;i<index;i++)
			{
				stud[i].Student(this.students[i]);
			}
			for(int i=index+1;i<students.length;i++)
			{
				stud[i].Student(this.students[i]);
			}
			this.students=stud;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		{
			throw new IllegalArgumentException("Index out of bounds");
		}
		else
		{
			int length=this.students.length;
			Student[] stud=new Student[length+1];
			
			for(int i=0;i<index;i++)
			{
				stud[i].Student(this.students[i]);
			}
			for(int i=index+1;i<students.length;i++)
			{
				stud[i-1].Student(this.students[i]);
			}
			this.students=stud;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int flag=0;
		if (students == null)
			throw new IllegalArgumentException("No students in the group");
		else
		{
		 for(int i=0;i<students.length;i++)
		 {
		 	if(this.students[i].equals(student))
			{
				flag++;
				int index=i;
				int length=this.students.length;
				Student[] stud=new Student[length+1];
				stud[length].Student(student);
				for(int j=0;j<index;j++)
				{
					stud[j].Student(this.students[j]);
				}
				for(int j=index+1;j<students.length;j++)
				{
					stud[j-1].Student(this.students[j]);
				}
				this.students=stud;
				break;
			}
		 }
		if(flag==0)
		{
			throw new IllegalArgumentException("student doesn't exist");
		}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		{
			throw new IllegalArgumentException("Index out of bounds");
		}
		else{
			int length=this.students.length-index+1;
			Student[] stud=new Student[length];
			for(int i=0;i<length;i++)
			{
				stud[i].Student(this.students[i]);
			}
			this.students=stud;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int flag=0;
		if (students == null)
			throw new IllegalArgumentException("No students in the group");
		else
		{
		for(int i=0;i<students.length;i++)
		{
			if(this.students[i].equals(student))
			{
				flag++;
				int index=i;
				int length=this.students.length-index+1;
				Student[] stud=new Student[length];
				for(int j=0;j<length;j++)
				{
					stud[j].Student(this.students[j]);
				}
				this.students=stud;
			}
		}
		if(flag<0)
		{
			throw new IllegalArgumentException("student doesn't exist");
		}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		{
			throw new IllegalArgumentException("Index out of bounds");
		}
		else
		{
			int length=this.students.length-index+1;
			Student[] stud=new Student[length];
			for(int i=index;i<length;i++)
			{
				stud[i].Student(this.students[i]);
			}
			this.students=stud;
			
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int flag=0;
		if (student== null)
			throw new IllegalArgumentException("No students in the group");
		else
		{
			for(int i=0;i<students.length;i++)
			{
				if(this.students[i].equals(student))
				{
					flag++;
					int index=i;
					int length=this.students.length-index+1;
					Student[] stud=new Student[length];
					for(int j=0;j<length;j++)
					{
						stud[j].Student(this.students[j]);
					}
					this.students=stud;
				}
			}
			if(flag<0)
			{
				throw new IllegalArgumentException("student doesn't exist");
			}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
