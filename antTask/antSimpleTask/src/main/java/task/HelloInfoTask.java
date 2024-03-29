/*
 * @(#) HelloTask.java
 * @Author:liuyongjian(liuyongjian@travelsky.com) 2013-04-02
 * @Copyright (c) 2002-2013 Travelsky Limited. All rights reserved.
 */
package task;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * @author liuyongjian
 * @version 1.0
 */
public class HelloInfoTask extends Task {
    private String msg;

    public void execute()  {
        System.out.println(msg);
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }
}