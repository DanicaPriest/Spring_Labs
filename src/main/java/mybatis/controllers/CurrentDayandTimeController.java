package mybatis.controllers;

import mybatis.model.CurrentDayandTime.CurrentDayandTimeRoot;
import mybatis.services.CurrentDayandTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currentdate")
public class CurrentDayandTimeController {

    @Autowired
    CurrentDayandTimeService currentDayandTimeService;

    @RequestMapping("/")
    public CurrentDayandTimeRoot getTime() {
        return currentDayandTimeService.getTime();
    }
}
