$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "To Validate Login Funtionality Of Faceook application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.user_should_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with empty username and empty password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should click login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will redirect to invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.user_will_redirect_to_invalid_credential_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.steps.StepDefinition2.user_will_redirect_to_invalid_credential_page(StepDefinition2.java:21)\r\n\tat ✽.user will redirect to invalid credential page(file:src/test/resources/features/login.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/product.feature");
formatter.feature({
  "name": "To validate search function in snapdeal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate search box with product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be in snapdeal home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition3.user_should_be_in_snapdeal_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the product name in search box",
  "rows": [
    {
      "cells": [
        "Product",
        "New Product"
      ]
    },
    {
      "cells": [
        "mac laptop",
        "sanitizer"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition3.user_should_enter_the_product_name_in_search_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_should_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will navigate to product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.user_will_navigate_to_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});