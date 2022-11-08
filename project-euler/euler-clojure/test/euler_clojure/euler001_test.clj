(ns euler-clojure.euler001-test
  (:require [clojure.test :refer :all])
  (:require [euler-clojure.euler001 :refer :all]))

(deftest sum-3-and-5-test-49
  (testing
    (is (= (sum-3-and-5 49) 543))))

(deftest sum-3-and-5-test-19564
  (testing
    (is (= (sum-3-and-5 19564) 89301183))))

(deftest -is-multiple-3-or-5-true
  (testing
    (is (= (-is-multiple-3-or-5 6) true))))

(deftest -is-multiple-3-or-5-false
  (testing
    (is (= (-is-multiple-3-or-5 7) false))))
