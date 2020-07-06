package in.dogue.labyrinth.modes

import scala.util.Random
import in.dogue.antiqua.graphics.{Tile, TileRenderer}
import in.dogue.antiqua.data.CP437
import com.deweyvm.gleany.graphics.Color

import in.dogue.antiqua.Antiqua
import Antiqua._

case class Player(pos:Cell) {
  val tile = Tile(CP437.☻, Color.Black, Color.White)
  def update() = {
    this
  }
}

object GameMode {
  def create(cols:Int, rows:Int, r:Random) = {
    new GameMode(Player((0,0)))
  }
}

case class GameMode private (p:Player) {
  def update = {
    copy(p=p.update()).toMode
  }

  def draw(tr:TileRenderer):TileRenderer = {
    tr <+ (p.pos, p.tile)
  }

  def toMode:Mode = Mode[GameMode](_.update, _.draw, this)
}
