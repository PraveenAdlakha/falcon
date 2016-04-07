package org.apache.falcon.recipe.druid;

import java.io.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.ArrayFile;

/**
 * Created by praveen on 4/4/16.
 */
public class DruidJson extends Configured
{
    public void replaceVariableInJson(String args[]) throws IOException {
//        String day1="2016-01-01";
//        String day2 = "2016-02-01";
//        String dataSource = "testUser";
//        String ingestDir = "get this value";
//        String queueName = "default";
//        String segmentOutputPath = ingestDir + "/ingest/" + day1 +"_"+ day2 + "/" + dataSource + "/";
//        String workingPath = ingestDir + "/ingest/" + day1 +"_"+ day2 ;
//        String hdpVersion = "1.0.6";
//        String inputPaths = "get this value";
//        String userName = "testUser";
//        String mysqlUser = "mysql";
//        String mysqlPassword = "password";
//
//
        String day1= args[0];
        String day2 = args[1];
        String dataSource = args[2];
        String ingestDir = args[3];
        String queueName = args[4];
        String inputPaths = args[5];
        String userName = args[6];
        String mysqlUser = args[7];
        String mysqlPassword = args[8];
        String date = args[9];
        String jobDir = args[10];
        String specDir = jobDir + "spec" + date; //will be used to upload in hdfs


        Gson gson = new GsonBuilder().create();


        try(
           // Reader reader =  readFileFromHdfs("hadoop_spec.json","/user/praveen/");
            Reader reader = new InputStreamReader(DruidJson.class.getClassLoader().getResourceAsStream("hadoop_spec.json"), "UTF-8")){
            JsonElement je = gson.fromJson(reader, JsonElement.class);
            JsonObject jo = je.getAsJsonObject();
            String json = jo.toString();
            System.out.println(json);

            String json1=json.replaceAll("\\$day1",day1).replaceAll("\\$day2",day2).
                    replaceAll("\\$dataSource",dataSource).replaceAll("\\$queueName",queueName).
                    replaceAll("\\$userName",userName).replaceAll("\\$ingestDir",ingestDir).replaceAll("\\$mysqlUser",mysqlUser)
                    .replaceAll("\\$mysqlPassword",mysqlPassword).replaceAll("\\$inputPaths",inputPaths);

            System.out.println(json1);

            try (Writer writer = new FileWriter("Output.json")) {
                Gson gson2 = new GsonBuilder().create();
                gson2.toJson(json1, writer);
            }

        }
    }

    public Reader readFileFromHdfs (String filename,String hdfsPath)throws IOException{
        Configuration conf = getConf();
        Path path = new Path(hdfsPath + filename);
        FileSystem fs = path.getFileSystem(conf);
        Reader reader = new InputStreamReader(DruidJson.class.getClassLoader().getResourceAsStream("hadoop_spec.json"), "UTF-8");
        return reader;

    }

    public void writeFileToHdfs (String filename, String hdfsPath) {

    }

    public static void main(String[] args) throws IOException {
        DruidJson druidJson = new DruidJson();
        druidJson.replaceVariableInJson(args);
    }
}
