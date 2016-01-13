(ns homepage.styles
    (:require
      [garden.def :refer [defstyles]]
      [garden.units :refer [px percent s em vmax vh vw]]
      [garden.color :as color :refer [rgb as-hex]]
      [garden.stylesheet :refer [at-media]]))

(def large-screen {:min-width (px 1200)})
(def big-screen {:min-width (px 720)
                 :max-width (px 1200)})
(def medium-screen {:min-width (px 480)
                    :max-width (px 720)})
(def small-screen {:max-width (px 480)})

(def teal (rgb [89 210 217]))
(def grey (as-hex "#eee"))
(def dark-grey (as-hex "#808080"))

(def centered {:justify-content "center"
               :align-items     "center"})


(def top-space (px 68))

(defstyles base
           [:section
            {:margin "1em auto"}]
           [:#top-nav
            {:position        "fixed"
             :background      "white"
             :width           (percent 100)
             :height          top-space
             :display         "flex"
             :align-items     "center"
             :justify-content "space-around"
             :box-shadow      "0 1px 2px 0 rgba(34,36,38,.15)"}
            [:a {:margin    "0 1em"
                 :color     "black"
                 :font-size (em 0.8)}]
            [:img {:width (px 110)}]
            [:.item {:flex-shrink 1}]]

           [:.main
            {:padding-top top-space}]
           [:body
            {:margin      "0"
             :font-family "Helvetica-Neue, Helvetica, sans-serif"
             :font-size   (px 16)
             :overflow-x  "hidden"}]
           [:h2 {:font-weight "400"}]
           [:#overview [:h3 {:font-weight "400"}]]
           [:#appboard
            [:.header [:h2 {:font-weight "800"}]
             [:h3 {:font-weight "400"}]]
            [:.button {:max-width (px 200)
                       :margin    "0 auto"}]]
           [:a {:text-decoration "none"
                :color           teal
                :font-size       (em 0.8)}]
           [:.container
            {:display         #{"-webkit-box" "-moz-box" "-ms-flexbox" "-webkit-flex" "flex"}
             :justify-content "space-between"
             :margin          "0 auto"}
            [:.item
             {:margin    "1em 0.5em"
              :flex-grow 1}]
            [:.basis-item
             {:margin     "1em 0.5em"
              :flex-basis 1
              :flex-grow  1}]]
           [:.column
            {:flex-flow "column wrap"}]
           [:.row
            {:flex-flow "row wrap"}]
           [:.play-btn {:width  (px 45)
                        :margin "0 auto"}]
           [:.centered
            {:justify-content "center"
             :align-items     "center"
             :text-align      "center"}]
           [:.vert-centered {:align-items "center"}]
           [:.hor-centered {:justify-content "center"}]

           [:#intro {:display               "flex"
                     :background            "url('/img/landing-page/header.jpg') center no-repeat"
                     :background-position-y 0
                     :background-size       (vmax 280)
                     :padding-bottom        (em 0.5)}
            [:.embed-video
             {:width     (vmax 7)
              :height    (px 111)
              :min-width (px 200)}]
            [:h1 :h2 {:color "white"}]]

           [:.right-img
            {:vertical-align "top"
             :float          "right"}]
           [:.segment
            {:background    "white"
             :padding       (em 1)
             :border-radius (em 0.3)
             :border        "1px solid rgba(34,36,38,.15)"}]

           [:#testimonials
            {:background  grey
             :font-size   (em 0.8)
             :line-height (em 1.4)}]
           [:img.image
            {:width     (vw 90)
             :max-width (px 900)
             }]
           [:#appboard
            [:.image {:width      (percent 100)
                      :box-shadow "0px 2px 2px 0px rgba(34, 36, 38, 0.25)"}]]
           [:.top-nav-button
            {:background    teal
             :color         "white !important"
             :cursor        "pointer"
             :padding       "0.7em 1em"
             :border-radius (em 0.3)
             :font-size     (em 1.1)}]
           [:.button
            {:background    teal
             :color         "white !important"
             :cursor        "pointer"
             :padding       "0.7em 1em"
             :border-radius (em 0.3)
             :font-size     (em 1)
             :display       "block"
             :text-align    "center"}]
           [:.bordered
            {:border-radius (em 0.3)
             :border        "solid 1px rgba(34,36,38,.15)"}]

           [:#footer
            {:background     dark-grey
             :color          "white"
             :padding-bottom (em 2)}
            [:a {:color "white"}]
            [:.container
             {:margin-bottom 0}]]
           [:.divider
            {:border-top    "1px dotted rgba(34,36,38,.15)"
             :border-bottom "1px dotted rgba(255,255,255,.1)"}]
           [:.container.row.item
            {:width  (percent 100)
             :margin "0em auto 1em auto"}]

           (at-media large-screen [[:body {:font-size (px 19)}]
                                   [:.container {:width (percent 80)}]
                                   [:#intro {:background-size (percent 100)
                                             :min-height      (vmax 30)
                                             :font-size       (vmax 1.5)}]
                                   [:.container
                                    [:.item {:flex-grow  1
                                             :flex-basis 0}]]

                                   [:.appboard-item {:flex-basis 1}]
                                   [:.basis-item {:flex-basis 0
                                                  :flex-grow  1}]
                                   [:#intro [:.embed-video
                                             {:width  (px 400)
                                              :height (px 224)}]]
                                   [:#appboard
                                    [:.button {:margin "0 0.5em 0 -0.5em"}]]])

           (at-media big-screen [[:body {:font-size (px 16)}]
                                 [:#intro {:background-size (percent 100)
                                           :min-height      (vmax 30)
                                           :font-size       (vmax 1.5)}]
                                 [:.container
                                  [:.item {:flex-grow  1
                                           :flex-basis 0}]]
                                 [:.appboard-item
                                  {:flex-basis 0
                                   :flex-grow  1
                                   :margin     "0em 0.5em"}]])
           (at-media medium-screen [[:#top-nav [:a {:font-size (vw 1.5)}]]
                                    [:.appboard-item
                                     {:flex-basis 1
                                      :flex-grow  1
                                      :margin     "0em 0.5em"}]])
           (at-media small-screen [[:.appboard-item
                                    {:flex-basis 1
                                     :flex-grow  1
                                     :margin     "0em 0.5em"}]]))

