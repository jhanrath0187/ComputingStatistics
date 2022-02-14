
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
    public double getLoanAmount()
    {
        return loanAmount; 
    } 
    public String getCountry()
    {
        return country; 
    } 
    public int getDaysToFund()
    {
        return daysToFund; 
    }  
    public int getNumLenders()
    {
        return numLenders; 
    }
    //modifiers
    public void setID(int newID)
    {
        this.ID = newID; 
    }
    public void setLoanAmount(double newLoanAmount)
    {
        this.loanAmount = newLoanAmount; 
    }
    public void setCountry(String newCountry)
    {
        this.country = newCountry; 
    }
    public void setDaysToFund(int newDaysToFund)
    {
        this.daysToFund = newDaysToFund;// /86400?; 
    }
    public void setNumLenders(int newNumLenders){
        this.numLenders=newNumLenders; 
    }
    //toString 
    public String toString(){
        return "ID: "+ID+" loan amount: "+loanAmount+" country : "+country+" days to fund "+daysToFund +" num lenders: "+numLenders;
    }
}
