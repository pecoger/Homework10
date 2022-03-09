public class Test {
    public static void main(String[] args) {

        CompanyET et1 = new CompanyET();
        et1.setInitialCapital(25);
        et1.setActualCapital(125.54);
        et1.setOwner("Biznesmencho");
        et1.setCompanyName("Firmichka");
        et1.setDateOfCreation("02.01.2022");
        et1.setBulstat("B202134264");

        et1.printsCompanyData();
        et1.calculateProfit();
        et1.issueInvoice();
    }
}
