import java.util.Scanner;

class Bank {
    String dep_name;
    int acc_no;
    String acc_type;
    int balance;

    int acc_serial_no = 1;

    void creatAcc(String dep_name, String acc_type, int balance) {
        this.dep_name = dep_name;
        this.acc_no = acc_serial_no++;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    void deposite(int dep_amount) {
        this.balance += dep_amount;
    }

    void withdraw(int withdraw_amount) {
        this.balance -= withdraw_amount;
    }

    void balanceInquiry() {
        System.out.println("Name : " + this.dep_name);
        System.out.println("Account No : " + this.acc_no);
        System.out.println("Account Type : " + this.acc_type);
        System.out.println("Balance : " + this.balance);
    }

    public static void main(String[] args) {
        Bank obj = new Bank();

        Scanner sc = new Scanner(System.in);

        // Creating account ...
        System.out.println("Enter your name : ");
        String dep_name = sc.nextLine();
        System.out.println("Enter Account Type : ");
        String acc_type = sc.nextLine();
        System.out.println("Enter Account Balance : ");
        int balance = sc.nextInt();

        obj.creatAcc(dep_name, acc_type, balance);
        System.out.println("...........\nYour Account\n...........");
        obj.balanceInquiry();

        // deposite in account ...
        System.out.println("...........\n\n...........");
        System.out.println("Enter deposite amount : ");
        int dep_amount = sc.nextInt();

        obj.deposite(dep_amount);
        System.out.println("...........\nAfter deposite account status\n...........");
        obj.balanceInquiry();

        // Withdraw in account ...
        System.out.println("...........\n\n...........");
        System.out.println("Enter withdraw amount : ");
        int withdraw_amount = sc.nextInt();

        obj.withdraw(withdraw_amount);
        System.out.println("...........\nAfter withdraw account status\n...........");
        obj.balanceInquiry();

        sc.close();

    }
}