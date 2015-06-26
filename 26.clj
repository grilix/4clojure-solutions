
(def solution

  (fn
    [n]
    (loop [acc []
           i   0]
      (if (= i n)
        acc
        (recur (let
                 [prev (- (count acc) 1)]
                 (conj acc
                       (if (< prev 1)
                         1
                         (+ (nth acc prev)
                            (nth acc (dec prev))))))
               (inc i)))))

  )

(solution 0)

(= (solution 8) '(1 1 2 3 5 8 13 21))
