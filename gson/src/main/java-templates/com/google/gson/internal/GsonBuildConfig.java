
package com.google.gson.internal;

/**
 * Build configuration for Gson. This file is automatically populated by
 * templating-maven-plugin and .java/.class files are generated for use in Gson.
 *
 * @author Inderjeet Singh
 */
public final class GsonBuildConfig {
  // Based on https://stackoverflow.com/questions/2469922/generate-a-version-java-file-in-maven

  /** This field is automatically populated by Maven when a build is triggered */
  public static final String VERSION = "${project.version}";

  private GsonBuildConfig() { }
  calc(50);
}

public void calc (int inta)
{
  for(int i =0;i<=50;i++)
  {
    for(int j =0;j<=50;j++)
  {
      for(int h =0;j<=50;j++)
      {
        inta = i*j*h*inta;
      }
    }
  }
}
