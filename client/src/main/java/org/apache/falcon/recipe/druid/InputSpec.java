package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class InputSpec
{
    private String paths;

    private String type;

    public String getPaths ()
    {
        return paths;
    }

    public void setPaths (String paths)
    {
        this.paths = paths;
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
        return "ClassPojo [paths = "+paths+", type = "+type+"]";
    }
}
