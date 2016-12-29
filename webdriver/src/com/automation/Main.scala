package com.automation

import com.automation.steps.Steps
import org.testng.annotations.{AfterMethod, BeforeMethod, Test}

class Main {

  val UserEmail = "alex_frankfurt@mail.ru"
  val UserPassword = "might39"
  val InvalidUserPassword = "fjldksjfl"

  var steps: Steps = null

  @BeforeMethod(description = "Init browser")
  def setUp() = {
    steps = Steps()
  }

//  @Test
  def openSignIn() = steps.openSignIn()

//  @Test
  def login() = steps.signIn(UserEmail, UserPassword)


//  @Test
  def incorrectLogin = steps.incorrectSignIn(UserEmail, InvalidUserPassword)


//  @Test
  def openSignUp() = steps.openSignUp()

  @Test
  def openAccount() = {
    steps.signIn(UserEmail, UserPassword)
    steps.accountLookUp
  }

  @AfterMethod(description = "Stop Browser")
  def stopBrowser() = steps.closeDriver()
}