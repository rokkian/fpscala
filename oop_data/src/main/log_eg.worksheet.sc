import org.apache.logging.log4j.scala.Logging
import org.apache.logging.log4j.Level
 
class MyClass extends BaseClass with Logging {
  def doStuff(): Unit = {
    logger.info("Doing stuff")
  }
  def doStuffWithLevel(level: Level): Unit = {
    logger(level, "Doing stuff with arbitrary level")
  }
}