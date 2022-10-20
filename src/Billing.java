public class Billing {

    public static double[] computePayment(Patient patient, double amount) {
        double[] payments = new double[2];
        InsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        payments[0] = amount * patientInsurancePlan.getCoverage();
        payments[1] = amount - payments[0];

        return payments;
    }
}
