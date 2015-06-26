(def __
  #(remove sequential? (rest (tree-seq sequential? seq %))))

(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
(= (__ '((((:a))))) '(:a))


(source flatten)

(def values '((1 2) 3 [4 [5 6]]))
(def tree-seq-values (tree-seq sequential? seq values))
(remove sequential? (rest tree-seq-values))

