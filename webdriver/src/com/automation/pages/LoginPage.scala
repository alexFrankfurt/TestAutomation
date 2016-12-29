package com.automation.pages

import java.util.concurrent.TimeUnit

import org.apache.logging.log4j.{LogManager, Logger}
import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}


class LoginPage(driver: WebDriver){

  private val logger: Logger = LogManager.getRootLogger

  val BaseUrl = "https://www.vocabulary.com/login/"

  @FindBy(xpath = "//*[@id='loginform']/div[3]/div[1]/input")
  var inputLogin: WebElement = null

  @FindBy(xpath = "//*[@id='loginform']/div[4]/div[1]/input")
  var inputPassword: WebElement = null

  @FindBy(xpath = "//*[@id='loginform']/div[6]/button")
  var buttonSignIn: WebElement = null

  @FindBy(xpath = "//*[@id='loginform']/div[1]/p[1]")
  var msg: WebElement = null

  PageFactory.initElements(this.driver, this)

  def openPage() = {
    driver.navigate().to(BaseUrl)
    logger.info("Login page opened")
  }

  def login(login: String, password: String) = {
    inputLogin.sendKeys(login)
    inputPassword.sendKeys(password)
    buttonSignIn.click()
    logger.info("logging Performed")
  }

  def invalidLogin(login: String, password: String) = {
    inputLogin.sendKeys(login)
    inputPassword.sendKeys(password)
    buttonSignIn.click()
    PageFactory.initElements(this.driver, this)

    logger.info("Invalid  data " + msg.getText)
  }

}
