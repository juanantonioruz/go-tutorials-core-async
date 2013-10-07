;; http://tour.golang.org/#62

(ns go-tutorials-core-async.tut1
  (require [clojure.core.async :as async :refer :all]))

(go
 (dotimes [_ 5]
   (<! (timeout 100))
   (println "world")))

(println "hello")
