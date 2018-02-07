
package com.automation.pages

import java.util.concurrent.TimeUnit

import org.apache.logging.log4j.{LogManager, Logger}
import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}


class AccountPage(driver: WebDriver){

  private val logger: Logger = LogManager.getRootLogger

  val BaseUrl = "https://www.vocabulary.com/account/"
  
  @FindBy(xpath = "/html/body/div[1]/header/div/nav[1]/div/div/div[3]")
  var accINfField: WebElement = null
  
  PageFactory.initElements(this.driver, this)


  def openPage() = {
    driver.navigate().to(BaseUrl)
    logger.info("Account page opened")
  }
  
  def check(): Boolean = {
    accINfField.getText == "Alex A."
  }
  
}
