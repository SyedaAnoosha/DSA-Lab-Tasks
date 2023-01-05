package Lab2;
public class Question2 {
    public static void main(String [] args) {
        Employee ee=new Employee();
        ee.setFirst("Ali");
        ee.setLast("Ahmad");
        ee.setSalary(100);
        System.out.println("Yearly salary before increment : " + ee.yearlysalrybefore());
        System.out.println("Yearly salary after increment : "+ ee.afterIncrement());
        Employee eee=new Employee();
        eee.setFirst("Sara");
        eee.setLast("ali");
        eee.setSalary(400);
        System.out.println("Yearly salary before increment"+ eee.yearlysalrybefore());
        System.out.println("Yearly salary after increment"+ eee.afterIncrement());

    }
}
class Employee{
    String first;
    String last;
    int salary;

    public void setFirst(String first) {
        this.first = first;
    }
    public String getFirst() {
        return first;
    }

    public void setLast(String last) {
        this.last = last;
    }
    public String getLast() {
        return last;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<0) {
            this.salary=0;

        }
        else{
            this.salary=salary;
        }
    }
    public int yearlysalrybefore(){
        return 12*salary;
    }
    int afterIncrement(){
       int check = (int) (salary * 0.1);
       return( 12 * (check+ salary) );
    }

}