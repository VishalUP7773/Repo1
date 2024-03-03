package class_and_object;

public class Doctor {
    String name = "Tarun";
    int fees = 1000;
    String Specialist = "Sergen";
    String Degree = "MS";

    public static void main(String[] args) {
        Doctor obj1 = new Doctor();
        Doctor obj2 = new Doctor();
        Doctor obj3 = new Doctor();
        Doctor obj4 = new Doctor();
        Doctor obj5 = new Doctor();

        System.out.println("Print the OBJ1:"+ obj1.name+obj1.Specialist+obj1.Degree+obj1.fees);
        System.out.println("Print the OBJ2:"+ obj2.name+obj2.Specialist+obj2.Degree+obj2.fees);
        System.out.println("Print the OBJ3:"+ obj3.name+obj3.Specialist+obj3.Degree+obj3.fees);
        System.out.println("Print the OBJ4:"+ obj4.name+obj4.Specialist+obj4.Degree+obj4.fees);
        System.out.println("Print the OBJ5:"+ obj5.name+obj5.Specialist+obj5.Degree+obj5.fees);
    }

}
