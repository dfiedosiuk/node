## Scala Project: Node

Write a class `Node` that can have zero, one or more `Node` children. The class should support adding a child `Node`, removing and listing them.

The most challenging part is `display` method that should display a `Node` with all children (that in turn may have `Node` children that are supposed to be displayed, too).

A sample display could look like the following:

```text
AdaptiveSparkPlan
+- Union
   :- HashAggregate_1
   :  +- Exchange
   :     +- HashAggregate
   :        +- Project
   :           +- Range
   +- HashAggregate_2
      +- Exchange
         +- HashAggregate
            +- Project
               +- Range
```

The above shows a `Node` (called `AdaptiveSparkPlan`) with one child (`Union`) that has two children `HashAggregate_1` and `HashAggregate_2` and so on.

Write unit tests.
