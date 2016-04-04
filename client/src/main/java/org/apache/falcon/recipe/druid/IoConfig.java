package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class IoConfig
{
    private String segmentOutputPath;

    private MetadataUpdateSpec metadataUpdateSpec;

    private InputSpec inputSpec;

    private String type;

    public String getSegmentOutputPath ()
    {
        return segmentOutputPath;
    }

    public void setSegmentOutputPath (String segmentOutputPath)
    {
        this.segmentOutputPath = segmentOutputPath;
    }

    public MetadataUpdateSpec getMetadataUpdateSpec ()
    {
        return metadataUpdateSpec;
    }

    public void setMetadataUpdateSpec (MetadataUpdateSpec metadataUpdateSpec)
    {
        this.metadataUpdateSpec = metadataUpdateSpec;
    }

    public InputSpec getInputSpec ()
    {
        return inputSpec;
    }

    public void setInputSpec (InputSpec inputSpec)
    {
        this.inputSpec = inputSpec;
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
        return "ClassPojo [segmentOutputPath = "+segmentOutputPath+", metadataUpdateSpec = "+metadataUpdateSpec+", inputSpec = "+inputSpec+", type = "+type+"]";
    }
}