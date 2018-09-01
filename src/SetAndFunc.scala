package SetAndFunc

trait DataTree[+A]

case class LeafNode[+A](data: A) extends DataTree[A]

case class BranchNode[+A](data: A, children: Seq[DataTree[A]]) extends DataTree[A]

object DataTree {
  def acciiDisplay(x: DataTree[String]): Seq[String] = {
    def goPlay(x: DataTree[String], levelSpace: String): Seq[String] = (x,levelSpace) match {
      case (LeafNode(data),_) => Seq(levelSpace + "+-" + data)
      case (BranchNode(data, children),"") => (levelSpace + "++" + data) +: playChildren(children, levelSpace + " ")
      case (BranchNode(data, children),_) => (levelSpace + "++" + data) +: playChildren(children, levelSpace + "|")
    }

    def playChildren(children: Seq[DataTree[String]], level_Space: String): Seq[String] = children match {
      case Nil => Nil
      case a_data_tree +: others => goPlay(a_data_tree, level_Space) ++ playChildren(others, level_Space)
    }

    goPlay(x, "")
  }

}

