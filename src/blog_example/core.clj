(ns blog-example.core
  (:require [org.httpkit.client :as http])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println @(http/get "https://api.github.com/users/octocat/orgs")))