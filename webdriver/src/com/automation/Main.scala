package com.automation

import com.automation.steps.Steps
import org.testng.annotations.{AfterMethod, BeforeMethod, Test}
import org.testng.Assert

class Main {

  val UserEmail = "nju@3a.by"
  val UserPassword = "password"
  val InvalidUserPassword = "fjldksjfl"
  val SignInText = "Sign in to Vocabulary.com"
  val UserName = "Alex A."

  var steps: Steps = null

  @BeforeMethod(description = "Init browser")
  def setUp() = {
    steps = Steps()
  }

  @Test
  def openSignIn() = {
    steps.openSignIn()
    Assert.assertTrue(steps.isLoginPage(SignInText))
  }

  @Test
  def login() = {
    steps.signIn(UserEmail, UserPassword)
    Assert.assertTrue(steps.loggedIn(UserName))
  }


  @Test
  def incorrectLogin = { 
    steps.incorrectSignIn(UserEmail, InvalidUserPassword)
    Assert.assertTrue(steps.incorrectLogInMessage)
  }


//  @Test
//  def openSignUp() = {
//    steps.openSignUp()
//    Assert.assertTrue(steps.isSignUpForm)
//  }

  @Test
  def openAccount() = {
    steps.signIn(UserEmail, UserPassword)
    Assert.assertTrue(steps.isAccountPage)
  }

  @AfterMethod(description = "Stop Browser")
  def stopBrowser() = steps.closeDriver()
}
