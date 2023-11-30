package CREATIONALPATTERNS.BuilderPattern.Example;

public class App {
    public static void main(String[] args) {
        // Person person = new Person.Builder("Nguyen Tuan Anh", "ngtuananh.developer@gmail.com").build();
        // Person person = new Person.Builder("Nguyen Tuan Anh", "ngtuananh.developer@gmail.com").setAge(23).build();
        // Person person = new Person.Builder("Nguyen Tuan Anh", "ngtuananh.developer@gmail.com").setAge(23).setAddress("Le Van Khuong, Phuong Hiep Thanh, Quan 12, TP.HCM").build();
        Person person = new Person.Builder("Nguyen Tuan Anh", "ngtuananh.developer@gmail.com").setUniversity("Hutech University").setAge(23).setAddress("Le Van Khuong, Phuong Hiep Thanh, Quan 12, TP.HCM").build();
        System.out.println(person);
    }
}