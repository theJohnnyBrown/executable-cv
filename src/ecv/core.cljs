(ns ecv.core
  (:require-macros [hiccups.core :as hiccups])
  (:require [hiccups.runtime :as hiccupsrt]
            [ecv.data :refer [cvdata]]
            [ecv.views :as v]
            [cljs.nodejs :as nodejs]))

(enable-console-print!)
(def nodemailer (nodejs/require "nodemailer"))
(def prompt (nodejs/require "prompt"))
(def fs (nodejs/require "fs"))

(def user-email "johnnybrown7@gmail.com")

(defn send-application! [email resume-pdf subject-file markdown-body]
  (doto prompt
    .start
    (.get (clj->js {:properties {:password {:hidden true}}})
          (fn [err result]
             (let [password (.-password result)
                   smtp-transport (.createTransport nodemailer "SMTP"
                                    (clj->js {:service "Gmail"
                                              :auth {:user user-email
                                                     :pass password}}))]
                (.readFile fs subject-file
                  (fn [err subject-data]
                      (.readFile fs markdown-body
                        (fn [err mkd]
                          (.sendMail smtp-transport
                            (clj->js {:text mkd :from user-email
                                      :to email :subject subject-data
                                      :html mkd
                                      :attachments
                                      [{:filePath resume-pdf
                                        :fileName "resume.pdf"}]})
                            (fn [err msg]
                              (println
                               (str (or err (.-message msg))))
                              (.exit js/process 0))))))))))))

;; TODO handle all those errs

(defn -main []
 (if (< (count (.-argv js/process)) 3)
  (println (hiccups/html (v/layout cvdata)))
  (apply send-application! (drop 2 (.-argv js/process)))))

(set! *main-cli-fn* -main)
