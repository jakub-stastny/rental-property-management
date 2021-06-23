(ns app.main "The main Reagent app.")

(defn header
  "The site header."
  []
  (let [style {
               :padding 10
               :background-color "aliceblue"
               :text-align "center"
               }]
    [:header {:style style}
     [:h1 "RPM header"]]))

(defn footer
  "The site footer."
  []
  (let [style {
               :padding 10
               :background-color "lavender"
               :text-align "center"
               }]
    [:footer {:style style} "RPM footer"]))

(defn text-field
  ""
  [label]
  [:label
   [:div label]
   [:input]])

(defn log-in
  "..."
  []
  [:<>
   [:h1 "Please log in"]
   [:form
    [text-field "Your e-mail"]
    [text-field "Your password"]]])

(defn router-app
  "The router app."
  []
  [log-in])

;; (assoc {} :key "value")
(defn app
  "The main Reagent app."
  []
  (let [style {
               :background-color "lightyellow"
               :padding 20
               :padding-top 35
               :padding-bottom 50
               }]
  [:<>
   [header]
   [:div {:style style} [router-app]]
   [footer]]))
