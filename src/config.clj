(ns config
    (:require
      [clojure.edn :as edn]))

(defmacro config
          [& keys]
          (let [env-cfg-file (str "./config.edn")
                config-opts (edn/read-string (slurp env-cfg-file))]
               (get-in config-opts keys)))