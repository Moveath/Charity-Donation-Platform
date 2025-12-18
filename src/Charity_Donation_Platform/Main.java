package Charity_Donation_Platform;
public class Main {
    public static void main(String[] args) {
        Donor donor1 = new Donor(1, "Mark");
        Donor donor2 = new Donor(2, "Alex");
        Donor donor3 = new Donor(1, "Mark Clone");
        Charity charity1 = new Charity(10, "Save Kids");
        Charity charity2 = new Charity(11, "Animal Help");
        Charity charity3 = new Charity(10, "Save Kids Copy");
        Donation donation1 = new Donation(100, donor1, charity1, 5000);
        Donation donation2 = new Donation(101, donor2, charity1, 2000);
        Donation donation3 = new Donation(102, donor1, charity2, 7000);
        System.out.println("DONORS");
        System.out.println(donor1);
        System.out.println(donor2);
        System.out.println(donor3);
        System.out.println("\nCHARITIES");
        System.out.println(charity1);
        System.out.println(charity2);
        System.out.println(charity3);
        System.out.println("\nDONATIONS");
        System.out.println(donation1);
        System.out.println(donation2);
        System.out.println(donation3);
        System.out.println("\nMETHODS");
        donor1.greeting();
        System.out.println(charity1.info());
        System.out.println("\nCOMPARE");
        System.out.println("donor1 same as donor2? " + donor1.isSameAs(donor2));
        System.out.println("donor1 same as donor3? " + donor1.isSameAs(donor3));
        System.out.println("charity1 same as charity2? " + charity1.isSameAs(charity2));
        System.out.println("charity1 same as charity3? " + charity1.isSameAs(charity3));
        System.out.println("donation1 bigger than donation2? " + donation1.isBiggerThan(donation2));
        System.out.println("donation3 bigger than donation1? " + donation3.isBiggerThan(donation1));
    }
}