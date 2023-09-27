



final class log_eg$_ {
def args = log_eg_sc.args$
def scriptPath = """/home/mrocco/workspace/fpscala/oop_data/src/main/log_eg.sc"""
/*<script>*/
// import java.lang.System.Logger.Level
import org.apache.logging.log4j.scala.Logging
import org.apache.logging.log4j.Level

class MyClass extends BaseClass with Logging{
    def doStuff(): Unit = {
        logger.info("Doing Stuff!!")
    }
    def doStuffWithLevel(level: Level): Unit = {
        logger(level, "Doing stuff with arbitrary level")
    }
    
}
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object log_eg_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new log_eg$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export log_eg_sc.script as log_eg

