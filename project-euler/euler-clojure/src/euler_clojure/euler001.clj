(ns euler-clojure.euler001)

(defn -is-multiple-3-or-5 [n]
  (or (= (mod n 3) 0) (= (mod n 5) 0)))

(defn sum-3-and-5 [n]
  (reduce + (filter -is-multiple-3-or-5 (range n))))
