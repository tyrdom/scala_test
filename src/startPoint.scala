import SetAndFunc._

object startPoint {

  def main(args: Array[String]): Unit = {
    val x = BranchNode("root",children = List(BranchNode("lv1-1",children = List(BranchNode("lv2-1",children = List(LeafNode("lv3-1"),LeafNode("lv3-2")) ),LeafNode("lv2-2"))),BranchNode("lv1-2",children =List(LeafNode("lv2-1")) ),LeafNode("lv1-3")))
      DataTree.acciiDisplay(x).foreach(println)
  }

}

