public class PlatinumPlan extends InsurancePlan{

    public static InsurancePlan PlatinumCoverage = new InsurancePlan(0.9);

    public PlatinumPlan() {
        super(PlatinumCoverage.getCoverage());
    }

}
