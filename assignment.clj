(defn isEven [x] (= 0 (mod x 2)))

(println (isEven 3))
(println (isEven 4))

(defn isOdd [x] (not (isEven x)))

(println (isOdd 3))
(println (isOdd 2))