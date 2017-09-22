(defproject bikes-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [yada "1.2.9"]
                 [bidi "2.1.2"]
                 [aleph "0.4.1"]
                 [com.taoensso/timbre "4.10.0"]]
  :main ^:skip-aot bikes-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
