package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class JobProperties
{
    private String mapreduceReduceMemoryMb;

    private String yarnAppMapreduceAmCommandOpt;

    private String yarnAppMapreduceAmResourceMb;

    private String mapredJobUserName;

    private String mapreduceTaskUserlogLimitKb;

    private String mapredJobQueueName;

    private String mapreduceReduceJavaOpts;

    private String mapreduceTaskTimeout;

    public String getmapreduceReduceMemoryMb ()
    {
        return mapreduceReduceMemoryMb;
    }

    public void setmapreduceReduceMemoryMb (String mapreduceReduceMemoryMb)
    {
        this.mapreduceReduceMemoryMb = mapreduceReduceMemoryMb;
    }

    public String getyarnAppMapreduceAmCommandOpt ()
{
    return yarnAppMapreduceAmCommandOpt;
}

    public void setyarnAppMapreduceAmCommandOpts (String yarnAppMapreduceAmCommandOpts)
{
    this.yarnAppMapreduceAmCommandOpt = yarnAppMapreduceAmCommandOpts;
}

    public String getyarnAppMapreduceAmResourceMb ()
    {
        return yarnAppMapreduceAmResourceMb;
    }

    public void setyarnAppMapreduceAmResourceMb (String yarnAppMapreduceAmResourceMb)
    {
        this.yarnAppMapreduceAmResourceMb = yarnAppMapreduceAmResourceMb;
    }

    public String getmapredJobUserName ()
    {
        return mapredJobUserName;
    }

    public void setmapredJobUserName (String mapredJobUserName)
    {
        this.mapredJobUserName = mapredJobUserName;
    }

    public String getmapreduceTaskUserlogLimitKb ()
    {
        return mapreduceTaskUserlogLimitKb;
    }

    public void setmapreduceTaskUserlogLimitKb (String mapreduceTaskUserlogLimitKb)
    {
        this.mapreduceTaskUserlogLimitKb = mapreduceTaskUserlogLimitKb;
    }

    public String getmapredJobQueueName ()
    {
        return mapredJobQueueName;
    }

    public void setmapredJobQueueName (String mapredJobQueueName)
    {
        this.mapredJobQueueName = mapredJobQueueName;
    }

    public String getmapreduceReduceJavaOpts ()
    {
        return mapreduceReduceJavaOpts;
    }

    public void setmapreduceReduceJavaOpts (String mapreduceReduceJavaOpts)
    {
        this.mapreduceReduceJavaOpts = mapreduceReduceJavaOpts;
    }

    public String getmapreduceTaskTimeout ()
    {
        return mapreduceTaskTimeout;
    }

    public void setmapreduceTaskTimeout (String mapreduceTaskTimeout)
    {
        this.mapreduceTaskTimeout = mapreduceTaskTimeout;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mapreduce.reduce.memory.mb = "+mapreduceReduceMemoryMb+", yarn.app.mapreduce.am.command-opts = "+yarnAppMapreduceAmCommandOpt+", yarn.app.mapreduce.am.resource.mb = "+yarnAppMapreduceAmResourceMb+", mapred.job.user.name = "+mapredJobUserName+", mapreduce.task.userlog.limit.kb = "+mapreduceTaskUserlogLimitKb+", mapred.job.queue.name = "+mapredJobQueueName+", mapreduce.reduce.java.opts = "+mapreduceReduceJavaOpts+", mapreduce.task.timeout = "+mapreduceTaskTimeout+"]";
    }
}