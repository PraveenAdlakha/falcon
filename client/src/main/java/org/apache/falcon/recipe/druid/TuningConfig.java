package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class TuningConfig
{
    private JobProperties jobProperties;

    private String shardSpecs;

    private String persistInHeap;

    private String ignoreInvalidRows;

    private PartitionsSpec partitionsSpec;

    private String workingPath;

    private String type;

    private String overwriteFiles;

    private String ingestOffheap;

    private String combineText;

    private String cleanupOnFailure;

    private String leaveIntermediate;

    public JobProperties getJobProperties ()
    {
        return jobProperties;
    }

    public void setJobProperties (JobProperties jobProperties)
    {
        this.jobProperties = jobProperties;
    }

    public String getShardSpecs ()
    {
        return shardSpecs;
    }

    public void setShardSpecs (String shardSpecs)
    {
        this.shardSpecs = shardSpecs;
    }

    public String getPersistInHeap ()
    {
        return persistInHeap;
    }

    public void setPersistInHeap (String persistInHeap)
    {
        this.persistInHeap = persistInHeap;
    }

    public String getIgnoreInvalidRows ()
    {
        return ignoreInvalidRows;
    }

    public void setIgnoreInvalidRows (String ignoreInvalidRows)
    {
        this.ignoreInvalidRows = ignoreInvalidRows;
    }

    public PartitionsSpec getPartitionsSpec ()
    {
        return partitionsSpec;
    }

    public void setPartitionsSpec (PartitionsSpec partitionsSpec)
    {
        this.partitionsSpec = partitionsSpec;
    }

    public String getWorkingPath ()
    {
        return workingPath;
    }

    public void setWorkingPath (String workingPath)
    {
        this.workingPath = workingPath;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getOverwriteFiles ()
    {
        return overwriteFiles;
    }

    public void setOverwriteFiles (String overwriteFiles)
    {
        this.overwriteFiles = overwriteFiles;
    }

    public String getIngestOffheap ()
    {
        return ingestOffheap;
    }

    public void setIngestOffheap (String ingestOffheap)
    {
        this.ingestOffheap = ingestOffheap;
    }

    public String getCombineText ()
    {
        return combineText;
    }

    public void setCombineText (String combineText)
    {
        this.combineText = combineText;
    }

    public String getCleanupOnFailure ()
    {
        return cleanupOnFailure;
    }

    public void setCleanupOnFailure (String cleanupOnFailure)
    {
        this.cleanupOnFailure = cleanupOnFailure;
    }

    public String getLeaveIntermediate ()
    {
        return leaveIntermediate;
    }

    public void setLeaveIntermediate (String leaveIntermediate)
    {
        this.leaveIntermediate = leaveIntermediate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [jobProperties = "+jobProperties+", shardSpecs = "+shardSpecs+", persistInHeap = "+persistInHeap+", ignoreInvalidRows = "+ignoreInvalidRows+", partitionsSpec = "+partitionsSpec+", workingPath = "+workingPath+", type = "+type+", overwriteFiles = "+overwriteFiles+", ingestOffheap = "+ingestOffheap+", combineText = "+combineText+", cleanupOnFailure = "+cleanupOnFailure+", leaveIntermediate = "+leaveIntermediate+"]";
    }
}
