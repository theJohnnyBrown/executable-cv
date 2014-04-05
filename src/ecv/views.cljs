(ns ecv.views
  (:require [cljs-time.format :refer [formatter unparse]]))

(defn dfmt [dt]
  (unparse (formatter "yyyy-MM") dt))

(defn github-label [url]
 [:a
  {:href url}
  [:img
   {:style "position: absolute; top: 0; left: 0; border: 0;",
    :src
    "https://s3.amazonaws.com/github/ribbons/forkme_left_gray_6d6d6d.png",
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
   [:link {:href "/img/favicon.ico", :rel "shortcut icon"}]
   [:title (:name cv) " " (:position_sought cv)]
   [:link {:rel "stylesheet", :href "css/bootstrap.min.css"}]
   [:link {:rel "stylesheet", :href "css/cover.css"}]]
  [:body
   (github-label (:github_profile cv))
   [:div.site-wrapper
    [:div.site-wrapper-inner
     [:div.cover-container
      [:div.masthead.clearfix
       [:div.inner
        [:h3.masthead-brand (get-in cv [:basic :name])]
        [:ul.nav.masthead-nav
         [:li [:a {:href "/"} (get-in cv [:basic :phone])]]
         [:li [:a {:href "/"} (get-in cv [:basic :email])]]]
        [:div.inner.cover ;; main content goes here
         [:p.intro (:introduction cv)]
         [:ul.badges (for [[desc url] (:badges cv)]
                       [:li [:a {:href url} desc]])]
         [:ul.experience
          (for [{:keys
                 [position employer location start-date end-date description]}
                (:experience cv)]
            [:li
             [:span.experience-employer employer]
             [:span.experience-position position]
             [:span.experience-date.date-in-range (dfmt start-date)]
             " - "
             [:span.experience-date.date-in-range (dfmt end-date)]
             [:span.experience-desc description]])]
         [:ul.education (for [{:keys [name start-date end-date description]}
                              (:education cv)]
                          [:li
                           [:span.education-title name]
                           [:span.education-date.date-in-range (dfmt start-date)]
                           " - "
                           [:span.education-date.date-in-range (dfmt end-date)]
                           [:span.education-desc description]])]]

        ]]]]]]])
