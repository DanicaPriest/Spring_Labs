package mybatis.model.CurrentDayandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentDayandTimeRoot {
    LocalDate day;
    LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }
}
