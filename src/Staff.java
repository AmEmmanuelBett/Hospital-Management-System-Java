public class Staff extends Person{
    private String employeeID;
    private String designation;
    public Staff(int _id,String _name,boolean _isMale,String _dob,String _password,int _age, String _employeeID, String _designation)
    {
        id= _id;
        name = _name;
        isMale = _isMale;
        dob = _dob;
        password = _password;
        age = _age;
        employeeID = _employeeID;
        designation = _designation;
        isStaff = true;
    }
    public Staff(String _name, String _password)
    {
        name = _name;
        password = _password;
        isStaff = true;
    }
    public String updateAppointment(String _date,String _name, String _staff){
        Appointment app = new ManageAppointment(_date, _name,_staff);
        app.performOperation(new Update());
        return "Completed";
    }
    public String viewAppointments(){
        Appointment app = new ManageAppointment();
        app.performOperation(new View());
        return "Completed";
    }
}
