public class CompanyET extends Company implements InvoiceIssue{
    private String owner;
    private double initialCapital;
    private double actualCapital;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (!owner.trim().isEmpty()){
            this.owner = owner;
        }else {
            System.out.println("Invalid owner!");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital <= 2){
            System.out.println("Invalid initial capital!");
        }else {
            this.initialCapital = initialCapital;
        }
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public CompanyET(){

    }

    public double calculateProfit(){
        double profit;
        profit = actualCapital - initialCapital;
        System.out.println("The profit of the company is: " + profit + " BGN");
        return profit;
    }

    public void printsCompanyData(){
        System.out.printf("The company %s is created on %s.%nIts Bulstat number is: %s.%nThe owner of the company is: %s%n" +
                "Financial stat of the company is as follows:%nInitial capital is: %.2f BGN.%nActual capital is: %.2f BGN.%n",getCompanyName(), getDateOfCreation(), getBulstat(), getOwner(), getInitialCapital(), getActualCapital());
    }
//why does it print profit?
    @Override
    public void issueInvoice() {
        if (calculateProfit() > 50000) {
            System.out.println("This company can issue invoice by VAT.");
        }else {
            System.out.println("This company can not issue invoice by VAT.");
        }
    }
}
