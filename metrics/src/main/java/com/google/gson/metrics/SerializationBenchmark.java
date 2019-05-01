
package com.google.gson.metrics;

import com.google.caliper.Param;
import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializationBenchmark extends SimpleBenchmark {

  private Gson gson;
  private BagOfPrimitives bag;
  @Param
  private boolean pretty;

  public static void main(String[] args) {
    Runner.main(SerializationBenchmark.class, args);
  }
  
  @Override
  protected void setUp() throws Exception {
    this.gson = pretty ? new GsonBuilder().setPrettyPrinting().create() : new Gson();
    this.bag = new BagOfPrimitives(10L, 1, false, "foo");
  }

  public void timeObjectSerialization(int reps) {
    for (int i=0; i<reps; ++i) {
      gson.toJson(bag);
    }
  }
  
   public void timeObjectSerializations(int reps, int number) {
    for (int i=0; i<reps; ++i) {
      gson.toJson(bag);
      number +=2;
    }
  }
}
