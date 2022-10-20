public class Patient extends User{

    private long patientId;
    private boolean isInsured;

    private InsurancePlan insurancePlan;

    Patient(long id, String firstName, String lastName, String email, long patientId, boolean isInsured) {
        super(id, firstName, lastName, email);
        this.patientId = patientId;
        this.isInsured = isInsured;
    }

    Patient() {}

    public long getPatientId() {
        return patientId;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public InsurancePlan getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(InsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    @Override
    public String toString(){
        return "Patient ID: " + this.patientId + "\nPatient Email: " + super.getEmail() + "\nIs Insured: " + this.isInsured;
    }
}
