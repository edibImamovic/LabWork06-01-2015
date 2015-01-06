package ba.bitcamp.student;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Haris Krkalic", 12, 3);
		Student student2 = new Student("Mustafa Ademović", 13, 2);
		Student student3 = new Student("Mirza Becic", 14, 4);
		Student student4 = new Student("Adnan Spahić", 15, 4);
		Student student5 = new Student("Jesenko Gavrić", 16, 5);

		Student[] bit = { student1, student2, student3, student4, student5 };

		sortStudent(bit);
		for (Student n : bit) {
			System.out.println(n.toString());
		}
	}

	public static void sortStudent(Student[] bit) {

		for (int i = 0; i < bit.length; i++) {
			int index = i;

			while (index > 0 && bit[index].compareTo(bit[index - 1]) == 1) {

				Student temp = bit[index];
				bit[index] = bit[index - 1];
				bit[index - 1] = temp;
				index--;

			}

		}

	}
}
