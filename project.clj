(defproject hello "0.1.0-SNAPSHOT"
  :description "FIXME: Hello World"
  :url "http://github.com/OCExercise/ocexercise-clojure-hello"
  :license {:name "The BSD 2-Clause License"
            :url "https://opensource.org/licenses/BSD-2-Clause"}
  :dependencies    [[org.clojure/clojure "1.7.0"]
                    [http-kit "2.1.19"]]
  :main ^:skip-aot blog-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
