(defproject uberjar-release "1.0.0-SNAPSHOT"
  :description "Leiningen Uberjar Release Plugin"
  :dev-dependencies [[swank-clojure "1.4.2"]]
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :lein-release {:deploy-via :clojars}
  :eval-in-leiningen true
  :min-lein-version "2.0.0")
