public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = student1.clone();
        student2.masina.culoare = "Negru";

        Student student3 = student1;
        student3.masina.culoare = "Albastru";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}