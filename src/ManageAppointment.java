import java.util.UUID;

public class ManageAppointment extends Appointment{
    UUID uniqueKey = UUID.randomUUID();

    public ManageAppointment(String _date,String _name,String _staff){
        appointment_date = _date;
        patientName = _name;
        staffName = _staff;
        appointmentID = "APT"+uniqueKey;
}
    public ManageAppointment(){
    }
}
