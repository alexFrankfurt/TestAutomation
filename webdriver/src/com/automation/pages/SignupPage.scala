package com.automation.pages

import org.apache.logging.log4j.{LogManager, Logger}
import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}


class SignupPage(driver: WebDriver) {

  private val logger: Logger = LogManager.getRootLogger

  val BaseUrl = "https://www.vocabulary.com/signup/"

  @FindBy(xpath = "//button[@class = 'ss-mail']")
  var signupStudent: WebElement = null

  PageFactory.initElements(this.driver, driver)

  def openSignUp() = {

  }

}
