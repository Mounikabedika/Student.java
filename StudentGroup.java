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

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		this.students=new Student[Student[]];// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		this.student=new setStudents[Student[] students];
		return null;// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		this.student=new Student[index];// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		this.student=new setStudent[Student[],index[]];// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		add.text="First=";
		return null;// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		add.text="Last=";
		return null;// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		this.student=// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		for(i=0;i<n;i++)
		{
		swap=array[a];
		array[a]=array[b];
		array[b]=swap;
		}
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
        		System.out.print("Please enter date of birth in dd-mm-yyyy");
        		Scanner scanner = new Scanner(System.in);
        		String input = scanner.nextLine();
        		scanner.close();
        		sdf = new SimpleDateFormat("dd-mm-yyyy");
        		Calendar dob = Calendar.getDate();
        		System.out.println("Age is:" + getAge(dob));
		return 0;
    		}// Add your implementation here
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
