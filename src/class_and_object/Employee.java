package class_and_object;

public class Employee {
    String name = "ravi";
    int age = 30;
    String department = "IT";

    public static void main(String[] args) {

        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        Employee obj4 = new Employee();
        Employee obj5 = new Employee();

        System.out.println("printing the OBJ1 :"+obj1.name + "age is" +obj1.age +"department is "+ obj1.department);
        System.out.println("printing the OBJ2 :"+obj2.name + "age is" +obj2.age +"department is "+ obj2.department);
        System.out.println("printing the OBJ3 :"+obj3.name + "age is" +obj3.age +"department is "+ obj3.department);
        System.out.println("printing the OBJ4 :"+obj4.name + "age is" +obj4.age +"department is "+ obj4.department);
        System.out.println("printing the OBJ5 :"+obj5.name + "age is" +obj5.age +"department is "+ obj5.department);
    }

}
