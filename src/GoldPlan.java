public class GoldPlan extends InsurancePlan{

    public static InsurancePlan goldCoverage = new InsurancePlan(0.7);

    public GoldPlan() {
        super(goldCoverage.getCoverage());
    }
}
