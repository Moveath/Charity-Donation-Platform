package Charity_Donation_Platform;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Charity
    {
    private String name;
    private List<Donation> donations = new ArrayList<>();
    public Charity(String name)
    {
        this.name = name;
    }
    public void addDonation(Donation donation) {
        donations.add(donation);
    }
    public List<Donation> getDonationsByAmount(double minAmount)
    {
        return donations.stream()
                .filter(d -> d.getAmount() >= minAmount)
                .collect(Collectors.toList());
    }
    public String toString()
    {
        return "Charity{name='" + name + "', donations=" + donations + "}";
    }
}

