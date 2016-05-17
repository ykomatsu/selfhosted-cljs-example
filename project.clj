(defproject selfhosted-cljs-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://github.com/ykomatsu/selfhosted-cljs-example"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.40"]]
  :plugins [[lein-figwheel "0.5.3-1"]]
  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :figwheel true
              :compiler {:main "selfhosted-cljs-example.core"
                         :asset-path "js/dev"
                         :output-to "resources/public/js/index-dev.js"
                         :output-dir "resources/public/js/dev"}}]})
