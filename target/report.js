$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucu.feature");
formatter.feature({
  "name": "validating login of adactin applications",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validating login page with users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should launch ther\" https://adactinhotelapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user should launch \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should select the details \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomType\u003e\",\"\u003cno.of.rooms\u003e\", \"\u003cadults\u003e\",\"\u003cchilds\u003e\",\"\u003ccheckIN\u003e\",\"\u003ccheckOut\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should select the hotel",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter the details \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003caddress\u003e\",\"\u003ccreditCardNo\u003e\",\"\u003ccardType\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\",\"\u003ccvv\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should get the OrderId",
  "keyword": "Then "
});
formatter.step({
  "name": "user should select my itineraray",
  "keyword": "Then "
});
formatter.step({
  "name": "user should enter the detail \"\u003csearch order id\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should select the go",
  "keyword": "Then "
});
formatter.step({
  "name": "user should selct the \"\u003corder id\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user should select cancel",
  "keyword": "Then "
});
formatter.step({
  "name": "user should click the alert",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "roomType",
        "no.of.rooms",
        "adults",
        "childs",
        "firstName",
        "lastName",
        "address",
        "creditCardNo",
        "cardType",
        "month",
        "year",
        "cvv",
        "search order id"
      ]
    },
    {
      "cells": [
        "nithinraje",
        "9876543210",
        "Paris",
        "Hotel Creek",
        "Double",
        "3 - Three",
        "1 - One",
        "2 - Two",
        "Alice",
        "Parker",
        "Chennai",
        "3698741254693214",
        "Master Card",
        "May",
        "2022",
        "555",
        "6M1390FD25"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validating login page with users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should launch ther\" https://adactinhotelapp.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Snipped.user_should_launch_ther(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should launch \"nithinraje\" and \"9876543210\" and the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Snipped.user_should_launch_and_and_the_login_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the details \"Paris\",\"Hotel Creek\",\"Double\",\"3 - Three\", \"1 - One\",\"2 - Two\",\"\u003ccheckIN\u003e\",\"\u003ccheckOut\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "Snipped.user_should_select_the_details(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the hotel",
  "keyword": "Given "
});
formatter.match({
  "location": "Snipped.user_should_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the details \"Alice\",\"Parker\",\"Chennai\",\"3698741254693214\",\"Master Card\",\"May\",\"2022\",\"555\"",
  "keyword": "And "
});
formatter.match({
  "location": "Snipped.user_should_enter_the_details(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the OrderId",
  "keyword": "Then "
});
formatter.match({
  "location": "Snipped.user_should_get_the_OrderId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select my itineraray",
  "keyword": "Then "
});
formatter.match({
  "location": "Snipped.user_should_select_my_itineraray()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the detail \"6M1390FD25\"",
  "keyword": "And "
});
formatter.match({
  "location": "Snipped.user_should_enter_the_detail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the go",
  "keyword": "Then "
});
formatter.match({
  "location": "Snipped.user_should_select_the_go()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should selct the \"\u003corder id\u003e\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Snipped.user_should_selct_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "Snipped.user_should_select_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the alert",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});