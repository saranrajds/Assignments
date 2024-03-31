package interfacesandpackages.universitymanagementsystem.university;

import interfacesandpackages.universitymanagementsystem.university.courses.Courses;
import interfacesandpackages.universitymanagementsystem.university.faculty.Faculty;
import interfacesandpackages.universitymanagementsystem.university.students.Student;

public class University {

	public static void main(String[] args) {
		
		Courses courses = new Courses();
		courses.setCourseName("Computer Engineering");
		
		Student student = new Student();
		student.setName("Sujith");
		
		Faculty faculty = new Faculty();
		faculty.setFacultyName("Kumar");
		
		System.out.println("Faculty Name : "+ faculty.getFacultyName());
		System.out.println("Course Name : "+ courses.getCourseName());
		System.out.println("Student Name : "+ student.getName());
	}
}
