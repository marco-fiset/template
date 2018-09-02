(ns error.404
  (:require [coast :refer [css js not-found]]))

(defn view [request]
  (not-found
    [:html
     [:head
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
      [:link {:href "/css/app.css" :type "text/css" :rel "stylesheet"}]
      (css "bundle.css")
      (js "bundle.js")]
     [:body
      "Cound't find what you were looking for"]]))
