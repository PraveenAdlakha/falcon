package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class MetricsSpec
{
    private String name;

    private String type;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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
        return "ClassPojo [name = "+name+", type = "+type+"]";
    }
}