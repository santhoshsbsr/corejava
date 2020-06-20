package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features/CreateLeadUsingExamples.feature"}, glue="stepdefinitions", monochrome=true, plugin = {"pretty","html:/target/Cucumber-Reports"}/*, dryRun =true, snippets = SnippetType.CAMELCASE*/)
//where dry run gives the feature output in case if we execute the feture file and dont get the output
public class Runner extends AbstractTestNGCucumberTests{

}
