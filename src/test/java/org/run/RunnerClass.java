package org.run;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\cucu.feature"},glue= {"org.snip"},monochrome=true, plugin= {"pretty","html:C:\\Users\\Aboo\\eclipse-workspace\\Cucoo\\target","junit:C:\\Users\\Aboo\\eclipse-workspace\\Cucoo\\target\\sample.xml","json:C:\\Users\\Aboo\\eclipse-workspace\\Cucoo\\target\\sample.json"},tags="@sanity")
public class RunnerClass {
	

}
