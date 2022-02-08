
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private int ID; //loan ID number
    private double loanAmount; //The value of the loan
    private String country; //The country the loan is from
    private int daysToFund; //The number of days it took to fund the loan
    private int numLenders; //The number of lenders for the loan

    /**
     * Constructor for objects of class Loan
     */
    public Loan(int ID, double loanAmount,String country, int daysToFund, int numLenders) 
    {
       this.ID = ID; 
       this.loanAmount = loanAmount; 
       this.country = country; 
       this.daysToFund = daysToFund; 
       this.numLenders = numLenders; 
    } 
    // accessors
    public int getID()
    {
        return ID; 
    }
    public double getloanAmount()
    {
        return loanAmount; 
    } 
    public String getcountry()
    {
        return country; 
    } 
    public int getdaysToFund()
    {
        return daysToFund; 
    }  
    public int getnumLenders()
    {
        return numLenders; 
    }
}
