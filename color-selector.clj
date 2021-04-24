(defn zero-100 []
    "choose random 0-100 number"
    (rand-int 101))

(defn zero-255 []
    "choose random number 0-255"
    (rand-int 256))

(defn wreckfest-color-scheme []
    "generate random values that correspond to wreckfest color values i.e. (0-100, 0-255, 0-255)"
    (list (zero-100) (zero-255) (zero-255)))

(defn euro-truck-color-scheme []
    "generate random values that correspond to euro truck color values i.e. (0-255, 0-255, 0-255)"
    (list (zero-255) (zero-255) (zero-255)))

;odds of any one color are ~1:16,000,000
;   the difference between colors is so small that really should dilute the possible combinations by 10 or 20
;   i.e. make it so that the combinations are VISUALLY distinct instead of just NUMERICALLY distinct