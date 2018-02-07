package com.automation.steps

import com.automation.driver
import com.automation.pages.{AccountPage, LoginPage, MainPage, SignupPage}
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
    val signupPage = new SignupPage(driver)
    signupPage.openPage()
  }

  def accountLookUp = {
    val mainPage = new MainPage(driver)
    mainPage.openPage()
    mainPage.openThreeButton
    mainPage.openAccountPage
  }

  def isLoginPage(s: String): Boolean = {
    val loginPage = new LoginPage(driver)
    loginPage.hasText(s)
  }

  def isAccountPage: Boolean  = {
    val accPage = new AccountPage(driver)
    accPage.openPage()
    accPage.check()
  }

  def isSignUpForm: Boolean = {
    val signupPage = new SignupPage(driver)
    signupPage.isSignUp()
  }

  def incorrectLogInMessage: Boolean = {
    val loginPage = new LoginPage(driver)
    loginPage.loginError()
  }

  def loggedIn(un: String): Boolean = {
    val accPage = new AccountPage(driver)
    accPage.openPage()
    accPage.check()
  }
}

object Steps {
  def apply(): Steps = new Steps(driver.getDriver, driver.logger)
}
