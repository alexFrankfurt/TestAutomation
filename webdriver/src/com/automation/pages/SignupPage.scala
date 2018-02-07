package com.automation.pages

import org.apache.logging.log4j.{LogManager, Logger}
import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}


class SignupPage(driver: WebDriver) {

  private val logger: Logger = LogManager.getRootLogger

  val BaseUrl = "https://www.vocabulary.com/signup/"

  @FindBy(css = "body > main > div.couplet > h1")
  var signupTxt: WebElement = null

  PageFactory.initElements(this.driver, driver)


  def openPage() = {
    driver.navigate().to(BaseUrl)
    logger.info("Sign up page opened")
  }

  def isSignUp(): Boolean = {
    logger.info(signupTxt.getText)
    signupTxt.getText == "Sign up for Vocabulary.com"
  }

}
