package Charity_Donation_Platform;
public class Main
{
    public static void main(String[] args)
    {
        Donor d1 = new Donor("Egor", "egor@mail.com");
        Donor d2 = new Donor("Anna", "anna@mail.com");
        Donation don1 = new Donation(1000, "2025-12-25");
        Donation don2 = new Donation(500, "2025-12-20");
        d1.addDonation(don1);
        d2.addDonation(don2);
        Charity charity = new Charity("HelpKids");
        charity.addDonation(don1);
        charity.addDonation(don2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("Donations >= 600: " + charity.getDonationsByAmount(600));
        System.out.println("d1 equals d2? " + d1.equals(d2));
    }
}
