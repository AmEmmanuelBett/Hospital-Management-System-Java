abstract public class Appointment {
    protected String patientName;
    protected String appointment_date;
    protected String staffName;
    protected String appointmentID;
    private DataSource appointmentData;
        public void performOperation(DataSource _appointmentData){
            appointmentData = _appointmentData;
            appointmentData.execute(appointment_date,patientName,staffName,appointmentID);
            appointmentData.view();

        }

}
