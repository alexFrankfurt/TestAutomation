package com.automation.steps

import com.automation.driver
import com.automation.pages.{LoginPage, MainPage}
import org.apache.logging.log4j.Logger
import org.openqa.selenium.WebDriver


class Steps(driver: WebDriver, logger: Logger) {

  def closeDriver() = driver.quit()

  def openSignIn() = {
    val mainPage = new MainPage(driver)
    mainPage.openPage()
    mainPage.openSignIn()
  }

  def signIn(uE: String, up: String) = {
    val loginPage = new LoginPage(driver)
    loginPage.openPage()
    loginPage.login(uE, up)
  }

  def incorrectSignIn(uE: String, up: String) = {
    val loginPage = new LoginPage(driver)
    loginPage.openPage()
    loginPage.login(uE, up)
    logger.info(loginPage.msg.getText)
  }

  def openSignUp() = {
    val mainPage = new MainPage(driver)
    mainPage.openPage()
    mainPage.openSignUp()
    mainPage.sus()
  }

  def accountLookUp = {
    val mainPage = new MainPage(driver)
    mainPage.openPage()
    mainPage.openThreeButton
    mainPage.openAccountPage
  }
}

object Steps {
  def apply(): Steps = new Steps(driver.getDriver, driver.logger)
}
