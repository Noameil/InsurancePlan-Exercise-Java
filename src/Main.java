public class Main {
    public static void main(String[] args) {
        InsurancePlan insurancePlan = new GoldPlan();
        Patient patient = new Patient();

        patient.setInsurancePlan(insurancePlan);
        double[] payments = Billing.computePayment(patient, 1000.0);

        for(int i = 0; i < payments.length; i++) {
            System.out.println(payments[i]);
        }


    }
}