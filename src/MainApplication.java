public class MainApplication {

    public static void main(String[] args) {

//Registration
    Staff newStaff = new Staff(0111,"First Person", true,"04/01/1990","qwerty",32,"STF123","Medical Officer");
    String registerStaff = newStaff.register(newStaff.name,newStaff.id,newStaff.isMale,newStaff.age,newStaff.password,newStaff.dob,newStaff.isStaff);
    System.out.println("Staff Registration: "+ registerStaff);
    System.out.println("---------------------------------------");
    Patient newPatient = new Patient(101,"Second Person", false,"02/01/2001","qwerty2",22,"PT102");
    String registerPatient = newPatient.register(newPatient.name,newPatient.id,newPatient.isMale,newPatient.age,newPatient.dob,newPatient.dob,newPatient.isStaff);
    System.out.println("Patient Registration: "+ registerPatient);
    System.out.println("---------------------------------------");

//Login
    Staff loginStaff = new Staff("First Person","qwerty1");
    String login = loginStaff.login(loginStaff.name,loginStaff.password, loginStaff.isStaff);
    System.out.println("Name: "+ loginStaff.name + " Password: " + loginStaff.password + " Is Staff: "+loginStaff.isStaff);
    System.out.println("Login Status: "+login);
    System.out.println("---------------------------------------");
    Patient loginPatient = new Patient("Second Person","qwerty2");
    String logPatient = loginPatient.login(loginPatient.name,loginPatient.password,loginPatient.isStaff);
    System.out.println("Name: "+ loginPatient.name + " Password: " + loginPatient.password + " Is Staff: "+loginPatient.isStaff);
    System.out.println("Login Status: "+logPatient);
    System.out.println("---------------------------------------");
//Appointment
//Book Appointment
loginPatient.bookAppointment("2023/04/18 04:30:00",loginPatient.name,loginStaff.name);
//Cancel Appointment
loginStaff.cancelAppointment("2023/04/18 04:30:00",loginPatient.name,loginStaff.name);

//Update Appointment
loginStaff.updateAppointment("2023/04/18 04:30:00",loginPatient.name,loginStaff.name);
//view Appointment
        loginStaff.viewAppointments();
//Payment
        loginPatient.makePayment("",5200.00,"APT5d9d0588-172d-4e46-87ab-c3d3ab557429");
    }
}
