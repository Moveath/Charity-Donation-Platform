package Charity_Donation_Platform;
public class Donation
    {
    private double amount;
    private String date;
    public Donation(double amount, String date) {
        this.amount = amount;
        this.date = date;
    }
    public double getAmount()
    {
        return amount;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public String toString()
    {
        return "Donation{" + "amount=" + amount + ", date='" + date + "'}";
    }
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Donation d = (Donation)obj;
        return amount == d.amount && date.equals(d.date);
    }
    public int hashCode()
    {
        return date.hashCode() + Double.valueOf(amount).hashCode();
    }
}

