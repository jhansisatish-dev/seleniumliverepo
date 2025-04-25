package features;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
                glue="stepdefinations")
public class Runner {

}
