(ns config
    (:require
      [camel-snake-kebab.core :refer [->SCREAMING_SNAKE_CASE_STRING]]))

(def lookup
  {:www-url           "http://localhost:3103"
   :node-appboard-url "http://localhost:3000"})

(defmacro config [key] (or (System/getenv (->SCREAMING_SNAKE_CASE_STRING key))
                           (get lookup key)))
