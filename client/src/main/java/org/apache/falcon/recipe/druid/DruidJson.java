package org.apache.falcon.recipe.druid;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;

/**
 * Created by praveen on 4/4/16.
 */
public class DruidJson
{
    private TuningConfig tuningConfig;

    private IoConfig ioConfig;

    private DataSchema dataSchema;

    public TuningConfig getTuningConfig ()
    {
        return tuningConfig;
    }

    public void setTuningConfig (TuningConfig tuningConfig)
    {
        this.tuningConfig = tuningConfig;
    }

    public IoConfig getIoConfig ()
    {
        return ioConfig;
    }

    public void setIoConfig (IoConfig ioConfig)
    {
        this.ioConfig = ioConfig;
    }

    public DataSchema getDataSchema ()
    {
        return dataSchema;
    }

    public void setDataSchema (DataSchema dataSchema)
    {
        this.dataSchema = dataSchema;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tuningConfig = "+tuningConfig+", ioConfig = "+ioConfig+", dataSchema = "+dataSchema+"]";
    }


    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().create();
        String day1="2016-01-01";
        String day2 = "2016-02-01";
        String dataSource = "testUser";
        String ingestDir = "get this value";
        String queueName = "default";
        String segmentOutputPath = ingestDir + "/ingest/" + day1 +"_"+ day2 + "/" + dataSource + "/";
        String workingPath = ingestDir + "/ingest/" + day1 +"_"+ day2 ;
        String hdpVersion = "1.0.6";
        String inputPaths = "get this value";
        String userName = "testUser";
        String mysqlUser = "mysql";
        String mysqlPassword = "password";


        try(Reader reader = new InputStreamReader(DruidJson.class.getClassLoader().getResourceAsStream("hadoop_spec.json"), "UTF-8")){
            JsonElement je = gson.fromJson(reader, JsonElement.class);
            JsonObject jo = je.getAsJsonObject();
//            System.out.println(jo.entrySet());
//            System.out.println("data schema=============>>>"+jo.getAsJsonObject("dataSchema"));
//            System.out.println("data schema============="+jo.getAsJsonObject("dataSchema").get("parser").getAsJsonObject().get("type"));
//
            String json = jo.toString();

            String json1=json.replaceAll("\\$day1",day1).replaceAll("\\$day2",day2).
                    replaceAll("\\$dataSource",dataSource).replaceAll("\\$queueName",queueName).
                    replaceAll("\\$userName",userName).replaceAll("\\$ingestDir",ingestDir).replaceAll("\\$mysqlUser",mysqlUser)
                    .replaceAll("\\$mysqlPassword",mysqlPassword).replaceAll("$inputPaths",inputPaths);

            System.out.println(json1);



            //properties to be changed
//            jo.getAsJsonObject("dataSchema").remove("dataSource");
//            System.out.println(jo.getAsJsonObject("dataSchema"));
//            jo.getAsJsonObject("dataSchema").addProperty("dataSource",dataSource);
//            System.out.println(jo.getAsJsonObject("dataSchema"));
//            System.out.println(jo.getAsJsonObject("tuningConfig").getAsJsonObject("jobProperties").remove("mapred.job.user.name"));
//            jo.getAsJsonObject("tuningConfig").getAsJsonObject("jobProperties").addProperty("mapred.job.user.name","default");
//            System.out.println(jo.getAsJsonObject("tuningConfig").getAsJsonObject("jobProperties"));
//            System.out.println(jo.getAsJsonObject("dataSchema").getAsJsonObject("granularitySpec"));
//            jo.getAsJsonObject("dataSchema").getAsJsonObject("granularitySpec").addProperty("intervals",day1 + "T00:00:00.000/"+ day2 + "T00:00:00.000");
//            System.out.println(jo.getAsJsonObject("dataSchema").getAsJsonObject("granularitySpec").get("intervals"));
//            System.out.println(jo.getAsJsonObject("ioConfig").remove("segmentOutputPath"));
//            jo.getAsJsonObject("ioConfig").addProperty("segmentOutputPath",segmentOutputPath);
//            System.out.println(jo.getAsJsonObject("ioConfig").get("segmentOutputPath"));
//            jo.getAsJsonObject("tuningConfig").remove("workingPath");
//            jo.getAsJsonObject("tuningConfig").addProperty("workingPath",workingPath);
//            System.out.println(jo.getAsJsonObject("tuningConfig").get("workingPath"));

//            //DruidJson p = gson.fromJson(reader, DruidJson.class);
            //System.out.println(p);
        }
    }
}
