(ns selfhosted-cljs-example.core
  (:import [goog.events EventType])
  (:require [cljs.js :as cljsjs]
            [goog.dom :as dom]
            [goog.events :as events]))

(def state (cljsjs/empty-state))

(defn hello
  []
  (cljsjs/eval-str state
                   (.-innerHTML (dom/getElement "example"))
                   "example"
                   {:eval cljsjs/js-eval}
                   identity))

(events/listen (dom/getElement "hello") EventType.CLICK hello)
