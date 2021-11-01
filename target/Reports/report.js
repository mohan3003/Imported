$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Category.feature");
formatter.feature({
  "name": "To validate women session category",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "To validate the women session category by clicking various options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LACategorySteps.the_user_should_be_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the women category",
  "keyword": "When "
});
formatter.match({
  "location": "LACategorySteps.the_user_should_click_the_women_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should choose any one product",
  "keyword": "And "
});
formatter.match({
  "location": "LACategorySteps.the_user_should_choose_any_one_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should view the correct product",
  "keyword": "Then "
});
formatter.match({
  "location": "LACategorySteps.the_user_should_view_the_correct_product()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Verifythepage expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.stepDefinition.LACategorySteps.the_user_should_view_the_correct_product(LACategorySteps.java:39)\r\n\tat ✽.The user should view the correct product(file:src/test/resources/Category.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});