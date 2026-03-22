public class Encapulsation {
    public static void main(String[] args) {
        bankAccount  ba=new bankAccount();
        ba.deposit(500);
        System.out.println(ba.getBalance());
        student s=new student("Anjali",195,20,"ABC College");
        System.out.println("Name: "+s.getname());
        System.out.println("Roll Number: "+s.getrollnumber());
        System.out.println("Age: "+s.getage());
        System.out.println("College: "+s.getcollege());

    }
}
class bankAccount{
   private double balance;
   public void deposit(double amount){
    balance+=amount;
   }
   public void withdraw(double amount){
    if(amount<=balance){
        balance-=amount;
    }else{
        System.out.println("Insufficient funds");
    }
    
   }
   public double getBalance(){
        return balance;
    }
}
class student{
    private String name;
    private int rollnumber;
    private int age;
    private String college;
    student(String name,int rollnumber,int age,String college){
        this.name=name;
        this.rollnumber=rollnumber;
        this.age=age;
        this.college=college;
    }
    public String getname(){
        return name;
    }
    public int getrollnumber(){
        return rollnumber;
    }
    public int getage(){
        return age;
    }
    public String getcollege(){
        return college;
    }
}