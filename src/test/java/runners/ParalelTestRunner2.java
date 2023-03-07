package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin={"html:target\\cucumber-Preports2.html",
                "json:target/json-reports/Pcucumber2.json",
                "junit:target/xlm-report/Pcucumber2.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Paralel1",

        dryRun =false
        //dry run = true dediğimizde testi çalıştırmadan eksik adamı verir
        // dry run = false dediğimizde testi çalıştırır; eksik bir adımla karşılaşırız
        //test failed olur ve bize eksik adımı raporlar

)

public class ParalelTestRunner2 {
}
