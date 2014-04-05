(ns ecv.core
  (:require-macros [hiccups.core :as hiccups])
  (:require [hiccups.runtime :as hiccupsrt]
            [ecv.data :refer [cvdata]]
            [ecv.views :as v]))

(enable-console-print!)

(defn -main []
 (println (hiccups/html (v/layout cvdata))))

(set! *main-cli-fn* -main)
