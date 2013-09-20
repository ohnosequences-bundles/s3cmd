package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object S3cmd extends Bundle(Git :: Python :: HNil) {

  val metadata = generated.metadata.S3cmd

  val s3cmd = new java.io.File("s3cmd")

  def install[D <: AnyDistribution](distribution: D): InstallResults =
     (  Git.clone("https://github.com/s3tools/s3cmd.git")
    -&- "python setup.py install" @@ s3cmd
    ->- success(metadata+" is installed")
     )

}
