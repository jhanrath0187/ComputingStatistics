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
   public double avgLoan(String countryNm){
       //average loan of a specific country
       double avg=0.0;
       double count=0.0;
       Loan loan;
       for (int i=0;i<data.size();i++)
       {
           loan = data.get(i); 
           if (loan.getCountry().equals(countryNm))
           {
               avg+=loan.getLoanAmount(); 
               count+=1.0;
           }         
       }
       avg/=count;
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
   
   public double largestLoan(String countryNm)
   {
      double largestLoan = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         if ((loan.getCountry()).equals(countryNm))
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
   
   public double variance()
   {
       double mean = 0; 
       double sum = 0; 
       double sum2 = 0; 
       double diff2 = 0; 
       double var = 0; 
       Loan loan; 
       Loan loan2; 
       for (int i = 0; i < data.size(); i++)
       {
           loan = data.get(i); 
           sum += loan.getLoanAmount(); 
       }
       mean = (sum / data.size()); 
       for (int n = 0; n < data.size(); n++)
       {
           loan2 = data.get(n); 
           diff2 = (loan2.getLoanAmount() - mean) * (loan2.getLoanAmount() - mean);
           sum2 += diff2; 
       }
       var = sum2 / data.size(); 
       return var; 
   }
   
   public double standardDeviation()
   {
        double strDev = 0;
        strDev = Math.sqrt(variance());
        return strDev;
    }
    
   public boolean empiricalRule(){
       Loan loan; 
       Loan loan1; 
       double mean = 0;
       double sum = 0;   
       double count = 0; 
       for (int i = 0; i < data.size(); i++)
       {
           loan = data.get(i); 
           sum += loan.getLoanAmount(); 
       }
       mean = (sum / data.size());
       double stan1_1 = mean - standardDeviation(); 
       double stan1_2 = mean + standardDeviation(); 
       double stan2_1 = mean - (2 * standardDeviation()); 
       double stan2_2 = mean + (2 * standardDeviation()); 
       double stan3_1 = mean - (3 * standardDeviation()); 
       double stan3_2 = mean + (3 * standardDeviation()); 
       for (int n = 0; n < data.size(); n++)
       {
           loan1 = data.get(n); 
           if (loan1.getLoanAmount() > stan1_1 && loan1.getLoanAmount() < stan1_2)
           {
               count++; 
           }
       }
       double per = (count) / (data.size()); 
       if (per > 0.68)
       {
           return true; 
       }
       else 
       {
           return false; 
       }
    }
}
