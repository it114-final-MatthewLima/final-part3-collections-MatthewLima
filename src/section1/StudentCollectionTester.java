/**
 * 
 */
package section1;

/**
 * @author Matt
 *
 */
public static class StudentCollectionTester {
	public static List<Student>createStudents(){
		List<Student> myStudents = new ArrayList<Person>();
		Student s = {"Allison", 19,1,4.0}
				
		}
	public SortStudent(){
		studentOrig = createStudents();
		Student = studentOrig;
	}
	
	public static List<Student> void sortStudent(){
		System.out.println("BEFORE sorting:" + Student);

		Collections.sort(Student);
		System.out.println("AFTER sorting:" + Student);

		return null;
		
	}
	public static List<Student> void sortStudentInReverseOfNaturalOrder(){
		Students = new ArrayList<Student>(studentOrig);
		System.out.println("BEFORE sorting:" + Student);

		Comparator reverseOfNaturalOrderComparator = Collections.reverseOrder();
		Collections.sort(Student, reverseOfNaturalOrderComparator);
		System.out.println("AFTER sorting:" + Student);

		return null;
	}
	public static List<Student> void sortStudentBasedOnGrade(){
		Students = new ArrayList<Student>(studentOrig);
		System.out.println("BEFORE sorting:" + Student);

		Student.StudentGradeComparator StudentGradeComparator = new Student.StudentGradeComparator();
		Collections.sort(Student, StudentGradeComparator);
		System.out.println("AFTER sorting:" + Student);

		return null;
	}
	
	public static List<Student> void sortStudentBasedonReverseAverage(){
		Student = studentOrig;
		System.out.println("BEFORE sorting:" + Student);

		Student.GradeComparator StudentGradeComparator = new Student.StudentGradeComparator();
		Comparator reverseGradeComparator = Collections.reverseOrder(StudentGradeComparator);
		Collections.sort(Student, reverseGradeComparator);
		System.out.println("AFTER sorting:" + Student);

		return null;
	}
	public static List<Student>shuffleStudents(){
		Student = new ArrayList<Student>(studentOrig);
		System.out.println("BEFORE shuffling:" + Student);

		Collections.shuffle(Student);
		System.out.println("AFTER shuffling:" + Student);

		return Student;
	}
	public static List<Student>reverseStudents(){
		Student = new ArrayList<Student>(studentOrig);	
		System.out.println("BEFORE reversing:" + Student);

		Collections.reverse(Student);
		System.out.println("AFTER reversing:" + Student);

		return Student;
	}
	public static List<Student>swap1stAnd2ndStudents(){
		Student = new ArrayList<Student>(studentOrig);
		System.out.println("BEFORE swapping:" + Student);

		int lastElementIndex = Student.size() - 1;
		Collections.swap(Student, 0 , lastElementIndex);
		System.out.println("AFTER  swapping:" + Student);

		return Student;
	}
	public static List<Student>copyStudents(){
		List<Student> copyStudent = new ArrayList<Student>(studentOrig.size());
		Student s;
		for (int i = 0; i < studentOrig.size(); i++) {
			s = new Student("", 0);
			copyStudent.add(s);
		}
		Collections.copy(copyStudent, studentOrig);
		System.out.println("student copy:" + copyStudent);

		Collections.sort(copyStudent);
		System.out.println("Sorted copy:" + copyStudent);

		System.out.println("Original student:" + studentOrig);
		return copyStudent;
	}
	public static StudentmaxStudentInStudents(){
		Student = new ArrayList<Student>(studentOrig);	
		System.out.println("original student:" + Student);
		Collections.sort(Student);
		System.out.println("sorted student:" + Student);

		Student maxStudent = Collections.max(Student);
		System.out.println("MAX (based on natural order) Student:" + maxStudent);

		return maxPerson;
	}
	public static IntegerbinarySearchOrderedStudents(){
		Student = new ArrayList<Student>(studentOrig);	
		System.out.println("original student:" + Student);

		Student StudentToSearch = Student.get(3);
		
		Collections.sort(Student);
		System.out.println("sorted Student:" + Student);
		int indexOfFoundStudent = Collections.binarySearch(Student, StudentToSearch);
		System.out.println("StudentToSearch:" + StudentToSearch + ", indexOfFoundStudent:" + indexOfFoundStudent);
	}
}
