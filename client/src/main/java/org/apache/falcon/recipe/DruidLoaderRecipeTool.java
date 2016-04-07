package org.apache.falcon.recipe;

import java.util.Properties;

/**
 * Created by praveen on 7/4/16.
 */
public class DruidLoaderRecipeTool implements Recipe {

    private static final String COMMA_SEPARATOR = ",";

    @Override
    public void validate(final Properties recipeProperties) {
        for (HdfsReplicationRecipeToolOptions option : HdfsReplicationRecipeToolOptions.values()) {
            if (recipeProperties.getProperty(option.getName()) == null && option.isRequired()) {
                throw new IllegalArgumentException("Missing argument: " + option.getName());
            }
        }
    }

    @Override
    public Properties getAdditionalSystemProperties(final Properties recipeProperties) {
        Properties additionalProperties = new Properties();
        return additionalProperties;
    }
}
