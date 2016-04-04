package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class GranularitySpec
{
    private String queryGranularity;

    private String[] intervals;

    private String segmentGranularity;

    private String type;

    public String getQueryGranularity ()
    {
        return queryGranularity;
    }

    public void setQueryGranularity (String queryGranularity)
    {
        this.queryGranularity = queryGranularity;
    }

    public String[] getIntervals ()
    {
        return intervals;
    }

    public void setIntervals (String[] intervals)
    {
        this.intervals = intervals;
    }

    public String getSegmentGranularity ()
    {
        return segmentGranularity;
    }

    public void setSegmentGranularity (String segmentGranularity)
    {
        this.segmentGranularity = segmentGranularity;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [queryGranularity = "+queryGranularity+", intervals = "+intervals+", segmentGranularity = "+segmentGranularity+", type = "+type+"]";
    }
}
