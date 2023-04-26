public class Cancel implements DataSource{
    @Override
    public void execute(String _date, String _name, String _staff,String _appointmentID){
        System.out.println("------------------Appointment Cancelling Details--------------------");
        System.out.println("Appointment Cancelled Successfully");
        System.out.println("Appointment ID: "+_appointmentID);
        System.out.println("Patient: "+_name);
        System.out.println("Doctor: "+_staff);
        System.out.println("Date: "+_date);
    }
    public void view()
    {

    }
}
