import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        String[]arrDays = {"Sabtu","Minggu","Senin","Selasa","Rabu","Kamis","Jumat"};

        Calendar calendar = Calendar.getInstance();
        int daysOfWeeks = calendar.get(Calendar.DAY_OF_WEEK); // hari dalam bentuk nomor

        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        Date date = new Date();
        return arrDays[daysOfWeeks]+", "+dateFormat.format(date);
    }


//        String[]arrMonth = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
//        int monthOfYear = calendar.get(Calendar.MONTH); //bulan dalam bentuk nomor

}
