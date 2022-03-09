public class Company {
    private String companyName;
    private String dateOfCreation;
    private String bulstat;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName.trim().isEmpty()){
            System.out.println("Invalid company name!");
        }else {
            this.companyName = companyName;
        }
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        if (!dateOfCreation.trim().isEmpty()){
            this.dateOfCreation = dateOfCreation;
        }else {
            System.out.println("Invalid date og creation!");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10){
            this.bulstat = bulstat;
        }else {
            System.out.println("Invalid Bulstat number");
        }
    }

    public Company(){
    }


}
