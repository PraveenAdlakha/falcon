package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class Parser
{
    private ParseSpec parseSpec;

    private String type;

    public ParseSpec getParseSpec ()
    {
        return parseSpec;
    }

    public void setParseSpec (ParseSpec parseSpec)
    {
        this.parseSpec = parseSpec;
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
        return "ClassPojo [parseSpec = "+parseSpec+", type = "+type+"]";
    }
}
