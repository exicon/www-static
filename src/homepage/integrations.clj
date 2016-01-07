(ns homepage.integrations)

(defn hubspot-analytics []
  [:script {:type "text/javascript"}
   "(function(d,s,i,r) {
   if (d.getElementById(i)){return;}
   var n=d.createElement(s),e=d.getElementsByTagName(s)[0];
   n.id=i;n.src='//js.hs-analytics.net/analytics/'+
   (Math.ceil(new Date()/r)*r)+'/511335.js';
   e.parentNode.insertBefore(n, e);
   })(document,'script','hs-analytics',300000);"])

(defn google-analytics []
  [:script {:type "text/javascript"}
     "(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
     (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
     m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
     })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

     ga('create', 'UA-31491340-1', 'auto');
     ga('require', 'displayfeatures');
     ga('send', 'pageview');
     ga('require', 'displayfeatures');"])
