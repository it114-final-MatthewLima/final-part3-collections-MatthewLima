/**
 * 
 */
package section1;
import java.util.Comparator
/**
 * @author Matt
 *
 */
public static class StudentGradeComparator implements Comparator<Student> {
	public int compare(Student left, Student right){
		return left.getGrade().compareTo(right.getGrade());
	}
	
}
