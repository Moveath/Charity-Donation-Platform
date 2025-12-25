package Charity_Donation_Platform;
import java.util.ArrayList;
import java.util.List;

public class Donor
{
    private String name;
    private String email;
    private List<Donation> donations = new ArrayList<>();
    public Donor(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public void addDonation(Donation donation)
    {
        donations.add(donation);
    }
    public List<Donation> getDonations()
    {
        return donations;
    }
    public String toString()
    {
        return "Donor{name='" + name + "', email='" + email + "', donations=" + donations + "}";
    }
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Donor d = (Donor)obj;
        return email.equals(d.email);
    }
    public int hashCode()
    {
        return email.hashCode();
    }
}

