(ns bikes-clj.core
  (:require
    [bikes-clj.server :as server]))

(defn -main [& args]
  (server/start-server)
  @(promise))