public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook){
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.name = courseName;
    }

    // Getters
    public String getCourseName() {
        return this.name;
    }


    public void print(){
        System.out.println("Course Name: " + this.name);
        System.out.println("Instructor: " + this.instructor.getFirstName() + " " +this.instructor.getLastName());
        System.out.println("Textbook: " + this.textbook.getTitle() + ", " + this.textbook.getAuthor());
    }
}
