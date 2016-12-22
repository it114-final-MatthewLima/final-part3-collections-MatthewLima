/**
 * 
 */
package section1;

import java.util.Comparator;

/**
 * @author Matt
 *
 */
public static class StudentAverageComparator implements Comparator<Student> {
	
		public double compare(Student left, Student right){
			return left.getAverage().compareTo(right.getAverage());
		}
}
