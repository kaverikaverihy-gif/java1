interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    @Override
    public double rateOfInterest() {
        return 7.5;
    }
}

class HDFC implements Bank {
    @Override
    public double rateOfInterest() {
        return 8.2;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.rateOfInterest());
        System.out.println("HDFC Interest Rate: " + hdfc.rateOfInterest());
    }
}
