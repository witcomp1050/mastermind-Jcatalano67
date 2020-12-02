package edu.wit.comp1050;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class gameConfig {
    public gameConfig(){

    }
    public int getGuessRows(){
        return guessRows;
    }
    public String getDups(){
        return dupsAllowedInCode;
    }
    public String getBlanks(){
        return blanksAllowedInCode;
    }
    public void gameConfigSet(int guessRows, String dupsAllowedInCode, String blanksAllowedInCode){
        this.guessRows = guessRows;
        this.dupsAllowedInCode = dupsAllowedInCode;
        this.blanksAllowedInCode = blanksAllowedInCode;

    }
    public void configObjs(){
        String dupsAllowedInCode = config.getString("dupAllowedInCode");
        int guessRows = config.getInt("guessRows");
        String blanksAllowedInCode = config.getString("blanksAllowedInCode");
        gameConfigSet(guessRows,dupsAllowedInCode,blanksAllowedInCode);
    }
    Parameters params = new Parameters();
    FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
            new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                    .configure(params.properties()
                            .setFileName("mmind.properties"));

    {
        try {
            FileBasedConfiguration config = builder.getConfiguration();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }
    int guessRows;
    String dupsAllowedInCode;
    String blanksAllowedInCode;
    Configuration config;

}

