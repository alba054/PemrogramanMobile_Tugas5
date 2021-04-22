package com.example.tugas5;

import java.util.ArrayList;

public class AnimeData {
    private static String TITLE [] = {
            "Cowboy Bebop",
            "Go Toubun no Hanayome",
            "Hyouka",
            "Oregairu",
            "Fullmetal Alchemist",
            "Naruto Shippuden",
            "Steins Gate",
            "Tensei Shitara Slime Datta Ken",
            "Gintama",
            "Fate Zero"
    };

    private static String GENRE [] = {
            "Action, Adventure, Comedy, Drama, Space",
            "Harem, Comedy, School, Romance Shounen",
            "Mystery, School, Slice of Life",
            "Slice of Life, Comedy, Drama, Romance, School",
            "Action, Magic, Military, Drama, Comedy, Shounen, Fantasy, Adventure",
            "Action, Adventure, Comedy, Super Power, Martial Arts, Shounen",
            "Sci-Fi, Psychological, Drama, Thriller",
            "Action, Adventure, Comedy, Demons, Magic, Fantasy",
            "Action, Comedy, Historical, Parody, Samurai, Sci-Fi, Shounen",
            "Action, Supernatural, Magic, Fantasy"
    };

    private static String SYNOPSIS [] = {
            "In the year 2071, humanity has colonized several of the planets and moons of the solar system leaving the now uninhabitable surface of planet Earth behind. The Inter Solar System Police attempts to keep peace in the galaxy, aided in part by outlaw bounty hunters, referred to as \"Cowboys.\" The ragtag team aboard the spaceship Bebop are two such individuals. Mellow and carefree Spike Spiegel is balanced by his boisterous, pragmatic partner Jet Black as the pair makes a living chasing bounties and collecting rewards. Thrown off course by the addition of new members that they meet in their travels Ein, a genetically engineered, highly intelligent Welsh Corgi; femme fatale Faye Valentine, an enigmatic trickster with memory loss; and the strange computer whiz kid Edward Wong the crew embarks on thrilling adventures that unravel each member's dark and mysterious past little by little. Well-balanced with high density action and light-hearted comedy, Cowboy Bebop is a space Western classic and an homage to the smooth and improvised music it is named after.",
            "Fuutarou Uesugi is an ace high school student, but leads an otherwise tough life. His standoffish personality and reclusive nature have left him friendless, and his father is debt-ridden, forcing his family to scrape by. One day during his lunch break, Uesugi argues with a female transfer student who has claimed \nhis seat,\n leading both of them to dislike each other. That same day, he is presented with a golden opportunity to clear his family's debt: a private tutoring gig for a wealthy family's daughter, with a wage of five times the market price. He accepts the proposal, but is horrified to discover that the client, Itsuki Nakano, is the girl he confronted earlier! After unsuccessfully trying to get back on Itsuki's good side, Uesugi finds out that his problems don't end there: Itsuki is actually a quintuplet, so in addition to her, he must also tutor her sisters Miku, Yotsuba, Nino, and Ichika who, despite the very real threat of flunking, want nothing to do with a tutor. However, his family's livelihood is on the line so Uesugi pushes on, adamant in his resolve to rid the sisters of their detest for studying and successfully lead them to graduation.",
            "Energy-conservative high school student Houtarou Oreki ends up with more than he bargained for when he signs up for the Classics Club at his sister's behest\\u2014especially when he realizes how deep-rooted the club's history really is. Begrudgingly, Oreki is dragged into an investigation concerning the 45-year-old mystery that surrounds the club room. Accompanied by his fellow club members, the knowledgeable Satoshi Fukube, the stern but benign Mayaka Ibara, and the ever-curious Eru Chitanda, Oreki must combat deadlines and lack of information with resourcefulness and hidden talent, in order to not only find the truth buried beneath the dust of works created years before them, but of other small side cases as well. Based on the award-winning Koten-bu light novel series, and directed by Yasuhiro Takemoto of Suzumiya Haruhi no Shoushitsu, Hyouka shows that normal life can be full of small mysteries, be it family history, a student film, or even the withered flowers that make up a ghost story.",
            "Hachiman Hikigaya is an apathetic high school student with narcissistic and semi-nihilistic tendencies. He firmly believes that joyful youth is nothing but a farce, and everyone who says otherwise is just lying to themselves. In a novel punishment for writing an essay mocking modern social relationships, Hachiman's teacher forces him to join the Volunteer Service Club, a club that aims to extend a helping hand to any student who seeks their support in achieving their goals. With the only other club member being the beautiful ice queen Yukino Yukinoshita, Hachiman finds himself on the front line of other people's problems\\u2014a place he never dreamed he would be. As Hachiman and Yukino use their wits to solve many students' problems, will Hachiman's rotten view of society prove to be a hindrance or a tool he can use to his advantage?",
            "In order for something to be obtained, something of equal value must be lost.\n Alchemy is bound by this Law of Equivalent Exchange something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist. Three years of searching later, the brothers seek the Philosopher's Stone, a mythical relic that allows an alchemist to overcome the Law of Equivalent Exchange. Even with military allies Colonel Roy Mustang, Lieutenant Riza Hawkeye, and Lieutenant Colonel Maes Hughes on their side, the brothers find themselves caught up in a nationwide conspiracy that leads them not only to the true nature of the elusive Philosopher's Stone, but their country's murky history as well. In between finding a serial killer and racing against time, Edward and Alphonse must ask themselves if what they are doing will make them human again... or take away their humanity.",
            "It has been two and a half years since Naruto Uzumaki left Konohagakure, the Hidden Leaf Village, for intense training following events which fueled his desire to be stronger. Now Akatsuki, the mysterious organization of elite rogue ninja, is closing in on their grand plan which may threaten the safety of the entire shinobi world.\n" +
                    "\n" +
                    "Although Naruto is older and sinister events loom on the horizon, he has changed little in personality—still rambunctious and childish—though he is now far more confident and possesses an even greater determination to protect his friends and home. Come whatever may, Naruto will carry on with the fight for what is important to him, even at the expense of his own body, in the continuation of the saga about the boy who wishes to become Hokage.",
            "The self-proclaimed mad scientist Rintarou Okabe rents out a room in a rickety old building in Akihabara, where he indulges himself in his hobby of inventing prospective \"future gadgets\" with fellow lab members: Mayuri Shiina, his air-headed childhood friend, and Hashida Itaru, a perverted hacker nicknamed \"Daru.\" The three pass the time by tinkering with their most promising contraption yet, a machine dubbed the \"Phone Microwave,\" which performs the strange function of morphing bananas into piles of green gel.\n" +
                    "\n" +
                    "Though miraculous in itself, the phenomenon doesn't provide anything concrete in Okabe's search for a scientific breakthrough; that is, until the lab members are spurred into action by a string of mysterious happenings before stumbling upon an unexpected success—the Phone Microwave can send emails to the past, altering the flow of history.\n" +
                    "\n" +
                    "Adapted from the critically acclaimed visual novel by 5pb. and Nitroplus, Steins;Gate takes Okabe through the depths of scientific theory and practicality. Forced across the diverging threads of past and present, Okabe must shoulder the burdens that come with holding the key to the realm of time.",
            "Thirty-seven-year-old Satoru Mikami is a typical corporate worker, who is perfectly content with his monotonous lifestyle in Tokyo, other than failing to nail down a girlfriend even once throughout his life. In the midst of a casual encounter with his colleague, he falls victim to a random assailant on the streets and is stabbed. However, while succumbing to his injuries, a peculiar voice echoes in his mind, and recites a bunch of commands which the dying man cannot make sense of.\n" +
                    "\n" +
                    "When Satoru regains consciousness, he discovers that he has reincarnated as a goop of slime in an unfamiliar realm. In doing so, he acquires newfound skills—notably, the power to devour anything and mimic its appearance and abilities. He then stumbles upon the sealed Catastrophe-level monster \"Storm Dragon\" Veldora who had been sealed away for the past 300 years for devastating a town to ashes. Sympathetic to his predicament, Satoru befriends him, promising to assist in destroying the seal. In return, Veldora bestows upon him the name Rimuru Tempest to grant him divine protection.\n" +
                    "\n" +
                    "Now, liberated from the mundanities of his past life, Rimuru embarks on a fresh journey with a distinct goal in mind. As he grows accustomed to his new physique, his gooey antics ripple throughout the world, gradually altering his fate.\n",
            "The Amanto, aliens from outer space, have invaded Earth and taken over feudal Japan. As a result, a prohibition on swords has been established, and the samurai of Japan are treated with disregard as a consequence.\n" +
                    "\n" +
                    "However one man, Gintoki Sakata, still possesses the heart of the samurai, although from his love of sweets and work as a yorozuya, one might not expect it. Accompanying him in his jack-of-all-trades line of work are Shinpachi Shimura, a boy with glasses and a strong heart, Kagura with her umbrella and seemingly bottomless stomach, as well as Sadaharu, their oversized pet dog. Of course, these odd jobs are not always simple, as they frequently have run-ins with the police, ragtag rebels, and assassins, oftentimes leading to humorous but unfortunate consequences.\n" +
                    "\n" +
                    "Who said life as an errand boy was easy?",
            "With the promise of granting any wish, the omnipotent Holy Grail triggered three wars in the past, each too cruel and fierce to leave a victor. In spite of that, the wealthy Einzbern family is confident that the Fourth Holy Grail War will be different; namely, with a vessel of the Holy Grail now in their grasp. Solely for this reason, the much hated \"Magus Killer\" Kiritsugu Emiya is hired by the Einzberns, with marriage to their only daughter Irisviel as binding contract.\n" +
                    "\n" +
                    "Kiritsugu now stands at the center of a cutthroat game of survival, facing off against six other participants, each armed with an ancient familiar, and fueled by unique desires and ideals. Accompanied by his own familiar, Saber, the notorious mercenary soon finds his greatest opponent in Kirei Kotomine, a priest who seeks salvation from the emptiness within himself in pursuit of Kiritsugu.\n" +
                    "\n" +
                    "Based on the light novel written by Gen Urobuchi, Fate/Zero depicts the events of the Fourth Holy Grail War—10 years prior to Fate/stay night. Witness a battle royale in which no one is guaranteed to survive."
    };

    private  static  int AnimeImage[] = {
            R.drawable.cowboy_bebop,
            R.drawable.go_toubun,
            R.drawable.hyouka,
            R.drawable.oregairu,
            R.drawable.fullmetal_alchemist,
            R.drawable.naruto_shippuden,
            R.drawable.steins_gate,
            R.drawable.slime,
            R.drawable.gintama,
            R.drawable.fate_zero
    };

    public static ArrayList<Anime> getListData(){
      ArrayList<Anime> list = new ArrayList<>();
      for (int position = 0; position < TITLE.length; position++){
          Anime anime = new Anime();
          anime.setName(TITLE[position]);
          anime.setGenre(GENRE[position]);
          anime.setDetail(SYNOPSIS[position]);
          anime.setPhoto(AnimeImage[position]);
          list.add(anime);
      }
      return list;
    };
}
