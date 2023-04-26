public class View implements DataSource{

    @Override
    public void view() {
        System.out.println("------------------Appointment View--------------------");
        System.out.println("List of all appointments will be provided once connected to database");
    }

    @Override
    public void execute(String _date, String _name, String _staff, String _appointmentID) {

    }
}
