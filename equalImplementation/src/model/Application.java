package model;

public class Application {

    public static void main(String[] args) {
        Employee emp1=new Employee("001","C001","Asheni","945430583V","Gampaha");
        Employee emp2=new Employee("002","C002","Sanduni","954673892V","Yakkala");

        boolean b1=emp1.equals(emp2);
        System.out.println("Is emp1 equals to emp2? :"+ b1);

        emp2.setId("001");
        boolean b2=emp1.equals(emp2);
        System.out.println("emp1 and emp2 id are same");
        System.out.println("Is emp1 equals to emp2? :"+ b2);

        emp2.setCode("C001");
        boolean b3=emp1.equals(emp2);
        System.out.println("emp1 and emp2 both id and code are same");
        System.out.println("Is emp1 equals to emp2? :"+ b3);


    }
}
