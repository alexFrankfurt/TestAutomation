package com.automation.pages

import java.util.concurrent.TimeUnit

import org.apache.logging.log4j.{LogManager, Logger}
import org.openqa.selenium.{JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}


class MainPage(driver: WebDriver) {
  private val logger: Logger = LogManager.getRootLogger

  val BaseUrl = "https://www.vocabulary.com/"

  @FindBy(xpath = "/html/body/div/header/div/nav[1]/div/a[1]")
  private var signInButton: WebElement = null

  @FindBy(xpath = "//a[@class = 'signup']")
  private var signUpButton: WebElement = null

  @FindBy(xpath = "//button[@class = 'ss-mail']")
  var signupStudent: WebElement = null

  @FindBy(xpath = "/html/body/main/form/div[9]/button")
  var createAccountButton: WebElement = null

  @FindBy(xpath = "/html/body/div[2]/header/div/nav[1]/button")
  var threeButton: WebElement = null

  @FindBy(xpath = "/html/body/div[2]/nav/div[1]/div/div[1]/div[2]/ul/li[9]")
  var myaccButton: WebElement = null

  PageFactory.initElements(this.driver, this)

  def openPage() = {
    driver.navigate().to(BaseUrl)
    logger.info("Main page opened")
  }

  def openSignIn() = {
    signInButton.click()
    logger.info("Sign In form opened")
  }

  def openSignUp() = {
    signUpButton.click()
    logger.info("Sign Up form opened")
  }

  def sus() = {
    signupStudent.click()
    logger.info("Signin up as a student" + signupStudent.getText)
  }

  def openThreeButton = {
    threeButton.click()
    logger.info("clicking three button")
  }

  def openAccountPage = {
    val jse: JavascriptExecutor  = driver.asInstanceOf[JavascriptExecutor]

    jse.executeScript("arguments[0].scrollIntoView()", myaccButton)
    myaccButton.click()
    logger.info("opening account page")
  }
}
