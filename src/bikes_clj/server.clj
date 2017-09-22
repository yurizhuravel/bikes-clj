(ns bikes-clj.server
  (:require
    [yada.yada :as yada]
    [taoensso.timbre :as log]))

(def server-port {:port 3030})

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
    (do
      (reset! running-server (yada/listener routes server-port))
      (log/info "Server starting on port" (get server-port :port)))))
