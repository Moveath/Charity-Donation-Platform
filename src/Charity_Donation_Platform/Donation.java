package Charity_Donation_Platform;
public class Donation {
    private int id;
    private Donor donor;
    private Charity charity;
    private double amount;
    public Donation() {
    }
    public Donation(int id, Donor donor, Charity charity, double amount) {
        this.id = id;
        this.donor = donor;
        this.charity = charity;
        this.amount = amount;
    }
    public boolean isBiggerThan(Donation other) {
        return this.amount > other.amount;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Donor getDonor() { return donor; }
    public void setDonor(Donor donor) { this.donor = donor; }
    public Charity getCharity() { return charity; }
    public void setCharity(Charity charity) { this.charity = charity; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String toString() {
        return "Donation{id=" + id +
                ", donor=" + donor.getName() +
                ", charity=" + charity.getTitle() +
                ", amount=" + amount + "}";
    }
    public boolean isSameAs(Donation other) {
        return this.id == other.id;
    }
}