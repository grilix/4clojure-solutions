
(def __


  #(clojure.string/replace % #"[^A-Z]" "")

)

(__ "HeLlO, WoRlD!")

(= (__ "HeLlO, WoRlD!") "HLOWRD")
(empty? (__ "nothing"))
(= (__ "$#A(*&987Zf") "AZ")

(clojure.string/replace "ABcDe" #"[^A-Z]" "")
