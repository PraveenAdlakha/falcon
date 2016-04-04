package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class ParseSpec
{
    private String delimiter;

    private String listDelimiter;

    private TimestampSpec timestampSpec;

    private String[] columns;

    private DimensionsSpec dimensionsSpec;

    private String format;

    public String getDelimiter ()
    {
        return delimiter;
    }

    public void setDelimiter (String delimiter)
    {
        this.delimiter = delimiter;
    }

    public String getListDelimiter ()
    {
        return listDelimiter;
    }

    public void setListDelimiter (String listDelimiter)
    {
        this.listDelimiter = listDelimiter;
    }

    public TimestampSpec getTimestampSpec ()
    {
        return timestampSpec;
    }

    public void setTimestampSpec (TimestampSpec timestampSpec)
    {
        this.timestampSpec = timestampSpec;
    }

    public String[] getColumns ()
    {
        return columns;
    }

    public void setColumns (String[] columns)
    {
        this.columns = columns;
    }

    public DimensionsSpec getDimensionsSpec ()
    {
        return dimensionsSpec;
    }

    public void setDimensionsSpec (DimensionsSpec dimensionsSpec)
    {
        this.dimensionsSpec = dimensionsSpec;
    }

    public String getFormat ()
    {
        return format;
    }

    public void setFormat (String format)
    {
        this.format = format;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [delimiter = "+delimiter+", listDelimiter = "+listDelimiter+", timestampSpec = "+timestampSpec+", columns = "+columns+", dimensionsSpec = "+dimensionsSpec+", format = "+format+"]";
    }
}
