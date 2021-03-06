(set-env!
  :source-paths #{"src"}
  :resource-paths #{"resources"}
  :dependencies
  '[[hiccup "1.0.5"]
    [perun "0.2.2-SNAPSHOT"]
    ; [hashobject/boot-s3 "0.1.2-SNAPSHOT"]
    [pandeiro/boot-http "0.7.0"]
    [org.martinklepsch/boot-gzip "0.1.2"]
    [org.martinklepsch/boot-garden "1.2.5-8"]
    [camel-snake-kebab "0.3.2"]
    ])

(require '[io.perun :refer :all]
         '[pandeiro.boot-http :refer [serve]]
         ; '[hashobject.boot-s3 :refer :all]
         '[org.martinklepsch.boot-gzip :refer [gzip]]
         '[org.martinklepsch.boot-garden :refer :all]
         )

(task-options!
  pom {:project 'www-static
       :version "0.1.0"}
  ; s3-sync {
  ;          :bucket "www.exiconglobal.com"
  ;          :access-key (System/getenv "AWS_ACCESS_KEY")
  ;          :secret-key (System/getenv "AWS_SECRET_KEY")
  ;          :source "public"
  ;          :options {"Cache-Control" "max-age=315360000, no-transform, public"}}
  )

(deftask build-dev
  "Build blog dev version"
  []
  (comp (global-metadata)
        (base)
        (markdown)
        (garden :styles-var 'homepage.styles/site
                :output-to "public/css/site.css"
                :pretty-print true)
        (collection :renderer 'homepage.index/render :page "index.html")))

(deftask build
  "Build blog prod version."
  []
  (comp (build-dev)
        (gzip :regex [#".html$" #".css$" #".js$"])
        (target)
        ; (s3-sync)
        ; (sync-bucket)
        ))

(deftask dev
  []
  (comp
    (serve :resource-root "public" :port 3105)
    (watch)
    (build-dev)
    ))
