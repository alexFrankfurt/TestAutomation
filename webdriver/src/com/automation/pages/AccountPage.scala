
package com.automation.pages

import java.util.concurrent.TimeUnit

import org.apache.logging.log4j.{LogManager, Logger}
import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}


class AccountPage(driver: WebDriver){

  private val logger: Logger = LogManager.getRootLogger

  val BaseUrl = "https://www.vocabulary.com/account/"
  
  @FindBy(xpath = "//*[@id='pageContent']/div/div/div/nav/ul/li[1]/a")
  var accINfField: WebElement = null
  
  PageFactory.initElements(this.driver, this)
  
  def check(): Boolean = {
    accINfField.getText == "Account Information"
  }
  
}
