package org.apache.falcon.recipe.druid;

/**
 * Created by praveen on 4/4/16.
 */
public class DimensionsSpec
{
    private String[] dimensionExclusions;

    private String[] spatialDimensions;

    private String[] dimensions;

    public String[] getDimensionExclusions ()
    {
        return dimensionExclusions;
    }

    public void setDimensionExclusions (String[] dimensionExclusions)
    {
        this.dimensionExclusions = dimensionExclusions;
    }

    public String[] getSpatialDimensions ()
    {
        return spatialDimensions;
    }

    public void setSpatialDimensions (String[] spatialDimensions)
    {
        this.spatialDimensions = spatialDimensions;
    }

    public String[] getDimensions ()
    {
        return dimensions;
    }

    public void setDimensions (String[] dimensions)
    {
        this.dimensions = dimensions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dimensionExclusions = "+dimensionExclusions+", spatialDimensions = "+spatialDimensions+", dimensions = "+dimensions+"]";
    }
}
