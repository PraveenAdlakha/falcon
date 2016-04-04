package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class PartitionsSpec
{
    private String assumeGrouped;

    private String numShards;

    private String maxPartitionSize;

    private String targetPartitionSize;

    private String type;

    private String partitionDimension;

    public String getAssumeGrouped ()
    {
        return assumeGrouped;
    }

    public void setAssumeGrouped (String assumeGrouped)
    {
        this.assumeGrouped = assumeGrouped;
    }

    public String getNumShards ()
    {
        return numShards;
    }

    public void setNumShards (String numShards)
    {
        this.numShards = numShards;
    }

    public String getMaxPartitionSize ()
    {
        return maxPartitionSize;
    }

    public void setMaxPartitionSize (String maxPartitionSize)
    {
        this.maxPartitionSize = maxPartitionSize;
    }

    public String getTargetPartitionSize ()
    {
        return targetPartitionSize;
    }

    public void setTargetPartitionSize (String targetPartitionSize)
    {
        this.targetPartitionSize = targetPartitionSize;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPartitionDimension ()
{
    return partitionDimension;
}

    public void setPartitionDimension (String partitionDimension)
    {
        this.partitionDimension = partitionDimension;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [assumeGrouped = "+assumeGrouped+", numShards = "+numShards+", maxPartitionSize = "+maxPartitionSize+", targetPartitionSize = "+targetPartitionSize+", type = "+type+", partitionDimension = "+partitionDimension+"]";
    }
}
