object Main extends App {

  trait Tree
  case class Parent(name: String, child1: Tree, child2: Tree) extends Tree
  case class Child(name: String) extends Tree
  val tree = Parent( "GreatGrandad",
    Parent( "Grandad ",
      Child("Adult"),
      Parent( "Dad",
        Child("Child"),
        Child("Child"))),
    Child("Grandad"))

  val myNode = new Node
  myNode.pprint(tree)
}
