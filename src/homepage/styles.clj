(ns homepage.styles
  (:require
    [garden.def :refer [defstyles]]
    [garden.units :refer [px percent s em vmax vh vw]]
    [garden.color :as color :refer [rgb as-hex]]
    [garden.stylesheet :refer [at-media]]))

(def mediaqueries
  {{:min-width (px 720)} [[:body {:font-size (px 18)}]
                          [:.container {:width (percent 80)}]
                          [:#intro {:background-size (percent 100)
                                    :min-height (vmax 30)
                                    :font-size (vmax 1.5)}]
                          [:.item {:flex-grow 1
                                   :flex-basis 0}]]
   {:min-width (px 480)
    :max-width (px 720)} []

   {:max-width (px 480)} []})

(def teal (rgb [89 210 217]))
(def grey (as-hex "#eee"))
(def dark-grey (as-hex "#808080"))

(def centered {:justify-content "center"
               :align-items "center"
               :text-align "center"})

; (def segment
;   { :background #FFF;
;     :padding (em 1)
;     :border-radius (em .28571429)
;     :border "1px solid rgba(34,36,38,.15)"
;    })

; (def container
;   {:display
;     #{"-webkit-box""-moz-box""-ms-flexbox"
;       "-webkit-flex""flex"}
;     :justify-content "space-between"
;     :padding (em 0.5)
;     :margin "0 auto"})

; (def row {:flex-flow "row wrap"})
; (def column {:flex-flow "column wrap"})

(defstyles base
  [:body
   {:margin "0"
    :font-family "Helvetica-Neue, Helvetica, sans-serif"
    :font-size (px 16)
    :overflow-x "hidden"}]
  [:h2 {:font-weight "400"}]
  [:a {:text-decoration "none"
       :color teal
       :font-size (em 0.8)}]
  [:.container
   {:display
    #{"-webkit-box""-moz-box""-ms-flexbox"
      "-webkit-flex""flex"}
    :justify-content "space-between"
    :padding (em 0.5)
    :margin "0 auto"}
   [:.item
    {:padding (em 1)
     :margin (em 0.5)
     :flex-grow 1}]]
  [:.column
   {:flex-flow "column wrap"}]
  [:.row
   {:flex-flow "row wrap"}]
  [:.play-btn {:width (px 45)
               :margin "0 auto"}]
  [:.centered
   {:justify-content "center"
    :align-items "center"
    :text-align "center"}]
  [:#intro {:display "flex"
            :background
            "url('/img/landing-page/header.jpg') center no-repeat"
            :background-position-y 0
            :background-size (vmax 280)}
   [:.embed-video
    {:width (vmax 7)
     :height (px 111)
     :min-width (px 200)}]]
  [:.right-img
   {:vertical-align "top"
    :float "right"}]
  [:.segment
   {:background "white"
    :padding (em 1)
    :border-radius (em 0.3)
    :border "1px solid rgba(34,36,38,.15)"}]
  [:#testimonials
   {:background grey}]
  [:img.image
   {:width (vw 90)
    :max-width (px 900)}]
  [:.button
   {:background teal
    :color "white"
    :padding "0.7em 1em"
    :border-radius (em 0.3)
    :font-size (em 1.1)}
   [:.bordered
    {:border-radius (em 0.3)
     :border "1px solid rgba(34,36,38,.15)"}]]
  [:#footer
   {:background dark-grey
    :color "white"}
   [:a {:color "white"}]]
  [:.divider
   {:border-top "1px solid rgba(34,36,38,.15)"
    :border-bottom "1px solid rgba(255,255,255,.1)"}]

  (map (fn [[query rule]] (at-media query rule)) mediaqueries)

  )


