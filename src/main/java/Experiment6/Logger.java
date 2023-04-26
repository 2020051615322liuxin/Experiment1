package Experiment6;

import java.util.*;

public class Logger {
    private List<String> logList = new ArrayList<String>();
    public void log(String userId){
        String logMessage = "用户："+userId+"  查询...";
        logList.add(logMessage);
        System.out.println("日志信息：  "+logMessage);
    }
}
