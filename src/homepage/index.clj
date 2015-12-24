(ns homepage.index
  (:use
    [hiccup.core :only (html)]
    [hiccup.page :only (html5 include-css include-js)])
  (:require
    [clojure.string :as s]))

(def intro
  {:header  "The complexity of mobile made easy"
   :sub-header "Mobile Workflow Management (what!)"})

(def overview
  {:fe [{:header "Taking your organization mobile?"
         :link "https://www.exiconglobal.com/appboard"}
        {:header "Want more impact from your apps?"
         :link "https://www.exiconglobal.com/appboard"}
        {:header "Not sure what to build? Or who should build it?"
         :link "https://www.exiconglobal.com/appbuilder"}]
   :header "The AppBoard"
   :le [{:header "Less Hassle"
         :text "Secure, dashboard with tools, analytics +
               resources for your team"
               :link "https://www.exiconglobal.com/appboard"}
        {:header "More Power"
         :text "Business intelligence to make smarter
               decisions and improved ROI"
               :link "https://www.exiconglobal.com/appboard"}
        {:header "Better Apps"
         :text "Be guided through defining an app + get matched with
               3 great development companies"
               :link "https://www.exiconglobal.com/appbuilder"}]})


(def testimonials
  [{:photo "/img/testimonials/richard-sofer.png"
    :logo "/img/testimonials/every-hotels.jpg"
    :name "Richard Sofer"
    :title "Brand CEO, every hotels"
    :testimonial "I give them credit for teaching me everything
                 I know about APIs! It has been a great partnership,
                 they are smart, responsive and the access to apps
                 made us think about our brands very differently
                 in terms of what we could be doing in digital.
                 On top of the work on APIs and APPs they have
                 also been great at 'thought-provoking' with our
                 brand and technology innovation and are ALWAYS
                 and excellent resource for up to date thinking
                 and industry insight."}

   {:photo "/img/testimonials/christopher-david.png"
    :logo "/img/testimonials/schneider-electric.png"
    :name "Christopher David"
    :title "CTO Digital Customer Experience & SVP Software,
           Schneider Electric"
           :testimonial "Managing developers was crucial to our business.
                        Exicon helped us build the foundation on which to
                        drive our new products, bringing new developers
                        into our prefered developer programs in over
                        20 countries which helped us generate a whole
                        suite of local applications for the different
                        markets."}

   {:photo "/img/testimonials/aran-dadswell.png"
    :logo "/img/testimonials/get-to-know-your-brain.png"
    :name "Aran Dadswell"
    :title "Founder of Get to know your Brain"
    :testimonial "Wow, great service - thanks! Thanks a million!
                 Thanks for your support so far - we're
                 getting close now!"}])

(def appboard
  {:header "Command Center for your app(s)"
   :text "Business intelligence and tools to help your team take
         action on your app(s) portfolio"
         :img "/img/landing-page/app-store-analytics.png"
         :cta ""})

(def customers
  {:header "Our Customer portfolio speaks for itself"
   :img "/img/landing-page/customers.png"})

(def footer
  [{:header "Company"
    :items [{:text "About Us"
             :link "https://www.exiconglobal.com/about-us/"}
            {:text "Customers"
             :link "https://www.exiconglobal.com/customers/"}
            {:text "Media & Press"
             :link "https://www.exiconglobal.com/news/"}
            ]}
   {:header "Products"
    :items [{:text "ApiAxle"
             :link "http://apiaxle.com/"}
            {:text "AppBuilder"
             :link "https://www.exiconglobal.com/appbuilder/"}
            {:text "AppBoard"
             :link "https://www.exiconglobal.com/appboard/"}
            ]}
   {:header "Developers"
    :link "https://www.exiconglobal.com/developers/"}
   {:header "Legal"
    :items [{:text "Privacy"
             :link "https://www.exiconglobal.com/privacy-policy/"}
            {:text "Terms & Conditions"
             :link "https://www.exiconglobal.com/terms-of-use/"}]}
   {:header "Follow Us"
    :items [{:image "/img/footer/white-g.png"
             :link "https://plus.google.com/115123733707845359729/posts"}
            {:image "/img/footer/white-fb.png"
             :link "https://www.facebook.com/exicon.mobi"}
            {:image "/img/footer/white-twitter.png"
             :link "https://twitter.com/exicon"}
            {:image "/img/footer/white-linkedin.png"
             :link "http://www.linkedin.com/company/exicon-ltd-"}
            {:image "/img/footer/white-youtube.png"
             :link "https://www.youtube.com/user/Exicon1"}
            {:image "/img/footer/white-weibo.png"
             :link "http://www.weibo.com/u/3147916252"}
            {:image "/img/footer/white-pinterest.png"
             :link "http://www.pinterest.com/exicon/pins/follow/?guid=CqzN7JCYsQQy-0"}]}])

(def top-nav
  [{:text "Calculator"
    :link "https://www.exiconglobal.com/app-idea/#calculate"
    }
   {:text "AppBuilder"
    :link "https://www.exiconglobal.com/appbuilder/"
    }
   {:text "AppBoard"
    :link "https://www.exiconglobal.com/appboard/"
    }
   {:text "Pricing"
    :link "https://www.exiconglobal.com/pricing/"
    }
   {:text "Blog"
    :link "http://blog.exiconglobal.com/"
    }
   {:text "Resources"
    :link "https://www.exiconglobal.com/reports/"
    }
   {:text "About Us"
    :link "https://www.exiconglobal.com/about-us/"
    }])

(defn render [{global-meta :meta posts :entries}]
  (html5
    {:lang "en"}
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0, user-scalable=no"}]
     [:meta {:itemprop "author" :name "author" :content "Exicon (admin@exiconglobal.com)"}]
     [:meta {:name "keywords" :itemprop "keywords"
             :content "Manage Apps, Exicon, App Management, Mobile Relationship Management,
                      What Is Mobile Relationship Management, MRM, AppBoard,
                      Find The Right Developer, Mobile App Strategy, Do I Need Mobile
                      Analytics, Best Tool for Mobile App Analytics, Digital
                      Asset Management"}]
     [:meta {:name "description" :itemprop "description"
             :content "Exicon AppBoard Is An App Management Platform That Helps
                      SMEs & Enterprises Build, Manage & Promote Their Mobile Apps."}]
     [:title "Manage Your Apps | Exicon | Mobile Relationship Management | AppBoard"]
     [:link {:rel "shortcut icon" :href "/img/favicon.ico"}]
     (include-css "/css/site.css")]

    [:body
     [:div#top-nav
      [:img.item {:src "/img/exicon-logo.png"}]
      [:div.item
       (for [item top-nav]
         [:a {:href (:link item)}
          (:text item)])]
      [:div.item
       [:a.button {:href "https://www.exiconglobal.com/pricing/"} "Sign Up"]
       [:a {:href "https://app.exiconglobal.com/"} "Login"]]]

     [:div.main
      [:div#intro
       [:div.container.column.centered
        [:h1 (s/upper-case (:header intro))]
        [:iframe.embed-video {:width "460" :height "215" :frameborder "0"
                              :src "https://www.youtube.com/embed/ajPA6AhUilI"
                              :allowfullscreen true}]
        [:h2 (:sub-header intro)]]]

      [:div#overview
       [:div.container.row
        (for [item (:fe overview)]
          [:div.item (:header item)
           [:br]
           [:a {:href (:link item)}
            "Find out more.."]])]
       [:div.container.divider]
       [:div.container.row.centered
        [:h2 (:header overview)]]
       [:div.container.row
        (for [item (:le overview)]
          [:div.item
           [:h3.centered (:header item)]
           [:div (:text item)]
           [:a {:href (:link item)}
            "Find out more.."]])]]

      [:div#testimonials
       [:div.container.row
        (for [item testimonials]
          [:div.item.segment
           [:img {:src (:photo item)}]
           [:img.right-img {:src (:logo item)}]
           [:div [:b (:name item)]]
           [:div (:title item)]
           [:p (:testimonial item)]
           ])]]

      [:div#appboard
       [:div.container.column.centered
        [:div
         [:h2 (:header appboard)]
         [:h3 (:text appboard)]]
        [:div.container.centered
         [:img.image {:src (:img appboard)}]]
        [:div.container.centered
         [:a.button {:href (:cta appboard)}
          "Get started now"]]]]

      [:div.container.divider]

      [:div#customers
       [:div.container.column.centered
        [:h2 (:header customers)]
        [:div.container.centered
         [:img.image {:src (:img customers)}]]]]

      [:div#footer
       [:div.container.row
        (for [elem footer]
          [:div.item
           [:div [:b (:header elem)]]
           (for [item (:items elem)]
             (if (:image item)
               [:a {:href (:link item)
                    :target "_blank"}
                [:img {:src (:image item)}]]
               [:div
                [:a {:href (:link item)}
                 (:text item)]]))])]]] ]))

