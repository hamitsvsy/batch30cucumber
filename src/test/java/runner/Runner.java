package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@facebook",

        dryRun =false
        //dry run = true dediğimizde testi çalıştırmadan eksik adamı verir
        // dry run = false dediğimizde testi çalıştırır; eksik bir adımla karşılaşırız
        //test failed olur ve bize eksik adımı raporlar

)


public class Runner {



}
