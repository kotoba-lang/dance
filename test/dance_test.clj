(ns dance-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.dance :as dance]))

(deftest frame-ir-is-valid
  (let [f (dance/frame-ir {} 0)]
    (is (dance/valid-frame? f))
    (is (seq (:instances f)))))
