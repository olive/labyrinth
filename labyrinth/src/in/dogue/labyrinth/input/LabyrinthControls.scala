package in.dogue.labyrinth.input

import com.deweyvm.gleany.saving.{ControlName, ControlNameCollection}

class LabyrinthControls(descriptor: String) extends ControlName {
  override def name: String = descriptor
}

object LabyrinthControls extends ControlNameCollection[LabyrinthControls] {
  def fromString(string: String): Option[LabyrinthControls] = None
  def makeJoypadDefault: Map[String,String] = Map()
  def makeKeyboardDefault: Map[String,java.lang.Float] = Map()
  def values: Seq[LabyrinthControls] = Seq()
}
