import javax.sql.DataSource;
public class Person {
    protected int id;
    protected String name;
    protected boolean isMale;
    protected String dob;
    protected String password;
    protected int age;
    protected boolean isStaff;
    public String login(String name, String password, boolean isStaff) {
        if (name == "First Person" && password == "qwerty1" && isStaff == true) {
            return "Welcome First Person. Login was successfull";
        }
        if (name == "Second Person" && password == "qwerty2" && isStaff == false) {
            return "Welcome Second Person. Login was successfull";
        } else {
            return "Login Failed";
        }
    }
    public String register(String _name, int _id, boolean _isMale, int _age, String _password, String _dob, boolean _isStaff) {
        if (_name != "" && _password != "" && _dob != "") {
            if(isStaff == true)
            {
                System.out.println("Adding as Staff");
            }else
            {
                System.out.println("Adding as Patient");
            }
            return "Registration Successfully";
        } else {
            return "Registration Failed";
        }
    }
    public String cancelAppointment(String _date,String _name, String _staff){
        System.out.println("------------------Appointment Update Details--------------------");
        Appointment app = new ManageAppointment(_date, _name,_staff);
        app.performOperation(new Cancel());
        return "Completed";
    }
}
