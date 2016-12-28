package com.automation.steps

import com.automation.driver
import org.apache.logging.log4j.Logger
import org.openqa.selenium.WebDriver


class Steps(driver: WebDriver, logger: Logger) {

  def closeDriver() = driver.quit()


}

object Steps {
  def apply(): Steps = new Steps(driver.getDriver, driver.logger)
}
