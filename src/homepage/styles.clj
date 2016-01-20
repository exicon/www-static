(ns homepage.styles
    (:require
      [garden.def :refer [defstyles]]
      [garden.units :refer [px percent s em vmax vh vw]]
      [garden.color :as color :refer [rgb as-hex]]
      [garden.stylesheet :refer [at-media]]))

(def large-screen {:min-width (px 1200)})
(def big-screen {:min-width (px 800)
                 :max-width (px 1200)})
(def medium-screen {:min-width (px 480)
                    :max-width (px 800)})
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
             :box-shadow      "0 1px 2px 0 rgba(34,36,38,.15)"
             :z-index         10}
            [:a {:margin    "0 1em"
                 :color     "black"
                 :font-size (em 0.8)}]
            [:img {:width (px 110)}]
            [:.item {:flex-shrink 1}]]
           [:#mobile-nav :.mobile-nav
            {:display "none"}]
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
                       :margin    "0 auto"}]
            [:.image {:width      (percent 100)}]]
           [:a {:text-decoration "none"
                :color           teal
                :font-size       (em 0.8)}]
           [:.container
            {:display         #{"-webkit-box" "-moz-box" "-ms-flexbox" "-webkit-flex" "flex"}
             :justify-content "space-between"
             :margin          "0 auto"}
            [:.item
             {:margin    "1em"
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
           [:.hor-centered {:justify-content "center"
                            :text-align      "center"}]

           [:#intro {:display               "flex"
                     :background            "url('/img/landing-page/header.jpg') center no-repeat"
                     :background-position-y 0
                     :background-size       (vmax 280)
                     :padding-bottom        (em 0.5)}
            [:.embed-video
             {:width     (vmax 7)
              :height    (px 111)
              :min-width (px 310)
              :min-height (px 174)}]
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
             :max-width (px 900)}]
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
             :font-size     (em 0.85)
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
             :margin "0em auto 1em auto"}])

(defstyles mobile-nav
           [[:.navigation
             {
              :padding    0
              :list-style "none"
              :background "#111"
              :width      (percent 100)
              :height     (percent 100)
              :position   "fixed"
              :top        (px 50)
              :right      0
              :bottom     0
              :left       0
              :z-index    0
              :color      "white"
              :overflow-y "scroll"
              }
             [:li {:padding "0.5em 0"}
              [:&:hover {:background " rgba (100, 100, 100, 0.3)"}]
              [:a
               {:color         "rgba(255, 255, 255, 0.5)"
                :font-size    (em 1.1)
                :padding-left (em 3)
                :font-weight  800}]]]
            [:.site-wrap
             {:min-width        (percent 100)
              :min-height       (percent 100)
              :background-color "#fff"
              :position         "relative"
              :top              0
              :bottom           (percent 100)
              :left             0
              :z-index          1
              :padding-top      (px 68)
              }]
            [:.nav-trigger
             {:position "absolute"
              :clip     "rect (0, 0, 0, 0)"}]
            [:.mobile-top-bar
             {:background-color "white"
              :position         "fixed"
              :top              0
              :left             0
              :width            (percent 100)
              :height           (px 68)
              :z-index          3}]
            [:.mobile-logo {:position "fixed"
                            :z-index  4
                            :right    (em 1)
                            :top      (px 18)
                            :display  "none"
                            :width    (px 120)}]
            ["label[for='nav-trigger']"
             {
              :position         "fixed"
              :top              (px 18)
              :left             (px 15)
              :z-index          4
              :width            (px 30)
              :height           (px 30)
              :cursor           "pointer"
              :background-image "url('/img/mobile-nav-icon.png')"
              :background-size  "contain"
              }]
            [".nav-trigger:checked ~ .site-wrap"
             {:left (px 235)}]
            [".nav-trigger + label, .site-wrap"
             {:transition " left 0.2s ease"}]])


(defstyles media-queries

           (at-media large-screen [[:body {:font-size (px 19)}]
                                   [:#overview
                                    [:.item {:margin "0.5em 2.2em"}]]
                                   [:.container {:width (percent 80)}]
                                   [:#intro {:background-size (percent 100)
                                             :min-height      (vmax 30)
                                             :font-size       (vmax 1.5)}
                                    [:.embed-video
                                     {:width  (px 450)
                                      :height (px 253)}]]
                                   [:.container
                                    [:.item {:flex-grow  1
                                             :flex-basis 0}]]

                                   [:.appboard-item {:flex-basis 1
                                                     :margin "0 0.5em"}]
                                   [:.basis-item {:flex-basis 0
                                                  :flex-grow  1}]
                                   [:#appboard
                                    [:.button {:margin "0 0.5em 0 -0.5em"}]
                                    [:.overview.row {:text-align      "left"
                                                     :justify-content "left"}]
                                    ["div.cta.row .item:first-child" "div.cta.row .item:last-child" {:display "none"}]]
                                   ])

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
                                   :margin     "0em 1em"}]
                                 [:#appboard
                                  [:.overview.row {:text-align "center"
                                                   :justify-content "center"}]]])
           (at-media medium-screen [[:#mobile-nav :.mobile-nav
                                     {:display "block"}]
                                    [:#top-nav {:display "none"}]
                                    [:#top-nav [:a {:font-size (vw 1.5)}]]
                                    [:.appboard-item
                                     {:flex-basis 1
                                      :flex-grow  1
                                      :margin     "0em 1em"}]
                                    [:.mobile-logo {:display "block"}]
                                    [:#appboard
                                     [:.overview.row {:text-align "center"
                                                      :justify-content "center"}]]])
           (at-media small-screen [[:.mobile-logo {:display "block"}]
                                   [:#mobile-nav :.mobile-nav
                                    {:display "block"}]
                                   [:#top-nav {:display "none"}]
                                   [:.appboard-item
                                    {:flex-basis 1
                                     :flex-grow  1
                                     :margin     "0em 1em"}]
                                   [:#appboard
                                    [:.overview.row {:text-align "center"
                                                     :justify-content "center"}]]]))

(defstyles site
           base
           mobile-nav
           media-queries)