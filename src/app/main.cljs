(ns app.main
  "The main Reagent app."
  (:require [reagent.core :as r]))

(defn header
  "The site header."
  []
  [:header "RPM header"])

(defn footer
  "The site footer."
  []
  [:footer "RPM footer"])

(defn app
  "The main Reagent app."
  []
  [:<>
   [header]
   [:div "RPM app"]
   [footer]])
