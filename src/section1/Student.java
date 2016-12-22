/**
 * 
 */
package section1;
import java.util.Comparator;
/**
 * @author Matt
 *
 */
public static class Student implements Comparable<Student>{

	String name;
	Integer age;
	Integer grade;
	Double average;
	
	public Student(String _name){
		name = _name;
	}
	public Student(int _age, int _grade){
		age = _age;
		grade = _grade;
	}
	public Student(double _average){
		average = _average;
	}
	public String getName(){
		return name;
	}
	public Integer getAge(){
		return age;
	}
	public Integer getGrade(){
		return grade;
	}
	public Double getAverage(){
		return average;
	}
		
	public int compareTo(Student s){
		return age.compareTo(s.age);
	}
	
	public String toString(){
		StringBuilder sb = newStringBuilder();
		sb.append("{").append(name).append(",").append(age).append(","),append(grade).append(",").append(average);
		return sb.toString();
	}
}
