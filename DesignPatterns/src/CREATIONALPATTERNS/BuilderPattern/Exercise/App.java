package CREATIONALPATTERNS.BuilderPattern.Exercise;

public class App {
    public static void main(String[] args) {
        Student student = new Student.Builder("Nguyen Tuan Anh", "Hutech University").setAge(23).build();
        System.out.println(student);
    }
}
