(defproject ecv "0.1.0-SNAPSHOT"
  :description "One of the presumably many CV or resume management tools created by funemployed programmers"
  :url "http://example.com/FIXME"
  :license {:name "GNU GPL"
            :url "https://gnu.org/licenses/gpl.html"}
  :plugins [[lein-npm "0.3.2"]
            [lein-cljsbuild "1.0.3"]]

  :node-dependencies []

  :cljsbuild
    {:builds
     [{:id "node"
       :source-paths ["src"]
       :compiler
       {:pretty-print true
        :target :nodejs
        :optimizations :simple
        :language-in :ecmascript5}}]}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [com.andrewmcveigh/cljs-time "0.1.1"]
                 [hiccups "0.3.0"]
                 [secretary "1.1.0"]])
