name := "s3cmd"

description := "A bundle for s3cmd tool"

homepage := Some(url("https://github.com/ohnosequences/s3cmd"))

organization := "ohnosequences"

organizationHomepage := Some(url("http://ohnosequences.com"))

licenses := Seq("AGPLv3" -> url("http://www.gnu.org/licenses/agpl-3.0.txt"))

bundleObjects := Seq("ohnosequences.statika.S3cmd")

libraryDependencies ++= Seq( 
  "ohnosequences" %% "git" % "0.7.0"
, "ohnosequences" %% "python" % "0.2.0"
) 
