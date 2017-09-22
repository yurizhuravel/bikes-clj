(ns bikes-clj.core
  (:require
    [yada.yada :as yada]))

(def routes
  ["/"
   [
    ["" (yada/as-resource "Hello root!")]
    ["hello" (yada/as-resource "Hello World!")]
    ["test" (yada/resource {:produces "text/plain"
                       :response "This is a test!"})]
    [true (yada/as-resource nil)]]])

(def running-server (atom nil))

(defn start-server []
  (if @running-server
    nil
    (reset! running-server (yada/listener routes
                                     {:port 3030}))))

(defn -main
  [& args]
  (start-server)
  (println "Server starting on 3030")
  @(promise))