name := "automation"

scalaVersion := "2.12.1"

sourceDirectory in Compile := baseDirectory.value / "src"

scalaSource in Compile := (sourceDirectory in Compile).value

javaSource in Compile := (sourceDirectory in Compile).value

mainClass := Some("com.automation.Main")

resourceDirectory in (Compile, run) := baseDirectory.value / "resources"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "3.0.1",
  "org.testng" % "testng" % "6.8.8",
  "org.apache.logging.log4j" % "log4j-core" % "2.7",
  "org.apache.logging.log4j" % "log4j-api" % "2.7"
)
