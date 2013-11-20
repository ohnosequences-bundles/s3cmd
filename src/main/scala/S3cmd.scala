package ohnosequences.statika.bundles

import ohnosequences.statika._
import sys.process._

case object Python extends YumBundle("python")

case object S3cmd extends Bundle(Git :~: Python) {

  override def install[D <: AnyDistribution](d: D): InstallResults =
     (  Git.clone("https://github.com/s3tools/s3cmd.git")
    -&- "python setup.py install" @@ (new java.io.File("s3cmd"))
    ->- success(name+" is installed")
     )

}
