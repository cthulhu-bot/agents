(defproject agents "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [reloaded.repl "0.2.3"]]
  :main ^:skip-aot agents.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
