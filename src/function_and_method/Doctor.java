package function_and_method;

public class Doctor {
    String name;

    String  specialist;

    int mob;

    public void surgery(){
        System.out.println(" this is surgery method....");
    }
      public void eat(){
        System.out.println("this is eat method...");

      }
        public void sleep(){
        System.out.println("this is sleep method");

        }

    public static void main(String[] args) {
        Doctor obj = new Doctor();
        obj.surgery();
    }

}
