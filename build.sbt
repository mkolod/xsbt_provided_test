name := "xwp-template"

organization := "com.earldouglas"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.3"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "7.6.9.v20130131" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.apache.commons" % "commons-math3" % "3.3" % "provided"
)

host in container.Configuration := "localhost"

port in container.Configuration := 8081

run in Compile <<= Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run)) 

//fullClasspath in container.Configuration <<= fullClasspath in Compile

fullClasspath in container.Configuration := (fullClasspath in Compile).value ++ (fullClasspath in container.Configuration).value
