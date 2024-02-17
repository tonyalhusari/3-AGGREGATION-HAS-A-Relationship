public class Main {
    public static void main(String[] args) {
        // Create one course with one instructor and one textbook
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Course course1 = new Course("Software Engineering", instructor1, textbook1);

        System.out.println("Course Information");
        System.out.println("---------------");
        course1.print();
        System.out.println();

        // Create another course with two instructors and two textbooks
        Instructor instructor2 = new Instructor("Tony", "Alhusari", "5-1010");
        Textbook textbook2 = new Textbook("Introduction to Java Programming", "Y. Daniel Liang", "Pearson");

        Course course2 = new Course("Java Programming", instructor2, textbook2);

        System.out.println("Course Information");
        System.out.println("---------------");
        course2.print();
        System.out.println();;
    }
}