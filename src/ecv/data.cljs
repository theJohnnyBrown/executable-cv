(ns ecv.data
  (:require [cljs-time.core :refer [date-time]]
            [clojure.string :as str]))

(def basic {:name "Johnny Brown" :email "hire@thejohnnybrown.com"
           :phone "504 265 4698"
           :github_profile "https://github.com/thejohnnybrown"})

(def edu
  [{:name "University of New Orleans"
    :start-date (date-time 2009 6) :end-date (date-time 2012 5)
    :description (str "BS in Mathematics, with concentration in Computer"
                      " Science")}
   {:name "Tulane University"
    :start-date (date-time 2006 8) :end-date (date-time 2007 12)}])

(def cvdata
  {:basic basic
   :badges [["Found a compiler bug"
             "http://dev.clojure.org/jira/browse/CLJS-581"]
            ["Contributed to pandas"
             "https://github.com/pydata/pandas/commit/6c7ec42cd3015b1cf547a01a5c664db3e3abf42b"]
            ["Invented structured format for CVs" "https://github.com/theJohnnyBrown/executable-cv"]
            ["Collaborated on a library" "https://github.com/theJohnnyBrown/endophile"]
            ["Wrote a tutorial" "http://www.thejohnnybrown.com/integrating-linkedin-oauth-with-an-existing-django-app/"]]
   :introduction "Hi. I've made my living making software for people (or sometimes for myself) since 2011. You'll find most of the relevant details in this document, but the gist is that I examine the users' needs to understand how their problems can be solved by software. Solutions implemented so far have involved a variety of languages, with deliverables ranging from web applications, scientific visualizations, developer tools, tutorials, and predictive algorithms."
   :education edu
   :experience [{:position "CTO"
                 :employer "Anabolic Technology"
                 :location "anabolictechnology.com"
                 :start-date (date-time 2013 1) :end-date (date-time 2014 1)
                 :description
                 "Anabolic Technology was a partnership between this candidate and a domain expert to design and sell an information product in the fitness space. I designed a service-oriented architecture with several machines, codebases, and APIs. As our product-focused company spiraled into a consulting firm, I built several webapps using Python, Clojure, Javascript, and PostgreSQL."}
                {:position "Software Engineer"
                 :employer "Counsyl"
                 :location "San Francisco, CA"
                 :start-date (date-time 2012 5) :end-date (date-time 2012 12)
                 :description
                 "This position involved gathering business requirements and implementing features for statistical process control. The software team  uses numpy, scipy, pandas, coffeescript, and d3.js to make tools for scientists. I orchestrated integration projects to speed up turnaround time for patient tests, and optimized SQL queries to increase efficiency of other employees."}

                {:position "Bioinformatics Programmer"
                 :employer "University of New Orleans"
                 :location "New Orleans, LA"
                 :start-date (date-time 2011 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "As the maintainer of a statistics and visualization tool for microbial ecology, I communicated with users to assess needs and determine direction of the project. Responsible for the operation of an entire webapp stack, from operating system updates to user interface design, I led the selection and adoption of a bug-tracking system to satisfy stakeholders. During this time we moved the application's architecture from ad-hoc function calls over HTTP toward a RESTful API and AJAX client. Python Django numpy scipy matplotlib")}
                {:position "Software Developer"
                 :employer "Consulting"
                 :location "New Orleans, LA"
                 :start-date (date-time 2010 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "I used many different technologies here, building custom"

                  " webapps using Ruby on Rails, PHP, and Django. I also maintained a legacy accounting and reporting system in Java.")}
                ]})


(def django-emph
  {:basic basic
   :badges [["Wrote a tutorial" "http://www.thejohnnybrown.com/integrating-linkedin-oauth-with-an-existing-django-app/"]
            ["Contributed to pandas"
             "https://github.com/pydata/pandas/commit/6c7ec42cd3015b1cf547a01a5c664db3e3abf42b"]
            ["Implemented a stats paper" "https://github.com/theJohnnyBrown/permanova"]
            ["Found a compiler bug"
             "http://dev.clojure.org/jira/browse/CLJS-581"]
            ["Invented structured format for CVs" "https://github.com/theJohnnyBrown/executable-cv"]
            ["Authored a library" "https://github.com/theJohnnyBrown/endophile"]
            ]
   :introduction "Hi. I've made my living making software for people (or sometimes for myself) since 2011. You'll find most of the relevant details in this document, but the gist is that I examine the users' needs to understand how their problems can be solved by software. Solutions implemented so far have involved a variety of languages, with deliverables ranging from web applications, scientific visualizations, developer tools, tutorials, and predictive algorithms."
   :education edu
   :experience [{:position "CTO"
                 :employer "Anabolic Technology"
                 :location "anabolictechnology.com"
                 :start-date (date-time 2013 1) :end-date (date-time 2014 1)
                 :description
                 "Anabolic Technology was a partnership between this candidate and a domain expert to design and sell an information product in the fitness space. I designed a service-oriented architecture with several machines, codebases, and APIs. As our product-focused company grew into a consulting firm, I built several webapps using Django, Javascript, and PostgreSQL."}
                {:position "Software Engineer"
                 :employer "Counsyl"
                 :location "San Francisco, CA"
                 :start-date (date-time 2012 5) :end-date (date-time 2012 12)
                 :description
                 "This position involved gathering business requirements and implementing features for statistical process control. The software team  uses django numpy, scipy, pandas, coffeescript, and d3.js to make tools for scientists. I orchestrated integration projects to speed up turnaround time for patient tests, and optimized SQL queries to increase efficiency of other employees."}

                {:position "Bioinformatics Programmer"
                 :employer "University of New Orleans"
                 :location "New Orleans, LA"
                 :start-date (date-time 2011 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "As the maintainer of a statistics and visualization tool for microbial ecology, I communicated with users to assess needs and determine direction of the project. Responsible for the operation of an entire webapp stack, from operating system updates to user interface design, I led the selection and adoption of a bug-tracking system to satisfy stakeholders. During this time we moved the application's architecture from ad-hoc function calls over HTTP toward a RESTful API and AJAX client. Python Django numpy scipy matplotlib")}
                {:position "Software Developer"
                 :employer "Consulting"
                 :location "New Orleans, LA"
                 :start-date (date-time 2010 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "I used many different technologies here, building custom"

                  " webapps using Ruby on Rails, PHP, and Django. I also maintained a legacy accounting and reporting system in Java.")}
                ]})


(def bio-emph
  {:basic basic
   :badges [["Contributed to pandas"
             "https://github.com/pydata/pandas/commit/6c7ec42cd3015b1cf547a01a5c664db3e3abf42b"]
            ["Found a compiler bug"
             "http://dev.clojure.org/jira/browse/CLJS-581"]
            ["Invented structured format for CVs" "https://github.com/theJohnnyBrown/executable-cv"]
            ["Collaborated on a library" "https://github.com/theJohnnyBrown/endophile"]
            ["Wrote a tutorial" "http://www.thejohnnybrown.com/integrating-linkedin-oauth-with-an-existing-django-app/"]
            ["Implemented a stats paper" "https://github.com/theJohnnyBrown/permanova"]]
   :introduction "Hi. I've made my living making software for people (or sometimes for myself) since 2011. You'll find most of the relevant details in this document, but the gist is that I examine the users' needs to understand how their problems can be solved by software. Solutions implemented so far have been clustered around modern software, analytics, and web development tools, with particular focus on their application in the biotech sector."
   :education edu
   :experience [{:position "CTO"
                 :employer "Anabolic Technology"
                 :location "anabolictechnology.com"
                 :start-date (date-time 2013 1) :end-date (date-time 2014 1)
                 :description
                 "Anabolic Technology was a partnership with a domain expert to design and sell an information product in the fitness space. I designed a service-oriented architecture with several machines, codebases, and APIs. Later the company pivoted into a consulting firm, specializing in predictive statistics."}
                {:position "Software Engineer"
                 :employer "Counsyl"
                 :location "San Francisco, CA"
                 :start-date (date-time 2012 5) :end-date (date-time 2012 12)
                 :description
                 "This position involved gathering business requirements and implementing features for in-house users. The software team  used numpy, scipy, pandas, coffeescript, and d3.js to make tools for scientists. I orchestrated integration projects to speed up turnaround time for patient tests, and optimized SQL queries to increase efficiency of other employees."}

                {:position "Bioinformatics Programmer"
                 :employer "University of New Orleans"
                 :location "New Orleans, LA"
                 :start-date (date-time 2011 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "As the maintainer of a statistics and visualization tool for microbial ecology, I communicated with users to assess needs and determine direction of the project. Responsible for the operation of an entire webapp stack, from operating system updates to user interface design, I led the selection and adoption of a bug-tracking system to satisfy stakeholders. During this time we moved the application's architecture from ad-hoc function calls over HTTP toward a RESTful API and AJAX client. Python Django numpy scipy matplotlib")}
                {:position "Software Developer"
                 :employer "Consulting"
                 :location "New Orleans, LA"
                 :start-date (date-time 2010 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "I used many different technologies here, building custom webapps using Ruby on Rails, PHP, and Django. I also maintained a legacy accounting and reporting system in Java.")}
                ]})


(def clojure-emph
  {:basic basic
   :badges [["Found a compiler bug"
             "http://dev.clojure.org/jira/browse/CLJS-581"]
            ["Contributed to pandas"
             "https://github.com/pydata/pandas/commit/6c7ec42cd3015b1cf547a01a5c664db3e3abf42b"]
            ["Collaborated on a library" "https://github.com/theJohnnyBrown/endophile"]
            ["Invented structured format for CVs" "https://github.com/theJohnnyBrown/executable-cv"]
            ["Wrote a tutorial" "http://www.thejohnnybrown.com/integrating-linkedin-oauth-with-an-existing-django-app/"]
            ["Implemented a stats paper" "https://github.com/theJohnnyBrown/permanova"]]
   :introduction "Hi. I've made my living making software for people (or sometimes for myself) since 2011. You'll find most of the relevant details in this document, but the gist is that I examine the users' needs to understand how their problems can be solved by software. Solutions implemented so far have been clustered around modern software, analytics, and web development tools, with a recent focus on emerging clojure[script] technologies."
   :education edu
   :experience [{:position "CTO"
                 :employer "Anabolic Technology"
                 :location "anabolictechnology.com"
                 :start-date (date-time 2013 1) :end-date (date-time 2014 1)
                 :description
                 "In this cofounding role, I took a nutrition product from concept to revenue in a little over three months. It was implemented as a webapp using postgres, enlive, and bit of hiccup. I designed a service-oriented architecture with several machines, codebases, and APIs. As our product-focused company grew into a consulting firm, I built several webapps using Python, Clojure, Javascript, and PostgreSQL."}
                {:position "Software Engineer"
                 :employer "Counsyl"
                 :location "San Francisco, CA"
                 :start-date (date-time 2012 5) :end-date (date-time 2012 12)
                 :description
                 "This position involved gathering business requirements and implementing features for in-house users. The software team  used numpy, scipy, pandas, coffeescript, and d3.js to make tools for scientists. I orchestrated integration projects to speed up turnaround time for patient tests, and optimized SQL queries to increase efficiency of other employees."}
                {:position "Bioinformatics Programmer"
                 :employer "University of New Orleans"
                 :location "New Orleans, LA"
                 :start-date (date-time 2011 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "As the maintainer of a statistics and visualization tool for microbial ecology, I communicated with users to assess needs and determine direction of the project. Responsible for the operation of an entire webapp stack, from operating system updates to user interface design, I led the selection and adoption of a bug-tracking system to satisfy stakeholders. During this time we moved the application's architecture from ad-hoc function calls over HTTP toward a RESTful API and AJAX client. Python Django numpy scipy matplotlib")}
                {:position "Software Developer"
                 :employer "Consulting"
                 :location "New Orleans, LA"
                 :start-date (date-time 2010 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "I used many different technologies here, building custom webapps using Ruby on Rails, PHP, and Django. I also maintained a legacy accounting and reporting system in Java.")}
                ]})

(def stats-leadership-emph
  {:basic basic
   :badges [["Contributed to pandas"
             "https://github.com/pydata/pandas/commit/6c7ec42cd3015b1cf547a01a5c664db3e3abf42b"]
            ["Found a compiler bug"
             "http://dev.clojure.org/jira/browse/CLJS-581"]
            ["Invented structured format for CVs" "https://github.com/theJohnnyBrown/executable-cv"]
            ["Collaborated on a library" "https://github.com/theJohnnyBrown/endophile"]
            ["Wrote a tutorial" "http://www.thejohnnybrown.com/integrating-linkedin-oauth-with-an-existing-django-app/"]
            ["Implemented a stats paper" "https://github.com/theJohnnyBrown/permanova"]]
   :introduction "Hi. I've made my living making software for people (or sometimes for myself) since 2011. You'll find most of the relevant details in this document, but the gist is that I examine the users' needs to understand how their problems can be solved by software. Solutions implemented so far have been clustered around modern software, analytics, and web development tools, with particular focus on their application in the biotech sector."
   :education edu
   :experience [{:position "CTO"
                 :employer "Anabolic Technology"
                 :location "anabolictechnology.com"
                 :start-date (date-time 2013 1) :end-date (date-time 2014 1)
                 :description
                 "Anabolic Technology was a partnership between this candidate and a domain expert to design and sell an information product in the fitness space. I designed a service-oriented architecture with several machines, codebases, and APIs. Later the company pivoted into a consulting firm, specializing in predictive statistics."}
                {:position "Software Engineer"
                 :employer "Counsyl"
                 :location "San Francisco, CA"
                 :start-date (date-time 2012 5) :end-date (date-time 2012 12)
                 :description
                 "This position involved gathering business requirements and implementing features for in-house users. The software team  used numpy, scipy, pandas, coffeescript, and d3.js to make tools for scientists. I orchestrated integration projects to speed up turnaround time for patient tests, and optimized SQL queries to increase efficiency of other employees."}

                {:position "Bioinformatics Programmer"
                 :employer "University of New Orleans"
                 :location "New Orleans, LA"
                 :start-date (date-time 2011 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "As the maintainer of a statistics and visualization tool for microbial ecology, I communicated with users to assess needs and determine direction of the project. Responsible for the operation of an entire webapp stack, from operating system updates to user interface design, I led the selection and adoption of a bug-tracking system to satisfy stakeholders. During this time we moved the application's architecture from ad-hoc function calls over HTTP toward a RESTful API and AJAX client. Technology statck consisted of Python, Django, numpy, scipy, matplotlib and related tools")}
                {:position "Software Developer"
                 :employer "Consulting"
                 :location "New Orleans, LA"
                 :start-date (date-time 2010 1) :end-date (date-time 2012 5)
                 :description
                 (str
                  "I used many different technologies here, building custom webapps using Ruby on Rails, PHP, and Django. I also maintained a legacy accounting and reporting system in Java.")}
                ]})
