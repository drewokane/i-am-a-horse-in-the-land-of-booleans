(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "Returns truthiness of value.
   false and nil return false."
  (if (or (nil? x) (false? x))
    false
    true))

(defn abs [x]
  "Returns absolute value of x"
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  "Returns if n is divisible by divisor"
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  "FizzBuzz implementation"
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  "Returns true if age is between
   13 and 19 inclusive"
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
  "Returns if age is not a teenager"
  (false? (teen? age)))

(defn generic-doublificate [x]
  "Strange function"
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  "Returns if year is leap"
  (if (or (and (divides? 4 year) (false? (divides? 100 year))) (divides? 400 year))
    true
    false))

; '_______'
