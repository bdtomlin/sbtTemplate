// If you have JDK 7 and not JDK 8 then replace all three instances of the number 8 to the number 7

organization := "com.bryantomlin"

name := "changeMe"

version := "0.0.1"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8", "-feature", "-target:jvm-1.8", "-unchecked",
    "-Ywarn-adapted-args", "-Ywarn-value-discard", "-Xlint")

scalacOptions in (Compile, doc) <++= baseDirectory.map {
  (bd: File) => Seq[String](
     "-sourcepath", bd.getAbsolutePath,
     "-doc-source-url", "https://github.com/bdtomlin/changeMe/tree/master€{FILE_PATH}.scala"
  )
}

javacOptions ++= Seq("-Xlint:deprecation", "-Xlint:unchecked", "-source", "1.8", "-target", "1.8", "-g:vars")

resolvers ++= Seq(
  "Typesafe Releases"   at "http://repo.typesafe.com/typesafe/releases"
)

libraryDependencies ++= Seq(
//  "org.scalatest"           %% "scalatest"     % "2.0" % "test" withSources,
//  "com.github.nscala-time"  %% "nscala-time"   % "0.6.0" withSources
)

logLevel := Level.Warn

// define the statements initially evaluated when entering 'console', 'console-quick', or 'console-project'
initialCommands := """
                     |""".stripMargin

// Only show warnings and errors on the screen for compilations.
// This applies to both test:compile and compile and is Info by default
logLevel in compile := Level.Warn

cancelable := true
