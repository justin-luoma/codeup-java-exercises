public class ServerNameGenerator {

    private static String[] adjectives = {"abandoned", "able", "absolute",
            "adorable",
            "adventurous", "academic", "acceptable", "acclaimed",
            "accomplished", "accurate", "aching", "acidic", "acrobatic",
            "active", "actual", "adept", "admirable", "admired", "adolescent"
            , "adorable", "adored", "advanced", "afraid", "affectionate",
            "aged", "aggravating", "aggressive", "agile", "agitated",
            "agonizing", "agreeable", "ajar", "alarmed", "alarming", "alert",
            "alienated", "alive", "all", "altruistic", "amazing", "ambitious"
            , "ample", "amused", "amusing", "anchored", "ancient", "angelic",
            "angry", "anguished", "animated", "annual", "another", "antique",
            "anxious", "any", "apprehensive", "appropriate", "apt", "arctic",
            "arid", "aromatic", "artistic", "ashamed", "assured",
            "astonishing", "athletic", "attached", "attentive", "attractive",
            "austere", "authentic", "authorized", "automatic", "avaricious",
            "average", "aware", "awesome", "awful", "awkward", "babyish",
            "bad", "back", "baggy", "bare", "barren", "basic", "beautiful",
            "belated", "beloved", "beneficial", "better", "best", "bewitched"
            , "big", "big-hearted", "biodegradable", "bite-sized", "bitter",
            "black", "black-and-white", "bland", "blank", "blaring", "bleak",
            "blind", "blissful", "blond", "blue", "blushing", "bogus",
            "boiling", "bold", "bony", "boring", "bossy", "both", "bouncy",
            "bountiful", "bowed", "brave", "breakable", "brief", "bright",
            "brilliant", "brisk", "broken", "bronze", "brown", "bruised",
            "bubbly", "bulky", "bumpy", "buoyant", "burdensome", "burly",
            "bustling", "busy", "buttery", "buzzing", "calculating", "calm",
            "candid", "canine", "capital", "carefree", "careful", "careless",
            "caring", "cautious", "cavernous", "celebrated", "charming",
            "cheap", "cheerful", "cheery", "chief", "chilly", "chubby",
            "circular", "classic", "clean", "clear", "clear-cut", "clever",
            "close", "closed", "cloudy", "clueless", "clumsy", "cluttered",
            "coarse", "cold", "colorful", "colorless", "colossal",
            "comfortable", "common", "compassionate", "competent", "complete"
            , "complex", "complicated", "composed", "concerned", "concrete",
            "confused", "conscious", "considerate", "constant", "content",
            "conventional", "cooked", "cool", "cooperative", "coordinated",
            "corny", "corrupt", "costly", "courageous", "courteous", "crafty"
            , "crazy", "creamy", "creative", "creepy", "criminal", "crisp",
            "critical", "crooked", "crowded", "cruel", "crushing", "cuddly",
            "cultivated", "cultured", "cumbersome", "curly", "curvy", "cute",
            "cylindrical", "damaged", "damp", "dangerous", "dapper", "daring"
            , "darling", "dark", "dazzling", "dead", "deadly", "deafening",
            "dear", "dearest", "decent", "decimal", "decisive", "deep",
            "defenseless", "defensive", "defiant", "deficient", "definite",
            "definitive", "delayed", "delectable", "delicious", "delightful",
            "delirious", "demanding", "dense", "dental", "dependable",
            "dependent", "descriptive", "deserted", "detailed", "determined",
            "devoted", "different", "difficult", "digital", "diligent", "dim"
            , "dimpled", "dimwitted", "direct", "disastrous", "discrete",
            "disfigured", "disgusting", "disloyal", "dismal", "distant",
            "downright", "dreary", "dirty", "disguised", "dishonest", "dismal"
            , "distant", "distinct", "distorted", "dizzy", "dopey", "doting",
            "double", "downright", "drab", "drafty", "dramatic", "dreary",
            "droopy", "dry", "dual", "dull", "dutiful", "eager",
            "earnest", "early", "easy", "easy-going", "ecstatic", "edible",
            "educated", "elaborate", "elastic", "elated", "elderly",
            "electric", "elegant", "elementary", "elliptical", "embarrassed",
            "embellished", "eminent", "emotional", "empty", "enchanted",
            "enchanting", "energetic", "enlightened", "enormous", "enraged",
            "entire", "envious", "equal", "equatorial", "essential",
            "esteemed", "ethical", "euphoric", "even", "evergreen",
            "everlasting", "every", "evil", "exalted", "excellent",
            "exemplary", "exhausted", "excitable", "excited", "exciting",
            "exotic", "expensive", "experienced", "expert", "extraneous",
            "extroverted", "extra-large", "extra-small", "fabulous", "failing"
            , "faint", "fair", "faithful", "fake", "false", "familiar",
            "famous", "fancy", "fantastic", "far", "faraway", "far-flung",
            "far-off", "fast", "fat", "fatal", "fatherly", "favorable",
            "favorite", "fearful", "fearless", "feisty", "feline", "female",
            "feminine", "few", "fickle", "filthy", "fine", "finished", "firm"
            , "first", "firsthand", "fitting", "fixed", "flaky", "flamboyant"
            , "flashy", "flat", "flawed", "flawless", "flickering", "flimsy",
            "flippant", "flowery", "fluffy", "fluid", "flustered", "focused",
            "fond", "foolhardy", "foolish", "forceful", "forked", "formal",
            "forsaken", "forthright", "fortunate", "fragrant", "frail",
            "frank", "frayed", "free", "rench", "fresh", "frequent",
            "friendly", "frightened", "frightening", "frigid", "frilly",
            "frizzy", "frivolous", "front", "frosty", "frozen", "frugal",
            "fruitful", "full", "fumbling", "functional", "funny", "fussy",
            "fuzzy", "gargantuan", "gaseous", "general", "generous", "gentle"
            , "genuine", "giant", "giddy", "gigantic", "gifted", "giving",
            "glamorous", "glaring", "glass", "gleaming", "gleeful",
            "glistening", "glittering", "gloomy", "glorious", "glossy", "glum"
            , "golden", "good", "good-natured", "gorgeous", "graceful",
            "gracious", "grand", "grandiose", "granular", "grateful", "grave"
            , "gray", "great", "greedy", "green", "gregarious", "grim",
            "grimy", "gripping", "grizzled", "gross", "grotesque", "grouchy",
            "grounded", "growing", "growling", "grown", "grubby", "gruesome",
            "grumpy", "guilty", "gullible", "gummy", "hairy", "half",
            "handmade", "handsome", "handy", "happy", "happy-go-lucky", "hard"
            , "hard-to-find", "harmful", "harmless", "harmonious", "harsh",
            "hasty", "hateful", "haunting", "healthy", "heartfelt", "hearty",
            "heavenly", "heavy", "hefty", "helpful", "helpless", "hidden",
            "hideous", "high", "high-level", "hilarious", "hoarse", "hollow",
            "homely", "honest", "honorable", "honored", "hopeful", "horrible"
            , "hospitable", "hot", "huge", "humble", "humiliating", "humming"
            , "humongous", "hungry", "hurtful", "husky", "icky", "icy",
            "ideal", "idealistic", "identical", "idle", "idiotic", "idolized"
            , "ignorant", "ill", "illegal", "ill-fated", "ill-informed",
            "illiterate", "illustrious", "imaginary", "imaginative",
            "immaculate", "immaterial", "immediate", "immense", "impassioned"
            , "impeccable", "impartial", "imperfect", "imperturbable",
            "impish", "impolite", "important", "impossible", "impractical",
            "impressionable", "impressive", "improbable", "impure", "inborn",
            "incomparable", "incompatible", "incomplete", "inconsequential",
            "incredible", "indelible", "inexperienced", "indolent", "infamous"
            , "infantile", "infatuated", "inferior", "infinite", "informal",
            "innocent", "insecure", "insidious", "insignificant", "insistent"
            , "instructive", "insubstantial", "intelligent", "intent",
            "intentional", "interesting", "internal", "international",
            "intrepid", "ironclad", "irresponsible", "irritating", "itchy",
            "jaded", "jagged", "jam-packed", "jaunty", "jealous", "jittery",
            "joint", "jolly", "jovial", "joyful", "joyous", "jubilant",
            "judicious", "juicy", "jumbo", "junior", "jumpy", "juvenile",
            "kaleidoscopic", "keen", "key", "kind", "kindhearted", "kindly",
            "klutzy", "knobby", "knotty", "knowledgeable", "knowing", "known"
            , "kooky", "kosher", "lame", "lanky", "large", "last", "lasting",
            "late", "lavish", "lawful", "lazy", "leading", "lean", "leafy",
            "left", "legal", "legitimate", "light", "lighthearted", "likable"
            , "likely", "limited", "limp", "limping", "linear", "lined",
            "liquid", "little", "live", "lively", "livid", "loathsome", "lone"
            , "lonely", "long", "long-term", "loose", "lopsided", "lost",
            "loud", "lovable", "lovely", "loving", "low", "loyal", "lucky",
            "lumbering", "luminous", "lumpy", "lustrous", "luxurious", "mad",
            "made-up", "magnificent", "majestic", "major", "male", "mammoth",
            "married", "marvelous", "masculine", "massive", "mature", "meager"
            , "mealy", "mean", "measly", "meaty", "medical", "mediocre",
            "medium", "meek", "mellow", "melodic", "memorable", "menacing",
            "merry", "messy", "metallic", "mild", "milky", "mindless",
            "miniature", "minor", "minty", "miserable", "miserly", "misguided"
            , "misty", "mixed", "modern", "modest", "moist", "monstrous",
            "monthly", "monumental", "moral", "mortified", "motherly",
            "motionless", "mountainous", "muddy", "muffled", "multicolored",
            "mundane", "murky", "mushy", "musty", "muted", "mysterious",
            "naive", "narrow", "nasty", "natural", "naughty", "nautical",
            "near", "neat", "necessary", "needy", "negative", "neglected",
            "negligible", "neighboring", "nervous", "new", "next", "nice",
            "nifty", "nimble", "nippy", "nocturnal", "noisy", "nonstop",
            "normal", "notable", "noted", "noteworthy", "novel", "noxious",
            "numb", "nutritious", "nutty", "obedient", "obese", "oblong",
            "oily", "oblong", "obvious", "occasional", "odd", "oddball",
            "offbeat", "offensive", "official", "old", "old-fashioned", "only"
            , "open", "optimal", "optimistic", "opulent", "orange", "orderly"
            , "organic", "ornate", "ornery", "ordinary", "original", "other",
            "our", "outlying", "outgoing", "outlandish", "outrageous",
            "outstanding", "oval", "overcooked", "overdue", "overjoyed",
            "overlooked", "palatable", "pale", "paltry", "parallel", "parched"
            , "partial", "passionate", "past", "pastel", "peaceful", "peppery"
            , "perfect", "perfumed", "periodic", "perky", "personal",
            "pertinent", "pesky", "pessimistic", "petty", "phony", "physical"
            , "piercing", "pink", "pitiful", "plain", "plaintive", "plastic",
            "playful", "pleasant", "pleased", "pleasing", "plump", "plush",
            "polished", "polite", "political", "pointed", "pointless",
            "poised", "poor", "popular", "portly", "posh", "positive",
            "possible", "potable", "powerful", "powerless", "practical",
            "precious", "present", "prestigious", "pretty", "precious",
            "previous", "pricey", "prickly", "primary", "prime", "pristine",
            "private", "prize", "probable", "productive", "profitable",
            "profuse", "proper", "proud", "prudent", "punctual", "pungent",
            "puny", "pure", "purple", "pushy", "putrid", "puzzled", "puzzling"
            , "quaint", "qualified", "quarrelsome", "quarterly", "queasy",
            "querulous", "questionable", "quick", "quick-witted", "quiet",
            "quintessential", "quirky", "quixotic", "quizzical", "radiant",
            "ragged", "rapid", "rare", "rash", "raw", "recent", "reckless",
            "rectangular", "ready", "real", "realistic", "reasonable", "red",
            "reflecting", "regal", "regular", "reliable", "relieved",
            "remarkable", "remorseful", "remote", "repentant", "required",
            "respectful", "responsible", "repulsive", "revolving", "rewarding"
            , "rich", "rigid", "right", "ringed", "ripe", "roasted", "robust"
            , "rosy", "rotating", "rotten", "rough", "round", "rowdy", "royal"
            , "rubbery", "rundown", "ruddy", "rude", "runny", "rural", "rusty"
            , "sad", "safe", "salty", "same", "sandy", "sane", "sarcastic",
            "sardonic", "satisfied", "scaly", "scarce", "scared", "scary",
            "scented", "scholarly", "scientific", "scornful", "scratchy",
            "scrawny", "second", "secondary", "second-hand", "secret", "self" +
            "-assured", "self-reliant", "selfish", "sentimental", "separate",
            "serene", "serious", "serpentine", "several", "severe", "shabby",
            "shadowy", "shady", "shallow", "shameful", "shameless", "sharp",
            "shimmering", "shiny", "shocked", "shocking", "shoddy", "short",
            "short-term", "showy", "shrill", "shy", "sick", "silent", "silky"
            , "silly", "silver", "similar", "simple", "simplistic", "sinful",
            "single", "sizzling", "skeletal", "skinny", "sleepy", "slight",
            "slim", "slimy", "slippery", "slow", "slushy", "small", "smart",
            "smoggy", "smooth", "smug", "snappy", "snarling", "sneaky",
            "sniveling", "snoopy", "sociable", "soft", "soggy", "solid",
            "somber", "some", "spherical", "sophisticated", "sore",
            "sorrowful", "soulful", "soupy", "sour", "panish", "sparkling",
            "sparse", "specific", "spectacular", "speedy", "spicy", "spiffy",
            "spirited", "spiteful", "splendid", "spotless", "spotted", "spry"
            , "square", "squeaky", "squiggly", "stable", "staid", "stained",
            "stale", "standard", "starchy", "stark", "starry", "steep",
            "sticky", "stiff", "stimulating", "stingy", "stormy", "straight",
            "strange", "steel", "strict", "strident", "striking", "striped",
            "strong", "studious", "stunning", "stupendous", "stupid", "sturdy"
            , "stylish", "subdued", "submissive", "substantial", "subtle",
            "suburban", "sudden", "sugary", "sunny", "super", "superb",
            "superficial", "superior", "supportive", "sure-footed",
            "surprised", "suspicious", "svelte", "sweaty", "sweet",
            "sweltering", "swift", "sympathetic", "tall", "talkative", "tame"
            , "tan", "tangible", "tart", "tasty", "tattered", "taut",
            "tedious", "teeming", "tempting", "tender", "tense", "tepid",
            "terrible", "terrific", "testy", "thankful", "that", "these",
            "thick", "thin", "third", "thirsty", "this", "thorough", "thorny"
            , "those", "thoughtful", "threadbare", "thrifty", "thunderous",
            "tidy", "tight", "timely", "tinted", "tiny", "tired", "torn",
            "total", "tough", "traumatic", "treasured", "tremendous", "tragic"
            , "trained", "tremendous", "triangular", "tricky", "trifling",
            "trim", "trivial", "troubled", "true", "trusting", "trustworthy",
            "trusty", "truthful", "tubby", "turbulent", "twin", "ugly",
            "ultimate", "unacceptable", "unaware", "uncomfortable", "uncommon"
            , "unconscious", "understated", "unequaled", "uneven",
            "unfinished", "unfit", "unfolded", "unfortunate", "unhappy",
            "unhealthy", "uniform", "unimportant", "unique", "united",
            "unkempt", "unknown", "unlawful", "unlined", "unlucky",
            "unnatural", "unpleasant", "unrealistic", "unripe", "unruly",
            "unselfish", "unsightly", "unsteady", "unsung", "untidy",
            "untimely", "untried", "untrue", "unused", "unusual", "unwelcome"
            , "unwieldy", "unwilling", "unwitting", "unwritten", "upbeat",
            "upright", "upset", "urban", "usable", "used", "useful", "useless"
            , "utilized", "utter", "vacant", "vague", "vain", "valid",
            "valuable", "vapid", "variable", "vast", "velvety", "venerated",
            "vengeful", "verifiable", "vibrant", "vicious", "victorious",
            "vigilant", "vigorous", "villainous", "violet", "violent",
            "virtual", "virtuous", "visible", "vital", "vivacious", "vivid",
            "voluminous", "wan", "warlike", "warm", "warmhearted", "warped",
            "wary", "wasteful", "watchful", "waterlogged", "watery", "wavy",
            "wealthy", "weak", "weary", "webbed", "wee", "weekly", "weepy",
            "weighty", "weird", "welcome", "well-documented", "well-groomed",
            "well-informed", "well-lit", "well-made", "well-off", "well-to-do"
            , "well-worn", "wet", "which", "whimsical", "whirlwind",
            "whispered", "white", "whole", "whopping", "wicked", "wide",
            "wide-eyed", "wiggly", "wild", "willing", "wilted", "winding",
            "windy", "winged", "wiry", "wise", "witty", "wobbly", "woeful",
            "wonderful", "wooden", "woozy", "wordy", "worldly", "worn",
            "worried", "worrisome", "worse", "worst", "worthless",
            "worthwhile", "worthy", "wrathful", "wretched", "writhing",
            "wrong", "wry", "yawning", "yearly", "yellow", "yellowish",
            "young", "youthful", "yummy", "zany", "zealous", "zesty", "zigzag"};

    private static String[] nouns = {"aardvark", "abacus", "abalone", "abdomen",
            "abdominal", "above", "abscess", "absinthe", "accelerator",
            "accident", "account", "accountant", "ace", "acid", "acne",
            "acorn", "acrobat", "across", "actor", "actress", "addict",
            "adhesive", "adventurer", "advertisement", "advisor", "aeroplane"
            , "aerosol", "aftershave", "against", "airbrush", "aircraft",
            "airline", "airplane", "albacore", "albino", "album", "alcohol",
            "alcoholic", "ale", "alfalfa", "ally", "alphabet", "alternator",
            "ambassador", "ammonia", "ammunition", "amphetamine", "amphibian"
            , "amputee", "anchor", "android", "anger", "animal", "ankle",
            "anklet", "anorexic", "ant", "antelope", "antenna", "antifreeze",
            "apartment", "apathetic", "ape", "apostrophe", "apparel",
            "appendix", "appetite", "appetizer", "applause", "apple",
            "applesauce", "appliance", "apprentice", "apricot", "arc",
            "arcade", "arch", "archaeologist", "archer", "archery",
            "architect", "architecture", "archive", "archivist", "arena",
            "arm", "armada", "armadillo", "armband", "armchair", "armor",
            "armpit", "armrest", "army", "arrow", "arrowhead", "arsonist",
            "art", "ash", "asparagus", "asphalt", "asteroid", "attic",
            "attire", "aunt", "author", "autograph", "ax", "axe", "axle",
            "azalea", "azimuth", "azure", "babble", "babbler", "babe", "babel"
            , "baboon", "babushka", "baby", "babyhood", "babysitter", "back",
            "backache", "backbone", "backdrop", "backgammon", "background",
            "backhand", "backhoe", "backpack", "backpacker", "backside",
            "backspace", "backstage", "backstop", "backstroke", "backup",
            "backward", "backyard", "bacon", "bacteria", "badminton", "bag",
            "bagel", "baggage", "bagpipe", "bagpipes", "bait", "baker",
            "bakery", "balance", "balcony", "ball", "ballerina", "ballet",
            "ballistic", "ballistics", "balloon", "balloonist", "ballot",
            "ballpark", "ballplayer", "ballpoint", "ballroom", "balm",
            "bamboo", "banana", "band", "bandage", "band-aid", "bandana",
            "bandit", "bandstand", "banister", "banjo", "bank", "banker",
            "banking", "banknote", "bankroll", "banner", "bar", "barbecue",
            "barbell", "barber", "barbershop", "barbiturate", "barefaced",
            "barefoot", "bargain", "barge", "baritone", "barium", "bark",
            "barley", "barmaid", "barn", "barnacle", "barnyard", "barometer",
            "barracuda", "barrel", "barricade", "barrier", "bartender",
            "barter", "bass", "bassinet", "bassist", "bassoon", "bat", "bath"
            , "bather", "bathhouse", "bathrobe", "bathroom", "bathtub",
            "baton", "battalion", "batter", "battery", "bay", "bayonet",
            "bayou", "bazooka", "beach", "beachcomber", "bead", "beagle",
            "beak", "beaker", "beam", "bean", "beanbag", "bear", "beard",
            "bearded", "bearer", "beast", "beaver", "bed", "bedbug", "bedding"
            , "bedpan", "bedroom", "bedtime", "bee", "beech", "beef",
            "beefsteak", "beehive", "beekeeper", "beer", "beeswax", "beetle",
            "beggar", "beginner", "beige", "bell", "bellboy", "bellows",
            "belly", "below", "belt", "bench", "beneath", "berry", "between",
            "bib", "biceps", "bicycle", "bicyclist", "bifocal", "bifocals",
            "bike", "biker", "bikini", "bill", "billboard", "billiards",
            "billionaire", "bimbo", "bin", "bingo", "birch", "bird",
            "birdbath", "birdhouse", "birdseed", "birthday", "birthmark",
            "bison", "blackberry", "blackboard", "blackhead", "blackjack",
            "blank", "blanket", "bleach", "blimp", "blob", "block", "blonde",
            "blood", "blouse", "blowgun", "blueberry", "bluebird", "boar",
            "board", "boardroom", "boat", "bobcat", "bobsled", "body",
            "bodyguard", "bologna", "bolt", "bomb", "bonbon", "bone", "bongo"
            , "bonus", "book", "bookcase", "boomerang", "boot", "boss",
            "bottle", "bow", "bowl", "bowler", "bowling", "box", "boy",
            "brain", "brake", "brass", "bread", "brick", "bride", "bridge",
            "bridle", "briefcase", "broccoli", "broom", "broomstick", "brow",
            "brunette", "brush", "bubble", "buck", "bucket", "buckle", "bud",
            "buddy", "buffalo", "bug", "buggy", "bugle", "bulb", "bulldog",
            "bullet", "bullfighter", "bullfighting", "bullfrog", "bum",
            "bumblebee", "bump", "bumper", "bun", "bungalow", "bunny",
            "burger", "burglar", "bus", "busboy", "business", "businessman",
            "businesswoman", "butcher", "butler", "butter", "butterfly",
            "buttermilk", "cab", "cabinet", "cabinetmaker", "cable", "caboose"
            , "cactus", "cafe", "cafeteria", "cage", "cake", "calendar",
            "calf", "camel", "camera", "cameraman", "camouflage", "camp",
            "camper", "campfire", "campground", "campus", "can", "candle",
            "candlelight", "candlestick", "candy", "cane", "cannabis",
            "cannibal", "canoe", "canoeist", "canon", "cantaloupe", "canvas",
            "cap", "cape", "car", "card", "cardboard", "cardinal", "cargo",
            "caribou", "caricature", "carp", "carpenter", "carpentry",
            "carpet", "carrot", "carrousel", "cartoon", "cartoonist", "case",
            "cash", "cashew", "cashier", "casket", "castle", "cat",
            "catamaran", "catapult", "caterpillar", "catfish", "cattle",
            "cave", "caviar", "cedar", "ceiling", "celebration", "celery",
            "cell", "cellar", "cellist", "cello", "cement", "cemetery",
            "cereal", "cerebellum", "ceremony", "certificate", "cervix",
            "chain", "chair", "chairlift", "chalk", "chalkboard", "chauffeur"
            , "check", "checkbook", "checkers", "cheddar", "cheek",
            "cheekbone", "cheese", "cheeseburger", "cheesecake", "cheesecloth"
            , "cheetah", "chef", "chemist", "cherry", "chess", "chessboard",
            "chest", "chestnut", "chick", "chicken", "chickenpox", "chickpea"
            , "chihuahua", "child", "children", "chimp", "chimpanzee", "chin"
            , "chinchilla", "chip", "chipmunk", "chisel", "choir", "choke",
            "chopstick", "chopsticks", "chrome", "chrysalis", "chrysanthemum"
            , "cigar", "cigarette", "cilantro", "cinnamon", "circle", "circus"
            , "city", "clam", "clarinet", "claw", "clergy", "clergyman",
            "clergywoman", "clerk", "cliff", "climber", "clip", "clipboard",
            "cloak", "clock", "cloth", "clothes", "clothesline", "clothespin"
            , "clothing", "cloud", "clover", "cloverleaf", "clown", "club",
            "coach", "coal", "coat", "cobble", "cobbler", "cobra", "cocaine",
            "cockatoo", "cockpit", "cockroach", "cocktail", "cocoa", "coconut"
            , "cocoon", "cod", "codfish", "coffee", "coffeepot", "coffin",
            "cog", "cognac", "coin", "colander", "coliseum", "collar",
            "collarbone", "college", "collie", "cologne", "colon", "colonel",
            "color", "colt", "column", "comb", "combat", "comedian",
            "comedienne", "comedy", "comet", "comic", "comics", "comma",
            "commando", "compass", "composer", "computer", "concrete", "condo"
            , "condolence", "condor", "conductor", "conduit", "cone",
            "confetti", "conga", "congress", "connection", "connoisseur",
            "container", "cook", "cookbook", "cookie", "cooking", "cookout",
            "copper", "copperhead", "coral", "cord", "coriander", "cork",
            "corkscrew", "corn", "cornbread", "cornea", "corner", "cornet",
            "cornflakes", "cornmeal", "coroner", "cotton", "couch", "cougar",
            "cough", "coupon", "court", "courthouse", "cove", "cow", "cowboy"
            , "cowgirl", "cowhand", "cowhide", "coyote", "crab", "cracker",
            "cradle", "cranberry", "crane", "cranium", "crap", "crate",
            "crater", "crawfish", "crayfish", "crayon", "cream", "creator",
            "creature", "creek", "crib", "cricket", "criminal", "cross",
            "crossbar", "crossbones", "crossbow", "crosswalk", "crow",
            "crowbar", "crowd", "crown", "crucifix", "cruiser", "crumb",
            "crystal", "cub", "cube", "cuckoo", "cucumber", "cue", "cuff",
            "cup", "cupboard", "cupcake", "curb", "curl", "curler", "cursor",
            "curve", "cushion", "custard", "custodian", "cutoffs",
            "cuttlefish", "cylinder", "dachshund", "daffodil", "dancer",
            "dandelion", "dandruff", "dart", "dartboard", "dashboard",
            "dealer", "dealership", "dean", "deck", "deer", "den", "denim",
            "deodorant", "desert", "designer", "desk", "desktop", "dessert",
            "destroyer", "detective", "detergent", "developer", "devil", "dew"
            , "dewdrop", "diagram", "dial", "dice", "diesel", "dime", "dimple"
            , "diner", "dingo", "dinner", "dinosaur", "dipstick", "dirt",
            "disc", "dish", "dishcloth", "disk", "doctor", "doe", "dog",
            "dollar", "dollhouse", "dolphin", "dolt", "domino", "donkey",
            "donut", "door", "doorbell", "doorknob", "dot", "dough",
            "doughnut", "dove", "dragon", "dragonfly", "drain", "dream",
            "dreamer", "dress", "dresser", "dressmaker", "driftwood", "drill"
            , "drink", "drivel", "driver", "driveway", "drizzle", "drop",
            "droplet", "dropout", "drug", "druggist", "drugstore", "drum",
            "drummer", "drunk", "drunkard", "drywall", "duck", "duckling",
            "duct", "dude", "duet", "dump", "dumpster", "dunce", "dune",
            "dungeon", "dusk", "dust", "duster", "dustpan", "dwarf", "*",
            "eagle", "ear", "earache", "earphone", "earplug", "earring",
            "earth", "earthquake", "easel", "economist", "eel", "egg",
            "eggplant", "eggshell", "elbow", "electrician", "electricity",
            "elevator", "elf", "elk", "elm", "embryo", "emerald", "engineer",
            "equalizer", "equipment", "eraser", "escalator", "eve",
            "evergreen", "ewe", "explorer", "explosion", "exterminator",
            "extinguisher", "eye", "eyeball", "eyebrow", "eyeglass",
            "eyeglasses", "eyelash", "eyelid", "eyeliner", "eyeteeth",
            "eyetooth", "fabric", "face", "factory", "fairy", "falcon",
            "falconer", "family", "fan", "fang", "farm", "farmer", "farmhand"
            , "farmhouse", "farming", "farmyard", "fashion", "fast-food",
            "fatigues", "faun", "fauna", "fawn", "fax", "feather", "feet",
            "female", "femur", "fence", "fencer", "fencing", "fender",
            "fennel", "fern", "ferret", "ferry", "ferryboat", "festival",
            "fibula", "fiddle", "fig", "fighter", "figurine", "file", "filet"
            , "finch", "finger", "fingernail", "fingerprint", "fingertip",
            "fir", "fire", "firearm", "firecracker", "firefight",
            "firefighter", "firefly", "firehouse", "fireman", "fireplace",
            "fish", "fishbowl", "fisherman", "fishhook", "fishing", "fishnet"
            , "fizz", "flab", "flag", "flagpole", "flake", "flame", "flamingo"
            , "flannel", "flapjack", "flare", "flashbulb", "flashlight",
            "flatware", "flax", "flea", "fleece", "flesh", "flick", "flood",
            "floor", "flower", "flowerbed", "flowerpot", "flu", "fluff",
            "fluid", "fluoride", "flute", "flutist", "fog", "foil", "font",
            "food", "fool", "foot", "football", "footlocker", "footwear",
            "forceps", "ford", "forearm", "forefinger", "forehand", "forehead"
            , "foreigner", "forest", "fork", "forklift", "form", "formula",
            "fort", "fortune-teller", "fossil", "fountain", "fowl", "fox",
            "foxhound", "frame", "frank", "freezer", "freight", "freighter",
            "freshwater", "fridge", "fries", "frisbee", "frog", "frost",
            "froth", "frown", "fruit", "fruitcake", "fudge", "fullback",
            "fumble", "funeral", "fungus", "funnel", "fur", "furnace", "fuzz"
            , "galaxy", "gallbladder", "gambler", "game", "gang", "gap",
            "garage", "garbage", "garden", "gardener", "gargoyle", "garlic",
            "garter", "gas", "gasket", "gasoline", "gasp", "gate", "gateway",
            "gauche", "gauge", "gauze", "gazebo", "gazelle", "gear",
            "gearshift", "geek", "geese", "geisha", "gel", "gelatin", "gem",
            "gemstone", "genie", "genius", "gent", "gentleman", "gentlewoman"
            , "gentry", "geology", "geometry", "geophysics", "gerbil",
            "gesture", "geyser", "ghetto", "ghost", "giant", "gift", "gill",
            "gin", "ginger", "gingersnap", "ginkgo", "ginseng", "gipsy",
            "giraffe", "girl", "gladiator", "glass", "glasses", "glassware",
            "glob", "globe", "gloom", "glove", "glue", "glycerin", "glycerine"
            , "gnat", "gnu", "goalie", "goalkeeper", "goalpost", "goat",
            "goatee", "goatherd", "gofer", "goggle", "goggles", "gold", "golf"
            , "golfer", "gong", "goon", "goose", "gooseberry", "goose-step",
            "gopher", "gorge", "gorilla", "goth", "gourd", "gourmet", "gout",
            "gown", "grail", "grain", "granola", "granule", "grape",
            "grapefruit", "grapevine", "graph", "graphic", "graphics",
            "graphite", "graphologist", "graphology", "grass", "grasshopper",
            "grassland", "grater", "grave", "gravel", "graveyard", "gravy",
            "gray", "grease", "greenback", "greenery", "greengrocer",
            "greenhouse", "greens", "grenade", "grey", "greyhound", "grid",
            "griddle", "griddlecake", "grimace", "grime", "grin", "grinder",
            "grindstone", "gristle", "grit", "grits", "grocer", "groceries",
            "grocery", "groin", "grommet", "grouch", "ground", "groundhog",
            "group", "grout", "grub", "guano", "guava", "guerilla",
            "guillotine", "guitar", "guitarist", "gull", "gum", "gumbo",
            "gumdrop", "gun", "gunboat", "gunpoint", "gunpowder", "gunrunner"
            , "gunrunning", "gunshot", "gunslinger", "gunsmith", "guppy",
            "gurney", "guru", "gut", "gutter", "guy", "gym", "gymnasium",
            "gymnast", "gymnastics", "gynecologist", "gynecology", "gypsum",
            "gypsy", "hacksaw", "hag", "hailstone", "hailstorm", "hair",
            "hairbrush", "haircut", "hairdo", "hairdresser", "hairdressing",
            "hairline", "hairpiece", "hairpin", "hairstyle", "hairstylist",
            "hall", "hallway", "halo", "halogen", "ham", "hamburger", "hammer"
            , "hammock", "hamper", "hamster", "hamstring", "hand", "handbag",
            "handball", "handcuff", "handgun", "handle", "handlebar",
            "handrail", "handshake", "handyman", "hangar", "hanger", "hangman"
            , "harbor", "hardware", "hardwood", "harmonica", "harp", "harpist"
            , "harpoon", "harpsichord", "harvest", "harvester", "hash",
            "hashish", "hat", "hatchback", "hatchet", "hawk", "hay", "haze",
            "hazel", "hazelnut", "head", "headache", "headboard", "headgear",
            "headhunter", "headphone", "headphones", "headroom", "headset",
            "heap", "hearse", "heart", "heat", "heater", "hedge", "hedgehog",
            "helicopter", "helmet", "hemp", "hen", "herb", "herd", "hermit",
            "heroin", "highway", "hijacker", "hiker", "hill", "hillbilly",
            "hippy", "historian", "history", "hitch", "hitchhiker", "hitter",
            "hive", "hoagie", "hobo", "hockey", "hoe", "hog", "holster",
            "home", "homemaker", "honeybee", "honeycomb", "honeysuckle",
            "hood", "hoodlum", "hoof", "hook", "horn", "hornet", "horse",
            "horsefly", "horseshoe", "hose", "hospital", "hotel", "housefly",
            "housetop", "housewife", "human", "hunter", "huntsman", "hurdler"
            , "hurricane", "hyacinth", "hydrant", "hyena", "ibex", "ice",
            "iceberg", "icebox", "ice-skate", "idiot", "igloo", "ignition",
            "ignoramus", "iguana", "illness", "illusion", "image", "imp",
            "incense", "inch", "income", "index", "indigo", "industry",
            "infant", "infantry", "infantryman", "injury", "ink", "insect",
            "insecticide", "insectivore", "insignia", "instep", "interpreter"
            , "interrogator", "invoice", "iron", "italic", "ivory", "ivy",
            "jack", "jackal", "jackass", "jacket", "jackhammer", "jackpot",
            "jackrabbit", "jacuzzi", "jade", "jaguar", "jail", "jam",
            "janitor", "jar", "jaw", "jawbone", "jawbreaker", "jay", "jazz",
            "jeans", "jeep", "jell-o", "jelly", "jellybean", "jellyfish",
            "jet", "jewel", "jib", "jibe", "jig", "jigsaw", "jock", "jockey",
            "jogger", "joiner", "joint", "joker", "joyrider", "judo", "jug",
            "juggler", "jugular", "juice", "juicer", "jukebox", "jumper",
            "jumpsuit", "junkie", "junkyard", "juror", "jury", "kale",
            "kangaroo", "karaoke", "karate", "kazoo", "keg", "kelp", "ketchup"
            , "kettle", "kettledrum", "key", "keyboard", "keyhole", "keynote"
            , "keypunch", "keystone", "keystroke", "khaki", "khakis",
            "kickback", "kicker", "kickoff", "kid", "kidnapper", "kidney",
            "killer", "kiln", "kilt", "kindergarten", "kindle", "king", "kite"
            , "kitten", "kitty", "kiwi", "kleenex", "kleptomaniac", "klutz",
            "knapsack", "knee", "kneecap", "knickers", "knickknack", "knife",
            "knight", "knitter", "knitting", "knob", "knot", "koala", "label"
            , "laborer", "labyrinth", "lace", "lacquer", "lacrosse", "ladder"
            , "ladle", "lady", "ladybug", "ladyfinger", "lake", "lamb",
            "lambaste", "lambskin", "lamp", "landlady", "landlord", "landmark"
            , "landscape", "lanyard", "lap", "lapel", "laptop", "lark",
            "larva", "larvae", "larynx", "lasagna", "laser", "lasso", "latch"
            , "lava", "lavatory", "lavender", "lawn", "lawyer", "leader",
            "leadership", "leaf", "leaflet", "leak", "leakage", "lecturer",
            "ledge", "leg", "legume", "lemon", "lemonade", "lens", "leopard",
            "leotard", "leper", "leprechaun", "letter", "letterhead",
            "lettuce", "levee", "level", "lever", "liar", "lice", "license",
            "licorice", "life", "lifeboat", "lifeguard", "lifesaver", "light"
            , "lightning", "limb", "limo", "limousine", "linebacker",
            "lineman", "linesman", "lineup", "link", "lion", "lioness", "lip"
            , "liposuction", "liqueur", "liquid", "liquor", "listener",
            "literature", "litter", "litterbug", "liver", "livestock",
            "lizard", "llama", "loaf", "loafer", "lobotomy", "lobster", "lock"
            , "locker", "locket", "lockjaw", "lockout", "locksmith",
            "locomotive", "locust", "lodge", "lodger", "lodging", "loft",
            "log", "loganberry", "logger", "logging", "logjam", "logo",
            "loiterer", "loner", "loop", "loot", "looter", "lottery",
            "loudmouth", "loudspeaker", "lounge", "louse", "lozenge",
            "lubricant", "lubrication", "luck", "luggage", "lumbar", "lumber"
            , "lumberjack", "lumberman", "lumberyard", "lump", "lung",
            "lyrics", "macaroni", "macaroon", "macaw", "mace", "machine",
            "machinery", "machinist", "mackerel", "macrame", "madman",
            "madwoman", "mafia", "mafioso", "magazine", "magenta", "maggot",
            "magic", "magician", "magnate", "magnesium", "magnet", "magnolia"
            , "magnum", "maid", "maiden", "mail", "mailbox", "mailman",
            "mainframe", "malaria", "male", "mall", "malt", "man", "manager",
            "manatee", "mandible", "mandolin", "mandrake", "mandrill",
            "manganese", "manger", "mango", "manic", "manicure", "manicurist"
            , "mannequin", "manufacturer", "manure", "manuscript", "map",
            "maple", "marathon", "marijuana", "marinade", "marine", "mariner"
            , "mark", "market", "marketplace", "marksman", "marlin",
            "marmalade", "marmoset", "marmot", "maroon", "marquee", "marriage"
            , "marrow", "mars", "marsh", "marshmallow", "marsupial", "martian"
            , "martinet", "martini", "mascara", "mascot", "mask", "mason",
            "mastiff", "mat", "matchbook", "matchbox", "matchless",
            "matchmaker", "matchmaking", "mate", "material", "math",
            "mathematician", "mathematics", "matrimony", "matrix", "matt",
            "matte", "matting", "mattress", "mayonnaise", "maze", "meadow",
            "meadowlark", "meal", "meat", "meatball", "meatloaf", "meaty",
            "mechanic", "medal", "medalist", "medicine", "megaphone", "melon"
            , "memento", "memo", "memoir", "memorandum", "memorial", "memory"
            , "men", "menopause", "menswear", "menthol", "menu", "mercury",
            "mermaid", "merry-go-round", "mesh", "mesquite", "mess", "met",
            "metal", "meteor", "meteorite", "meteoroid", "meteorologist",
            "meteorology", "meter", "metro", "metronome", "metropolis",
            "metropolitan", "mice", "microchip", "microcomputer", "midget",
            "milk", "milkman", "milkshake", "mill", "millionaire", "millipede"
            , "mime", "mimicry", "mimosa", "mincemeat", "mind", "mine",
            "minefield", "miner", "mineral", "mineralogist", "minibike",
            "minibus", "minicam", "mining", "minion", "mink", "minor",
            "minority", "mint", "minus", "minute", "mirage", "mirror",
            "mischief", "miser", "misfortune", "misogynist", "misogyny",
            "missile", "mission", "missionary", "mistletoe", "miter", "mitt",
            "mitten", "mobster", "moccasin", "mocha", "mockingbird",
            "moisture", "molar", "molasses", "molding", "mole", "molecule",
            "molehill", "monochrome", "monogamy", "monsoon", "monster",
            "month", "monument", "moon", "moose", "mop", "moped", "morning",
            "moron", "mortal", "mortar", "mosque", "mosquito", "motel", "moth"
            , "mothball", "moth-eaten", "motor", "motorbike", "motorboat",
            "motorcycle", "motorcyclist", "motorist", "mound", "mountain",
            "mountaineer", "mourner", "mouse", "mouser", "mousetrap", "mouth"
            , "mouthful", "mouthpiece", "mouthwash", "movement", "mower",
            "muck", "mucous", "mucus", "mud", "muddy", "mudslide", "muffin",
            "muffler", "mugger", "mulberry", "mulch", "mule", "mullet",
            "multimillionaire", "multiplex", "mummy", "mumps", "munchies",
            "munitions", "mural", "murderer", "murderess", "murk", "muscle",
            "museum", "mush", "mushroom", "music", "musician", "musket",
            "musketeer", "muslin", "mussel", "mustache", "mustang", "mutant",
            "mutt", "muzzle", "myth", "nachos", "nag", "nail", "nanny", "nap"
            , "napkin", "narc", "narcotic", "narrator", "nation", "nature",
            "navel", "navy", "neanderthal", "neck", "neckerchief", "necklace"
            , "neckline", "necktie", "nectar", "nectarine", "needle",
            "needlepoint", "needlework", "neighbor", "neighborhood", "neptune"
            , "nerd", "nest", "net", "network", "neurologist", "neurology",
            "neuron", "newcomer", "newlywed", "news", "newsboy", "newscast",
            "newscaster", "newsletter", "newsman", "newspaper", "newspaperman"
            , "newsprint", "newsstand", "nitpicker", "nitrate", "nitrogen",
            "nitroglycerin", "nitroglycerine", "nitty-gritty", "nitwit",
            "noblewoman", "nomad", "noodle", "noose", "nose", "nosebleed",
            "nostril", "notch", "notebook", "nozzle", "number", "numbskull",
            "numeral", "numerate", "numerator", "numerical", "numerically",
            "numerology", "numerous", "numismatics", "numismatist", "numskull"
            , "nun", "nunnery", "nurse", "nursery", "nut", "nutcracker",
            "nutmeg", "nutrient", "nutshell", "oaf", "oak", "oar", "oarlock",
            "oarsman", "oasis", "oat", "oatmeal", "oats", "obesity", "oboe",
            "oboist", "ocean", "oceanographer", "oceanography", "octagon",
            "octogenarian", "octopi", "octopus", "odometer", "office",
            "officer", "ogre", "ointment", "okra", "omelette", "oncology",
            "onion", "opera", "opium", "optometrist", "optometry", "opulence"
            , "orange", "orangutan", "orate", "orchestra", "orchid", "ore",
            "oregano", "organ", "organist", "origami", "oriole", "ornament",
            "ostrich", "outfield", "outfielder", "overlap", "overlord", "owl"
            , "ox", "oxen", "oxygen", "oyster", "ozone", "pacemaker",
            "package", "packaging", "packer", "padding", "paddle", "padlock",
            "page", "pail", "pain", "painkiller", "paint", "paintbrush",
            "painter", "painting", "pair", "pajamas", "palace", "palate",
            "palm", "pan", "panacea", "pancake", "pancreas", "panda", "pane",
            "panel", "panther", "pantry", "pants", "pantsuit", "pantyhose",
            "paper", "paperback", "paperboy", "papergirl", "paperweight",
            "paperwork", "papier-mache", "paprika", "paragraph", "parakeet",
            "parrot", "partridge", "party", "passenger", "passover",
            "passport", "password", "pasta", "paste", "pasteboard", "pastrami"
            , "pastry", "pasture", "patient", "patio", "paunch", "pauper",
            "pavement", "pavilion", "paw", "pawn", "pawnbroker", "pawnshop",
            "paycheck", "pea", "peace", "peach", "peacock", "peak", "peanut",
            "pear", "pearl", "peasant", "pebble", "pecan", "pedal", "peddle",
            "peddler", "pedestal", "pedestrian", "pediatric", "pediatrician",
            "pediatrics", "pedicure", "pedigree", "pedometer", "peekaboo",
            "peep", "peephole", "peg", "pekinese", "pelican", "pellet",
            "pelvis", "pen", "penalty", "penguin", "penicillin", "peninsula",
            "penknife", "penknives", "penlight", "penmanship", "pennant",
            "penniless", "pennon", "penny", "pension", "pensioner", "pentagon"
            , "peon", "people", "pepper", "peppercorn", "peppermint",
            "pepperoni", "percolator", "percussion", "percussionist",
            "performance", "performer", "perfume", "perfumery", "permit",
            "peroxide", "perpetrator", "person", "pest", "pesticide", "pet",
            "petal", "petroleum", "phlegm", "phone", "photo", "photocopier",
            "photograph", "photographer", "photography", "physician",
            "physicist", "physics", "pi", "pianist", "piano", "piccolo",
            "pick", "pickax", "pickaxe", "picnic", "picture", "pidgin", "pie"
            , "piece", "piecemeal", "pig", "pigeon", "pigeonhole", "pile",
            "pilgrim", "pill", "pillar", "pillow", "pillowcase", "pilot",
            "pimple", "pin", "pinball", "ping-pong", "pinhead", "pinhole",
            "pink", "pinkeye", "pinprick", "pint", "pinto", "pipe", "piranha"
            , "pirate", "pit", "pita", "pitcher", "pizza", "pizzeria", "place"
            , "plan", "plane", "planet", "planetarium", "plank", "plankton",
            "plant", "plantain", "plantation", "plasma", "plaster",
            "plasterboard", "plastic", "plate", "platoon", "platypus",
            "playboy", "player", "playpen", "playwright", "plaza", "pliers",
            "plow", "plumber", "plumbing", "pluto", "plywood", "poacher",
            "pocket", "pocketbook", "pocketful", "pocketknife", "pod",
            "podiatrist", "podiatry", "podium", "poem", "poet", "poetess",
            "poetry", "poinsettia", "point", "pointer", "pointless",
            "pointlessly", "poison", "poker", "police", "policeman",
            "pollution", "pollywog", "polo", "poltergeist", "polyester",
            "polygamist", "polygamy", "polygraph", "pony", "ponytail", "pooch"
            , "poodle", "pool", "popcorn", "pope", "pope", "popgun", "poplar"
            , "poplin", "popover", "poppycock", "porcupine", "porter",
            "porterhouse", "possum", "post", "postage", "poster", "posy",
            "pot", "potassium", "potato", "poultry", "pound", "powder",
            "power", "prairie", "prawn", "predator", "preschool",
            "preschooler", "pretzel", "prey", "price", "priest", "priestess",
            "prince", "princess", "principal", "printer", "prism", "prison",
            "prisoner", "prize", "prizefight", "prizefighter", "prodigy",
            "producer", "product", "production", "professor", "program",
            "programmer", "projector", "pronoun", "protein", "prune", "pub",
            "public", "publisher", "puck", "puddle", "puff", "puffball",
            "puffin", "pug", "pulp", "puma", "pumice", "pumpernickel",
            "pumpkin", "pun", "punch", "punk", "pup", "puppet", "puppeteer",
            "puppetry", "puppy", "purple", "purse", "pushcart", "pussycat",
            "putter", "puzzle", "python", "quadrangle", "quadrant",
            "quadrilateral", "quadriplegic", "quadruped", "quagmire", "quail"
            , "quake", "quark", "quarrel", "quarter", "quarterback",
            "quarterfinal", "quartet", "queen", "query", "quest", "question",
            "queue", "quiche", "quicksand", "quick-witted", "quid",
            "quintessence", "quintet", "quintuple", "quintuplet", "quirk",
            "quitter", "quiz", "quota", "quotation", "quote", "rabbit",
            "rabble", "rabble-rouser", "rabies", "raccoon", "race",
            "racehorse", "racer", "racetrack", "raceway", "racism", "racist",
            "rack", "racket", "racketeer", "racketeering", "racquet",
            "racquetball", "radar", "radial", "radiance", "radiator", "radio"
            , "radioactivity", "radiologist", "radiology", "radiotherapy",
            "radish", "radium", "radius", "raffle", "raft", "rafter", "rag",
            "ragamuffin", "rage", "ragweed", "raid", "raider", "rail",
            "railing", "railroad", "railway", "rain", "rainbow", "raincoat",
            "raindrop", "rainfall", "rainstorm", "rainwater", "rainy", "raise"
            , "raisin", "rake", "rakish", "rakishly", "rally", "ram",
            "rambler", "ramp", "ramrod", "ranch", "rancher", "rancor", "range"
            , "ranger", "rank", "ransom", "rant", "rap", "rapper", "rascal",
            "rash", "raspberry", "rat", "ratchet", "rating", "ratio", "ration"
            , "rationalism", "rationalist", "rationalization", "rattan",
            "rattle", "rattler", "rattlesnake", "rattrap", "rave", "rawhide",
            "ray", "rayon", "razor", "reaction", "reactionary", "reactivation"
            , "reactor", "reader", "realtor", "reaper", "rear", "rebel",
            "rebellion", "receipt", "receiver", "recipe", "recorder",
            "recording", "recruiter", "rectangle", "redcoat", "redhead",
            "redneck", "redwood", "reef", "ref", "referee", "reforestation",
            "reformer", "refrigeration", "refrigerator", "refugee", "refund",
            "reggae", "regime", "region", "register", "registrar",
            "registration", "registry", "rehab", "rehabilitation", "rehearsal"
            , "reimbursement", "reindeer", "rejection", "relaxation", "remote"
            , "rent", "rental", "renter", "repairman", "repayment",
            "repellent", "report", "reporter", "repression", "reptile",
            "resistance", "resistor", "resort", "respirator", "restaurant",
            "restoration", "retiree", "retirement", "returnee", "revenge",
            "revenue", "reversal", "revolt", "revolution", "revolutionary",
            "revolver", "rhinestone", "rhino", "rhinoceros", "rib", "ribbon",
            "rice", "rider", "riffraff", "rifle", "rifleman", "rig", "rigging"
            , "right-hand", "rigor", "rim", "ring", "ringer", "ringleader",
            "ringworm", "rink", "riot", "rioter", "rip-off", "ripper",
            "ripple", "risk", "rite", "ritual", "rival", "rivalry", "river",
            "riverside", "roach", "road", "roadblock", "roadkill",
            "roadrunner", "roadside", "roadway", "roadwork", "roast",
            "roaster", "rob", "robber", "robbery", "robe", "robin", "robot",
            "rock", "rocker", "rocket", "rodent", "rodeo", "rollerblade",
            "roller-skate", "romance", "roof", "roofing", "rooftop", "room",
            "rooster", "root", "rope", "rose", "rosebud", "rosebush",
            "rosemary", "rosewood", "roster", "rotation", "roughneck",
            "roundworm", "rover", "row", "rowboat", "rower", "royalty",
            "rubber", "rubber-stamp", "rubbish", "rubble", "ruby", "rucksack"
            , "rudder", "ruffian", "rug", "rugby", "rule", "ruler", "rum",
            "rumba", "rummy", "rumor", "rump", "runner", "runt", "runway",
            "rust", "rye", "saber", "sabotage", "saboteur", "sack",
            "sacrifice", "saddle", "saddlebag", "sadness", "safari", "safe",
            "safflower", "saffron", "saga", "sage", "sagebrush", "sagittarius"
            , "sailboat", "sailfish", "sailing", "sailor", "saint", "salad",
            "salamander", "salami", "salesclerk", "salesman", "salesperson",
            "saleswoman", "saliva", "salmon", "salmonella", "salon", "saloon"
            , "salsa", "salt", "saltine", "saltshaker", "saltwater",
            "samaritan", "sample", "sampler", "sand", "sandal", "sandalwood",
            "sandbag", "sandblaster", "sandbox", "sander", "sandlot",
            "sandpaper", "sandstone", "sandstorm", "sandwich", "sap",
            "sarcasm", "sarong", "sarsaparilla", "sash", "satin", "satire",
            "saturn", "sauce", "saucepan", "sauerkraut", "sauna", "sausage",
            "savanna", "savannah", "savant", "savings", "saw", "sawdust",
            "sawhorse", "sawmill", "sax", "saxophone", "saxophonist", "scab",
            "scabby", "scabies", "scaffolding", "scale", "scallop", "scalp",
            "scalpel", "scam", "scandal", "scanner", "scapegoat", "scapula",
            "scar", "scarecrow", "scarf", "scatterbrain", "scavenger", "scene"
            , "scenery", "scholar", "scholarship", "school", "schoolboy",
            "schoolgirl", "schoolhouse", "schoolmarm", "schoolmaster",
            "schoolroom", "schoolteacher", "schoolwork", "schoolyard", "schwa"
            , "science", "scone", "scoop", "scooter", "scoreboard",
            "scorecard", "scorer", "scorpio", "scorpion", "scotch", "scout",
            "scoutmaster", "scowl", "scrabble", "scrap", "scrapbook",
            "scraper", "scratch", "screenplay", "screenwriter", "screwball",
            "screwdriver", "scrimmage", "script", "scrooge", "scrubber",
            "scuba", "sculptor", "sculpture", "scum", "scumbag", "sea",
            "seabed", "seaboard", "seacoast", "seafarer", "seafood", "seal",
            "sealskin", "seam", "seamstress", "seance", "seaplane", "seaport"
            , "searcher", "searchlight", "seascape", "seashell", "seashore",
            "seasickness", "seaside", "season", "seat", "seaweed", "second",
            "sedation", "sediment", "seed", "seeker", "seesaw", "segregation"
            , "seismograph", "selenium", "self-confidence", "self" +
            "-consciousness", "self-control", "self-deception", "self-defense"
            , "self-denial", "self-destruction", "self-determination", "self" +
            "-discipline", "self-employment", "self-esteem", "self-expression"
            , "self-government", "self-help", "self-image", "self-importance"
            , "self-improvement", "self-incrimination", "self-indulgence",
            "self-interest", "selfishness", "selflessness", "self-pity",
            "self-portrait", "self-possession", "self-preservation", "self" +
            "-reliance", "self-respect", "self-restraint", "self" +
            "-righteousness", "self-sacrifice", "self-satisfaction", "self" +
            "-service", "self-starter", "self-sufficient", "seller", "sellout"
            , "semicircle", "semicolon", "semiconductor", "semifinal",
            "semifinalist", "senator", "sender", "senior", "senselessness",
            "sensibility", "sensor", "sentence", "sentinel", "sentry", "sepia"
            , "sequel", "sequence", "serf", "serfdom", "sergeant", "serpent",
            "serum", "servant", "server", "servitude", "sesame", "sewage",
            "sewer", "sewing", "sextant", "sextet", "shackle", "shade", "shag"
            , "shampoo", "shamrock", "shark", "sharkskin", "shaver", "sheep",
            "sheepskin", "sheet", "shelf", "shellfish", "shelter", "shepherd"
            , "shepherdess", "sheriff", "shin", "shinbone", "shindig",
            "shiner", "shingle", "ship", "shipwreck", "shipyard", "shirt",
            "shock", "shoe", "shoehorn", "shoelace", "shoemaker", "shoeshine"
            , "shoestring", "shooter", "shootout", "shop", "shopkeeper",
            "shoplifter", "shore", "shoreline", "shortbread", "shortcake",
            "shortchange", "shorts", "shortstop", "shotgun", "shot-putter",
            "shoulder", "shovel", "show", "showboat", "showcase", "showdown",
            "shower", "show-off", "shrapnel", "shredder", "shrew",
            "shrewdness", "shrimp", "shrub", "shrubbery", "shuffleboard",
            "shutterbug", "shyness", "sibilant", "sibling", "sickbed",
            "sickness", "side", "sidearm", "sidebar", "sideburns", "sidecar",
            "sidekick", "sideline", "sideshow", "sidewalk", "sieve", "sifter"
            , "sign", "signal", "signature", "signboard", "significant",
            "signpost", "silencer", "silhouette", "silicon", "silk", "silk" +
            "-screen", "silkworm", "silver", "silverfish", "silverware",
            "simpleton", "simplicity", "simulation", "simulator", "sin",
            "sink", "sinker", "sinkhole", "sinner", "sinus", "sinusitis",
            "siphon", "sirloin", "sister", "sisterhood", "sister-in-law",
            "sitcom", "six-pack", "six-shooter", "skateboard", "skater",
            "skeleton", "skeptic", "skepticism", "skier", "skillet", "skin",
            "skinhead", "skipper", "skirmish", "skirt", "skit", "skulduggery"
            , "skull", "skullcap", "skunk", "sky", "skydiver", "skyjacker",
            "skylight", "skyscraper", "slab", "slacker", "slammer", "slang",
            "slaughterhouse", "slave", "slavery", "sledgehammer", "sleeper",
            "sleepwalker", "sleepwear", "sleepyhead", "sleuth", "slider",
            "slime", "slingshot", "slip", "slipcover", "slipknot", "slipper",
            "sliver", "slob", "slogan", "slope", "slot", "sloth",
            "slothfulness", "slowpoke", "sludge", "slug", "slugger",
            "sluggishness", "slum", "slumlord", "slump", "slyness", "smack",
            "smallness", "smallpox", "smart-ass", "smartness", "smile", "smog"
            , "smoke", "smokehouse", "smoker", "smokestack", "smooch",
            "smoothness", "smorgasbord", "smugness", "snack", "snag", "snail"
            , "snake", "snakebite", "snap", "snapdragon", "sneaker", "snob",
            "snobbery", "snobbishness", "snooper", "snorer", "snorkel", "snot"
            , "snotty", "snow", "snowball", "snowfall", "snowflake", "snowman"
            , "snowmobile", "snowplow", "snowshoe", "snowstorm", "snub-nosed"
            , "soap", "soapbox", "soapsuds", "soberness", "sobriety", "soccer"
            , "socialism", "society", "sociologist", "sociology", "sociopath"
            , "sock", "socket", "soda", "sodium", "sofa", "softball",
            "software", "soil", "soloist", "somebody", "someday", "somehow",
            "someone", "someplace", "somersault", "something", "sometime",
            "sometimes", "someway", "somewhat", "somewhere", "son", "sonar",
            "song", "songbird", "sophomore", "soprano", "sorbet", "sorcerer",
            "sorceress", "sorcery", "sordidness", "soreness", "sorrow",
            "sortie", "soul", "sound", "soup", "source", "sourdough",
            "southerner", "southpaw", "souvenir", "soy", "soybean", "spa",
            "space", "space-age", "spacecraft", "spaceman", "spaceship",
            "spacesuit", "spacewalk", "spaciousness", "spaghetti", "spaniel",
            "spanish", "spareribs", "spark", "sparkler", "sparrow", "spat",
            "spatula", "speakeasy", "speaker", "specialist", "specialization"
            , "species", "specimen", "speckle", "specs", "spectacle",
            "spectator", "spectroscope", "spectrum", "speculator", "speech",
            "speedboat", "speedometer", "speedway", "speedy", "sperm",
            "sphere", "spice", "spider", "spike", "spinach", "spine",
            "spirits", "spit", "spitball", "spittoon", "spleen", "splendor",
            "splint", "splinter", "spokesman", "spokesperson", "spokeswoman",
            "sponge", "spoon", "spoonful", "sport", "sportscast",
            "sportscaster", "sportsman", "sportsmanship", "sportswear",
            "sportswoman", "spot", "spotlight", "spouse", "spout", "sprawl",
            "spray", "spring", "springboard", "springtime", "sprinkler",
            "sprint", "sprinter", "sprite", "sprocket", "sprout", "spruce",
            "spy", "spyglass", "squabble", "squad", "squadron", "squalor",
            "square", "squash", "squaw", "squeamishness", "squeegee", "squid"
            , "squirrel", "stabilizer", "stack", "stadium", "staff", "staffer"
            , "stag", "stage", "stagecoach", "stagehand", "stain", "staircase"
            , "stairway", "stairwell", "stake", "stakeout", "stalemate",
            "stalker", "stammerer", "stampede", "stance", "standby", "stand" +
            "-in", "standout", "staple", "stapler", "star", "starboard",
            "starch", "stardom", "starfish", "starlet", "starlight", "starter"
            , "starvation", "statement", "stationery", "statistic",
            "statistician", "statistics", "statue", "statute", "steak",
            "steakhouse", "steam", "steamboat", "steamer", "steamroller",
            "steel", "steeple", "stem", "stenographer", "stenography",
            "stepbrother", "stepchild", "stepchildren", "stepdaughter",
            "stepfather", "stepladder", "stepmother", "stepparent",
            "steppingstone", "stepsister", "stepson", "stereo", "stereoscope"
            , "stereotype", "sterilization", "sternum", "steroid",
            "stethoscope", "stew", "steward", "stewardess", "stick", "sticker"
            , "stimulation", "stimulus", "stinger", "stingray", "stink",
            "stinker", "stint", "stipend", "stipulation", "stirrup", "stitch"
            , "stock", "stockade", "stockbroker", "stockholder", "stockiness"
            , "stocking", "stockpile", "stockroom", "stock-still", "stockyard"
            , "stoicism", "stomach", "stomachache", "stone", "stooge", "stool"
            , "stoplight", "stopover", "stopwatch", "storage", "store",
            "storefront", "storehouse", "storekeeper", "storeroom", "stork",
            "storm", "story", "storybook", "storyteller", "stoutness", "stove"
            , "stovepipe", "stowaway", "straightjacket", "strand",
            "strangeness", "stranger", "strap", "strapless", "stratosphere",
            "stratum", "straw", "strawberry", "stream", "streamer", "street",
            "streetcar", "streetlight", "strength", "streptococcus",
            "streptomycin", "stress", "stretcher", "strictness", "strife",
            "strikeout", "striker", "string", "stringer", "stripe", "stroller"
            , "stubble", "stubbornness", "stucco", "stud", "student", "studio"
            , "stutterer", "sty", "styrofoam", "sub", "submarine", "suburb",
            "suburbanite", "suburbia", "subway", "succotash", "sucker", "suds"
            , "suffix", "sugar", "sugarcane", "sugarcoat", "suicide", "suit",
            "sulfur", "summer", "summerhouse", "summertime", "sun",
            "sunbather", "sunbeam", "sunblock", "sunbonnet", "sunburn",
            "sundae", "sunfish", "sunflower", "sunglasses", "sunlamp",
            "sunlight", "sunrise", "sunroof", "sunscreen", "sunset",
            "sunshine", "sunspot", "sunstroke", "suntan", "sunup", "super",
            "superhighway", "superhuman", "superman", "supermarket",
            "supernova", "superpower", "superscript", "superstar",
            "superstition", "supertanker", "supervisor", "supper",
            "supplement", "supplies", "supporter", "surf", "surface",
            "surfboard", "surfer", "surfing", "surgeon", "surgery",
            "surliness", "surname", "survivor", "sushi", "suspect",
            "suspenders", "suspense", "suspicion", "swag", "swagger", "swamp"
            , "swan", "swatch", "swatter", "sweat", "sweater", "sweatshirt",
            "sweatshop", "sweeper", "sweetener", "sweet-talk", "swimmer",
            "swimsuit", "swindler", "swine", "swinger", "switch",
            "switchblade", "switchboard", "switch-hitter", "sword",
            "swordfish", "swordplay", "swordsman", "syllable", "syllabus",
            "symbol", "symbolism", "symmetry", "sympathizer", "sympathy",
            "symphony", "syntax", "synthesizer", "syringe", "syrup", "table",
            "tablecloth", "tablespoon", "tablet", "tableware", "tachometer",
            "tack", "tackle", "taco", "tadpole", "taffy", "tag", "tail",
            "tailgate", "tailor", "tailpipe", "tailspin", "tailwind", "talc",
            "talker", "tambourine", "tan", "tang", "tangelo", "tangent",
            "tangerine", "tango", "tank", "tanner", "tannery", "tantrum",
            "tap-dancer", "tape", "tapestry", "tapeworm", "tapioca", "tapir",
            "tarantula", "target", "tariff", "tarp", "tart", "taskmaster",
            "taster", "tattoo", "taurus", "taxi", "taxidermist", "tea",
            "teacher", "teacup", "teakettle", "teammate", "teamster",
            "teamwork", "teapot", "tear", "teardrop", "tearful", "tearfully",
            "tearjerker", "teaspoon", "teaspoonful", "tech", "technician",
            "technique", "technologist", "technology", "tedium", "teen",
            "teenager", "teepee", "teeth", "teetotaler", "teflon",
            "telecommunications", "telegram", "telegraph", "telepathy",
            "telephone", "telescope", "television", "teller", "temper",
            "temperance", "temperature", "temptation", "tenant", "tenderfoot"
            , "tenderloin", "tendinitis", "tendon", "tenet", "tennis", "tenor"
            , "tenseness", "tension", "tent", "tentacle", "tenure", "tequila"
            , "termination", "terminology", "termite", "terrain", "terrapin",
            "terrier", "test", "testosterone", "tether", "text", "textbook",
            "textile", "texture", "thankfulness", "thanks", "thanksgiving",
            "theater", "theatre", "theft", "theme", "theology", "theorem",
            "theoretician", "theorist", "theory", "therapist", "therapy",
            "thermodynamics", "thermometer", "thermos", "thermostat",
            "thesaurus", "thesis", "thief", "thigh", "thighbone", "thimble",
            "thinker", "thinner", "thirst", "threat", "threesome", "thresh",
            "thresher", "threshold", "thriftiness", "thriller", "throat",
            "throwback", "thud", "thug", "thumb", "thumbnail", "thumbscrew",
            "thumbtack", "thump", "thunder", "thunderbolt", "thundercloud",
            "thundershower", "thunderstorm", "tick", "ticker", "ticket", "tic" +
            "-tac-toe", "tiddlywinks", "tide", "tidewater", "tie", "tiger",
            "tightrope", "tights", "tightwad", "tigress", "tile", "tiling",
            "tiller", "timber", "timekeeper", "timepiece", "timer", "tin",
            "tinder", "tinderbox", "tinfoil", "tinsel", "tire", "toad",
            "toadstool", "toaster", "tobacco", "toddler", "toe", "toenail",
            "toffee", "tofu", "toilet", "tollbooth", "tomahawk", "tomato",
            "tomb", "tomboy", "tombstone", "tomcat", "tongs", "tongue",
            "tongue-lashing", "tonic", "tonsil", "tonsillectomy",
            "tonsillitis", "tool", "toolbox", "tooth", "toothache",
            "toothbrush", "toothpaste", "toothpick", "top", "topaz", "topcoat"
            , "topic", "topographer", "topping", "torpedo", "tortoise",
            "toucan", "toupee", "tour", "tourism", "tourist", "tournament",
            "tourniquet", "towel", "tower", "town", "toxin", "toy", "tracer",
            "trachea", "track", "track-and-field", "tracker", "traction",
            "tractor", "trademark", "trader", "traffic", "trail",
            "trailblazer", "trailer", "train", "trainee", "trainer", "trait",
            "traitor", "tramp", "trampoline", "trance", "transgressor",
            "transience", "transient", "transistor", "transition",
            "translator", "transmission", "transmitter", "transparency",
            "transportation", "trap", "trapdoor", "trapeze", "trapezoid",
            "trash", "trauma", "traveler", "traveller", "tray", "treachery",
            "treadmill", "treason", "treasure", "treasurer", "treasury",
            "treat", "treatment", "treble", "tree", "treeless", "trefoil",
            "trek", "tremor", "trench", "trend", "trespasser", "triad",
            "trial", "triangle", "triathlon", "tribe", "tribune", "triceps",
            "tricycle", "trigger", "trigonometry", "trio", "trip", "tripod",
            "troll", "trolley", "trombone", "trombonist", "troop", "trooper",
            "trout", "trowel", "truck", "trucker", "trunk", "truth", "t-shirt"
            , "tuba", "tube", "tuber", "tugboat", "tuition", "tulip",
            "tumbleweed", "tummy", "tumor", "tuna", "tundra", "tuner",
            "tungsten", "tunnel", "turbine", "turbojet", "turf", "turkey",
            "turnpike", "turpentine", "turpitude", "turquoise", "turtle",
            "turtledove", "turtleneck", "tutor", "tutorial", "tutti-frutti",
            "tutu", "tux", "tuxedo", "tv", "tweed", "tween", "tweet", "twerp"
            , "twig", "twilight", "twill", "twin", "twinkle", "twit", "tycoon"
            , "tyke", "type", "typesetter", "typewriter", "typhoid", "typhoon"
            , "typist", "typo", "typographer", "typography", "tyranny",
            "tyrant", "ubiquity", "u-boat", "udder", "ufo", "ugliness",
            "ukulele", "ulcer", "ultrasound", "umbrella", "ump", "umpire",
            "uncle", "underachiever", "underarm", "underbelly", "underclass",
            "underclassman", "underclothes", "underclothing", "underdog",
            "undergarment", "underpants", "underpass", "undershirt",
            "undershorts", "underwear", "unicorn", "unicycle", "uniform",
            "union", "unit", "universe", "university", "upholstery",
            "uppermost", "upstairs", "upstart", "uranus", "urchin", "urinal",
            "urinalysis", "urination", "urine", "user", "usher", "utensil",
            "uteri", "uterus", "utopia", "u-turn", "uvula", "vacancy",
            "vacation", "vaccination", "vaccine", "vacuum", "vagrant",
            "valedictorian", "valentine", "valet", "valley", "valor", "value"
            , "values", "valve", "vampire", "van", "vandal", "vandalism",
            "vane", "vanilla", "vanity", "vapidity", "vapor", "vaporizer",
            "variable", "variant", "variation", "varmint", "varnish",
            "varsity", "vase", "vasectomy", "vaseline", "vat", "vault", "veal"
            , "vector", "vegan", "vegetable", "vegetarian", "vegetarianism",
            "vegetation", "veggie", "vehemence", "vehicle", "veil", "vein",
            "velcro", "vellum", "velour", "velvet", "vender", "vendor",
            "vengeance", "venom", "vent", "ventilate", "ventilation",
            "ventilator", "venus", "veranda", "verb", "verdict", "verdigris",
            "vermin", "vessel", "vest", "vestibule", "vet", "veteran",
            "veterinarian", "vial", "vibraphone", "vice", "victim", "victor",
            "victory", "video", "videodisc", "videotape", "viewer",
            "viewfinder", "viewpoint", "vigil", "vigilance", "vigilante",
            "vignette", "vigor", "viking", "villa", "village", "villager",
            "villain", "vine", "vinegar", "vineyard", "vinyl", "viola",
            "violet", "violin", "violinist", "violist", "violoncello", "viper"
            , "virgo", "virtue", "virtuoso", "virus", "visa", "visibility",
            "vision", "visionary", "visitation", "visitor", "visor", "vista",
            "vitamin", "vocabulary", "vocation", "vodka", "vogue", "voice",
            "void", "volcano", "volley", "volleyball", "volt", "voltage",
            "volunteer", "vomit", "voodoo", "voter", "voucher", "vow", "vowel"
            , "voyage", "voyager", "vulgarity", "wacko", "wafer", "waffle",
            "wage", "wagon", "waist", "waistband", "waistline", "waiter",
            "waitress", "waiver", "walker", "walkie-talkie", "walkway", "wall"
            , "wallaby", "wallboard", "wallet", "wallflower", "wallpaper",
            "wall-to-wall", "walnut", "walrus", "waltz", "war", "warden",
            "wardrobe", "wardroom", "ware", "warehouse", "warfare", "warhead"
            , "warlock", "warlord", "warmonger", "warning", "warrior",
            "warship", "wart", "warthog", "washbasin", "washboard", "washbowl"
            , "washcloth", "washer", "washtub", "wasp", "waste", "wastebasket"
            , "wasteland", "watch", "watchband", "watchdog", "watchman",
            "watchtower", "water", "watercolor", "watercress", "waterfall",
            "watermark", "watermelon", "waterworks", "watt", "wattage", "wax"
            , "weakling", "weapon", "weaponry", "weasel", "weather", "web",
            "website", "wedding", "weed", "week", "weekday", "weekend",
            "weeknight", "weevil", "weight", "weirdness", "weirdo", "welfare"
            , "welt", "wench", "werewolf", "whale", "whaler", "wharf", "wheat"
            , "wheel", "wheelbarrow", "wheelchair", "wheeler-dealer", "whey",
            "whiff", "whim", "whimper", "whimsy", "whirlpool", "whirlwind",
            "whisk", "whiskey", "whistle", "whistle-blower", "whole-wheat",
            "widow", "widower", "width", "wife", "wig", "wildcat",
            "wildebeest", "wilderness", "wildfire", "wildflower", "wildlife",
            "wile", "wimp", "windbag", "windbreak", "windbreaker", "windburn"
            , "windfall", "windjammer", "windmill", "window", "windowpane",
            "windowsill", "windpipe", "windshield", "windsock", "windstorm",
            "windsurfing", "wine", "wineglass", "winery", "wing", "wingspan",
            "winner", "winter", "wintergreen", "wiper", "wire", "wiretap",
            "wiring", "wisdom", "wisecrack", "wish", "wishbone", "wit",
            "witch", "witchcraft", "witticism", "wolf", "wolverine", "woman",
            "womanhood", "womb", "wood", "woodchuck", "woodpecker", "wool",
            "word", "workaholic", "workbench", "workbook", "worker", "worm",
            "worshiper", "wreck", "wreckage", "wrecker", "wrench", "wrestler"
            , "wrinkle", "wristband", "wristwatch", "write-off", "writer",
            "wrongdoing", "wuss", "xenophobia", "xerography", "xerox", "x-ray"
            , "xylophone", "yacht", "yachtsman", "yak", "yam", "yankee",
            "yard", "yardage", "yardstick", "yarn", "yawn", "year", "yearbook"
            , "yeast", "yodeler", "yoga", "yogurt", "yokel", "yolk",
            "youngster", "youth", "yo-yo", "zap", "zeal", "zealot", "zebra",
            "zen", "zenith", "zephyr", "zeppelin", "zinc", "zinger", "zipper"
            , "zirconium", "zit", "zombie", "zoo", "zucchini", "zygote"};

    private static String getRandomString(String[] strings) {
        int rand = (int) (Math.random() * strings.length);
        return strings[rand];
    }

    public static void main(String[] args) {
        int times = 1;
        try {
            times = Integer.parseInt(args[0]);
        } catch (NumberFormatException e)
        {
            System.out.println("integers are the only valid arguments");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            //
        }
        for (int i = 1; i <= times; i++) {
            System.out.printf("%s-%s%n", getRandomString(adjectives),
                    getRandomString(nouns));
        }
    }
}