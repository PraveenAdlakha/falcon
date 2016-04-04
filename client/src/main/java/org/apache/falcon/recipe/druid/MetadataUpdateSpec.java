package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class MetadataUpdateSpec
{
    private String segmentTable;

    private String connectURI;

    private String type;

    private String user;

    private String password;

    public String getSegmentTable ()
    {
        return segmentTable;
    }

    public void setSegmentTable (String segmentTable)
    {
        this.segmentTable = segmentTable;
    }

    public String getConnectURI ()
    {
        return connectURI;
    }

    public void setConnectURI (String connectURI)
    {
        this.connectURI = connectURI;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getUser ()
    {
        return user;
    }

    public void setUser (String user)
    {
        this.user = user;
    }

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [segmentTable = "+segmentTable+", connectURI = "+connectURI+", type = "+type+", user = "+user+", password = "+password+"]";
    }
}
