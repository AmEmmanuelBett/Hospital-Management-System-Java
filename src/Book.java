import java.text.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Book implements DataSource{
    @Override
    public void execute(String _date, String _name, String _staff, String _appointmentID){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("------------------Appointment Booking Details--------------------");
        try {
            Date d1 = sdformat.parse(dtf.format(now));
            Date d2 = sdformat.parse(_date);
            if(d1.compareTo(d2) >= 0) {

                System.out.println("Appointment Time Cannot be before today");

            }else{

                System.out.println("Appointment Booked Successfully");
                System.out.println("Appointment ID: "+_appointmentID);
                System.out.println("Patient: "+_name);
                System.out.println("Doctor: "+_staff);
                System.out.println("Date: "+_date);
            }
        } catch (ParseException e) {
            System.out.println("Appointment Booking Failed");
            throw new RuntimeException(e);
        }
    }
    public void view()
    {

    }
}
