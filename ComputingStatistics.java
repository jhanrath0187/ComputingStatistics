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
}