public class Payment{
    String transactionID;
    Double amount;
    String patient;
    String appointmentID;

    public Payment(String _transactionID, Double _amount, String _patient, String _appointmentID)
    {
        transactionID = _transactionID;
        amount = _amount;
        patient = _patient;
        appointmentID = _appointmentID;

    }

}
