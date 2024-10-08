
public abstract class IncomeTaxPayer {

    private static int currentMaxTaxID;
    private int  taxID;
    private String  name;
    private double  income;

    public IncomeTaxPayer(String name){
        this.name=name;
        this.taxID=currentMaxTaxID++;

    }

    public static int getCurrentMaxTaxID() {
        return currentMaxTaxID;
    }

    public int getTaxID() {
        return taxID;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome( double income) {
        this.income = income;
    }

    public String toString() {
        return "  " + taxID + " " + name + " income " + income ;
    }

    public boolean equals(Object obj) {

        if (obj instanceof IncomeTaxPayer) {
            IncomeTaxPayer I_obj= (IncomeTaxPayer)obj;

            if(I_obj.getTaxID() == this.getTaxID()) {
                return true;
            }
        }

        return false;
    }

    public abstract double calculateIncomeTax();
}