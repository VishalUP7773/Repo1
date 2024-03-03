package class_and_object;

public class Engineer {
       String name;
       int eid;
       String department;

    public Engineer(String name, int eid, String department) {
        this.name = name;
        this.eid = eid;
        this.department = department;
    }

    public static void main(String[] args) {

        Engineer obj1 = new Engineer("Naveen",230,"IT");
        Engineer obj2 = new Engineer("VISHAL",235,"CIVIL");
        Engineer obj3 = new Engineer("PRAVEEN",245,"MECHENACHEL");
        Engineer obj4 = new Engineer("TARUN",453,"ELECTRACAL");
        Engineer obj5 = new Engineer("RAHUL",756,"CS");

        System.out.println("print the engineer :"+ obj1.name + " eid is"+ obj1.eid+ "department is "+ obj1.department);
        System.out.println("print the engineer :"+ obj2.name + " eid is"+ obj2.eid+ "department is "+ obj2.department);
        System.out.println("print the engineer :"+ obj3.name + " eid is"+ obj3.eid+ "department is "+ obj3.department);
        System.out.println("print the engineer :"+ obj4.name + " eid is"+ obj4.eid+ "department is "+ obj4.department);
        System.out.println("print the engineer :"+ obj5.name + " eid is"+ obj5.eid+ "department is "+ obj5.department);

    }


}
