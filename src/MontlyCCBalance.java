public class MontlyCCBalance {

    public static void main(String[] args)
    {
	double initialBalance;
    double interestRate;
    double interest;
    double oneMonth;
    double twoMonth;
    initialBalance=5000;
    interestRate=.17;
    interest= initialBalance * interestRate;
    oneMonth=initialBalance+interest;
    interest=oneMonth*interestRate;
    twoMonth=oneMonth+interest;
        System.out.println("Your balance produced after one month is: $"+oneMonth);
        System.out.println("Your balance produced after two months is: $"+twoMonth);


    }
}
