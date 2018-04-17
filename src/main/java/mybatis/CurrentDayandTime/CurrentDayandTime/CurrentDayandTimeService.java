package mybatis.CurrentDayandTime.CurrentDayandTime;

import mybatis.CurrentDayandTime.CurrentDayandTime.CurrentDayandTimeRoot;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class CurrentDayandTimeService {


    public CurrentDayandTimeRoot getTime() {
        CurrentDayandTimeRoot currentDayandTimeRoot = new CurrentDayandTimeRoot();
        LocalDate localDate = LocalDate.now();
        currentDayandTimeRoot.setDay(localDate);
        LocalDateTime now = LocalDateTime.now();
        currentDayandTimeRoot.setTime(now);

return currentDayandTimeRoot;
    }
}
