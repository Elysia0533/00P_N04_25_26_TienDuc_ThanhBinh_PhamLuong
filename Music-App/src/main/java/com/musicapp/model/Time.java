/* 
 package src;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Time {
    private LocalDateTime dateTime;

    public Time() {
        this.dateTime = LocalDateTime.now(); // mặc định lấy thời gian hiện tại
    }

    public Time(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

   
    public String format(String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    
    public void addMinutes(long minutes) {
        this.dateTime = this.dateTime.plusMinutes(minutes);
    }

    
    public static long differenceInMinutes(Time t1, Time t2) {
        Duration diff = Duration.between(t1.getDateTime(), t2.getDateTime());
        return diff.toMinutes();
    }
}
*/