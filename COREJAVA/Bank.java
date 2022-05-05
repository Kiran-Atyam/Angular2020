import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Bank{
    static Queue<Details> q = new ArrayDeque<>();
    
       

        public static Details inputDetails(){

            Scanner sc = new Scanner(System.in);
            Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Bank Details :");

        System.out.println("Enter your Bank Name :");
        String bankName = sc.nextLine();

        System.out.println("Enter your Branch :");
        String branch = s.nextLine();

        System.out.println("Enter your Account Number :");
        int accountNumber = sc.nextInt();

        System.out.println("Enter your IFSI code :");
        String ifsiCode = s.nextLine();

         Details d = new Details(bankName, branch, accountNumber, ifsiCode);
         sc.close();
        return d;
        
    } 
    public static void main(String[] args) {
        Details d = inputDetails();
        q.add(d);
        q.forEach(e->{
            System.out.println(" your bank name is :" +e.getBankName());
            System.out.println(" your branch is :"+e.getBranch());
            System.out.println(" your Account Number is :"+e.getAccountNumber());
            System.out.println(" your IFSI code is :"+e.getIfsiCode());
        });
    }
        
    }
class Details{
    String bankName;
    String branch;
    int accountNumber;
    String ifsiCode;
    public Details(String bankName, String branch, int accountNumber, String ifsiCode) {
        this.bankName = bankName;
        this.branch = branch;
        this.accountNumber = accountNumber;
        this.ifsiCode = ifsiCode;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getIfsiCode() {
        return ifsiCode;
    }
    public void setIfsiCode(String ifsiCode) {
        this.ifsiCode = ifsiCode;
    }
    
    

}


