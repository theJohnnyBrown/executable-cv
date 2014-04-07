(ns ecv.views
  (:require [cljs-time.format :refer [formatter unparse]]
            [cljs.nodejs :as nodejs]))
(enable-console-print!)

(def fs (nodejs/require "fs"))

(def __dirname (js* "__dirname"))
(defn resource-path [fname]
  (str __dirname "/../resources/" fname))

(defn dfmt [dt]
  (unparse (formatter "yyyy-MM") dt))

(defn github-label [url]
 [:a.github-label
  {:href url}
  [:img
   {:style "position: absolute; top: 0; left: 0; border: 0; z-index: 9999;"
    :src
    "https://s3.amazonaws.com/github/ribbons/forkme_left_gray_6d6d6d.png"
    :alt "Fork me on GitHub"}]])

(defn layout [cv]
  [:html
  {:lang "en"}
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:content "IE=edge", :http-equiv "X-UA-Compatible"}]
   [:meta
    {:content "width=device-width, initial-scale=1", :name "viewport"}]
   [:meta {:content "", :name "description"}]
   [:meta {:content "", :name "author"}]
   [:link {:href "img/favicon.ico", :rel "shortcut icon"}]
   [:title (:name cv) " " (:position_sought cv)]
   [:style (.readFileSync fs (resource-path "css/bootstrap.min.css"))]
   [:style (.readFileSync fs (resource-path "css/cover.css"))]]
  [:body
   (github-label (get-in cv [:basic :github_profile]))
   [:div.site-wrapper
    [:div.site-wrapper-inner
     [:div.cover-container
      [:div.masthead.clearfix
       [:div.inner
        [:h3.masthead-brand (get-in cv [:basic :name])]
        [:ul.nav.masthead-nav
         [:li (let [phone (get-in cv [:basic :phone])]
                [:a {:href (str "phone:" phone)} phone])]
         [:li (let [email (get-in cv [:basic :email])]
                [:a {:href (str "mailto:" email)} email])]]
        [:div.inner.cover ;; main content goes here
         [:p.intro (:introduction cv)]
         [:h3.section "Some interesting things I've done"]
         [:ul.badges (for [[desc url] (:badges cv)]
                       [:li [:a {:href url} desc]])]
         [:h3.section "Experience"]
         [:ul.experience
          (for [{:keys
                 [position employer location start-date end-date description]}
                (:experience cv)]
            [:li
             [:div.experience-heading
              [:span.experience-employer employer] " - "
              [:span.experience-position position]
              [:span.experience-date.date-in-range
               (dfmt start-date) " - " (dfmt end-date)]]
             [:p.experience-desc description]])]
         [:h3.section "Education"]
         [:ul.education (for [{:keys [name start-date end-date description]}
                              (:education cv)]
                          [:li
                           [:div.education-heading
                            [:span.education-title name]
                            [:span.education-date.date-in-range
                             (dfmt start-date) " - " (dfmt end-date)]]
                           [:p.education-desc description]])]]

        ]]]]]]])
