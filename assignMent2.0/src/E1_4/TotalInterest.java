package E1_4;

public class TotalInterest {
     private double balance;
    public TotalInterest(){
        balance=1000;
    }
    public  void interest(){
        balance = balance + (balance * 0.05);
        System.out.println(balance);
    }


    public static void main(String[] args) {
        TotalInterest totalInterest =new TotalInterest();
        totalInterest.interest();
        totalInterest.interest();
        totalInterest.interest();
    }

}
