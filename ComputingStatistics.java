import java.util.ArrayList;
public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         amount = amount + loan.getLoanAmount();
      }
      return amount;
   }
   
   public double avgLoan(){
       //average loan taken by total amount divided by number of loans
       double avg=0.0;
       Loan loan;
       avg=this.totalAmount()/data.size();
       return avg;
   }
   
   public double largestLoan() {
      double largestLoan = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         if (loan.getLoanAmount() > largestLoan)
             largestLoan = loan.getLoanAmount();
      }
      return largestLoan;
   }
   
    public double smallestLoan() {
      double smallestLoan = 100000.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         if (loan.getLoanAmount() < smallestLoan)
             smallestLoan = loan.getLoanAmount();
      }
      return smallestLoan;
   }
   
      public double avgDaysToFund()
    {   
     double total = 0.0;
     double avg;
     Loan loan;
     for(int i = 0; i < data.size(); i++) 
     {
         loan = data.get(i);
         total += loan.getLoanAmount();
     }
     avg = total / (data.size() * 100);
     return avg;
    }
   
   public double largestLoan(String country)
   {
      double largestLoan = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         if ((loan.getCountry()).equals(country))
         {
             if (loan.getLoanAmount() > largestLoan)
                 largestLoan = loan.getLoanAmount();
         }
      }
      return largestLoan;
   }
   
   public String smallestLoanCountry() 
   {
       String smallestCountry = ""; 
       Loan small = data.get(0);
       Loan loan; 
       for (int i = 1; i < data.size(); i++)
       {
           loan = data.get(i);
           if (loan.getLoanAmount() < small.getLoanAmount())
           {
               small = loan; 
           }
       }
       smallestCountry = small.getCountry(); 
       return smallestCountry; 
   }
   
   public String largestLoanCountry() 
   {
       String largestCountry = ""; 
       Loan large = data.get(0); 
       Loan loan; 
       for (int i = 1; i < data.size(); i++)
       {
           loan = data.get(i); 
           if (loan.getLoanAmount() > large.getLoanAmount())
           {
               large = loan; 
           } 
       }
       largestCountry = large.getCountry(); 
       return largestCountry;
   }
   
   public String longestToFundCountry()
   {
       String country = ""; 
       Loan large = data.get(0); 
       Loan loan; 
       for (int i = 1; i < data.size(); i++)
       {
           loan = data.get(i);
           if (loan.getDaysToFund() > large.getDaysToFund())
           {
              large = loan;  
           }
       }
       country = large.getCountry(); 
       return country; 
   }
   
   public int loansFunded(String countryNm)
   {
       int count = 0; 
       Loan loan; 
       for (int i = 0; i < data.size(); i++)
       {
           loan = data.get(i); 
           if (loan.getCountry().equals(countryNm))
           {
               count++; 
           }         
       }
       return count; 
   }
}
