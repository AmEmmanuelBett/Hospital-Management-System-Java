import java.lang.reflect.Array;

public class Patient extends Person{
    private String patient_id;
    public Array patientDetails;
    public Patient(int _id,String _name,boolean _isMale,String _dob,String _password,int _age, String _patient_id)
    {
        id= _id;
        name = _name;
        isMale = _isMale;
        dob = _dob;
        password = _password;
        age = _age;
        patient_id = _patient_id;
        isStaff = false;
    }
    public Patient(String _name, String _password)
    {
        name = _name;
        password = _password;
        isStaff = false;
    }
    public void bookAppointment(String _date,String _name, String _staff){
        Appointment app = new ManageAppointment(_date, _name,_staff);
        app.performOperation(new Book());
    }
    public String makePayment(String _transactionID, Double _amount, String _appointmentID)
    {
        Payment pay = new Payment(_transactionID,_amount,name,_appointmentID);
        System.out.println("------------------Payment Details--------------------");
        System.out.println("Payment Added Successfully");
        System.out.println("Patient: "+ name);
        System.out.println("Appointment ID: "+_appointmentID);
        System.out.println("Amount: KSH "+ _amount);
        return "Saved!!";
    }}
