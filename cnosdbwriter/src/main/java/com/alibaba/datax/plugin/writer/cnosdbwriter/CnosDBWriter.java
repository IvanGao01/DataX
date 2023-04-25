package com.alibaba.datax.plugin.writer.cnosdbwriter;


import com.alibaba.datax.common.plugin.RecordReceiver;
import com.alibaba.datax.common.spi.Writer;
import com.alibaba.datax.common.util.Configuration;

import java.util.List;


public class CnosDBWriter extends Writer {
   // 实现Job
    public static class Job extends Writer.Job {

       private Configuration originalConfig;
        @Override
        public void init() {
            this.originalConfig = super.getPluginJobConf();
            String host = this.originalConfig.getString("host");
            String port = this.originalConfig.getString("port");
            String user = this.originalConfig.getString("username");
            String password = this.originalConfig.getString("password");
            String database = this.originalConfig.getString("database");
            String table = this.originalConfig.getString("table");
            String column = this.originalConfig.getString("column");
            String mode = this.originalConfig.getString("mode");
            String batchsize = this.originalConfig.getString("batchsize");

            System.out.println("host: " + host);
            System.out.println("port: " + port);
            System.out.println("user: " + user);
            System.out.println("password: " + password);
            System.out.println("batchsize: " + batchsize);

            //TODO
        }

        @Override
        public void prepare() {
            //TODO
        }

        @Override
        public void post() {
            //TODO
        }

        @Override
        public void destroy() {
            //TODO
        }

        @Override
        public List<Configuration> split(int mandatoryNumber) {
            //TODO
            return null;
        }
    }

    // 实现Task
    public static class Task extends Writer.Task {
        @Override
        public void init() {
            //TODO
        }

        @Override
        public void prepare() {
            //TODO
        }

        @Override
        public void startWrite(RecordReceiver lineReceiver) {
            //TODO
        }

        @Override
        public void post() {
            //TODO
        }

        @Override
        public void destroy() {
            //TODO
        }
    }

}
