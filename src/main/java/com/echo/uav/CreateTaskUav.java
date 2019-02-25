package com.echo.uav;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;

public class CreateTaskUav implements Runnable{
    final Map<String,Object> taskIds ;
    final Logger    logger  =  Logger.getLogger(CreateTaskUav. class );

    public CreateTaskUav(Map<String, Object> taskIds) {
        this.taskIds = taskIds;
    }

    @Override
    public void run() {
        try {
            taskIds.put("Action","CreateTask");
            taskIds.put("StartTime",new Date().getTime());
            logger.debug("The uav delivery parma is "+ taskIds);
            System.out.print("send sucess ing  " + Thread.currentThread().getName());
            HttpConnect.send("127.0.0.1:8081",taskIds,"utf-8");
            logger.debug("The uav delivery is sucessed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
