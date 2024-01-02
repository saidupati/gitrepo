package october_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student otherStudent) {
		// Compare students based on age for natural ordering
		return Integer.compare(this.age, otherStudent.age);
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

public class StudentComparator {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 22));
		students.add(new Student("Bob", 20));
		students.add(new Student("Charlie", 21));

		// Sort students based on age using Comparable
		Collections.sort(students);

		System.out.println("Sorted by age (using Comparable):");
		for (Student student : students) {
			System.out.println(student);
		}

		// Sort students based on name using Comparator
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				return student1.getName().compareTo(student2.getName());
			}
		});

		System.out.println("\nSorted by name (using Comparator):");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
