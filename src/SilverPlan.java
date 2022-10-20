public class SilverPlan extends InsurancePlan{

    public static InsurancePlan silverCoverage = new InsurancePlan(0.6);

    public SilverPlan() {
        super(silverCoverage.getCoverage());
    }
}
