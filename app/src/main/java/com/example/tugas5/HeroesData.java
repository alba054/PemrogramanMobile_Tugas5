package com.example.tugas5;

import java.util.ArrayList;

public class HeroesData {
    private static String Judul [] = {
            "Cowboy Bebop",
            "Go Toubun no Hanayome",
            "Hyouka",
            "Oregairu",
            "Fullmetal Alchemist"


    };

    private static String Genre [] = {

            "Action, Adventure, Comedy, Drama, Space",
            "Harem, Comedy, School, Romance Shounen",
            "Mystery, School, Slice of Life",
            "Slice of Life, Comedy, Drama, Romance, School",
            "Action, Magic, Military, Drama, Comedy, Shounen, Fantasy, Adventure"

    };

    private static String Descrition [] = {
            "In the year 2071, humanity has colonized several of the planets and moons of the solar system leaving the now uninhabitable surface of planet Earth behind. The Inter Solar System Police attempts to keep peace in the galaxy, aided in part by outlaw bounty hunters, referred to as \"Cowboys.\" The ragtag team aboard the spaceship Bebop are two such individuals. Mellow and carefree Spike Spiegel is balanced by his boisterous, pragmatic partner Jet Black as the pair makes a living chasing bounties and collecting rewards. Thrown off course by the addition of new members that they meet in their travels Ein, a genetically engineered, highly intelligent Welsh Corgi; femme fatale Faye Valentine, an enigmatic trickster with memory loss; and the strange computer whiz kid Edward Wong the crew embarks on thrilling adventures that unravel each member's dark and mysterious past little by little. Well-balanced with high density action and light-hearted comedy, Cowboy Bebop is a space Western classic and an homage to the smooth and improvised music it is named after.",
            "Fuutarou Uesugi is an ace high school student, but leads an otherwise tough life. His standoffish personality and reclusive nature have left him friendless, and his father is debt-ridden, forcing his family to scrape by. One day during his lunch break, Uesugi argues with a female transfer student who has claimed \nhis seat,\n leading both of them to dislike each other. That same day, he is presented with a golden opportunity to clear his family's debt: a private tutoring gig for a wealthy family's daughter, with a wage of five times the market price. He accepts the proposal, but is horrified to discover that the client, Itsuki Nakano, is the girl he confronted earlier! After unsuccessfully trying to get back on Itsuki's good side, Uesugi finds out that his problems don't end there: Itsuki is actually a quintuplet, so in addition to her, he must also tutor her sisters Miku, Yotsuba, Nino, and Ichika who, despite the very real threat of flunking, want nothing to do with a tutor. However, his family's livelihood is on the line so Uesugi pushes on, adamant in his resolve to rid the sisters of their detest for studying and successfully lead them to graduation.",
            "Energy-conservative high school student Houtarou Oreki ends up with more than he bargained for when he signs up for the Classics Club at his sister's behest\\u2014especially when he realizes how deep-rooted the club's history really is. Begrudgingly, Oreki is dragged into an investigation concerning the 45-year-old mystery that surrounds the club room. Accompanied by his fellow club members, the knowledgeable Satoshi Fukube, the stern but benign Mayaka Ibara, and the ever-curious Eru Chitanda, Oreki must combat deadlines and lack of information with resourcefulness and hidden talent, in order to not only find the truth buried beneath the dust of works created years before them, but of other small side cases as well. Based on the award-winning Koten-bu light novel series, and directed by Yasuhiro Takemoto of Suzumiya Haruhi no Shoushitsu, Hyouka shows that normal life can be full of small mysteries, be it family history, a student film, or even the withered flowers that make up a ghost story.",
            "Hachiman Hikigaya is an apathetic high school student with narcissistic and semi-nihilistic tendencies. He firmly believes that joyful youth is nothing but a farce, and everyone who says otherwise is just lying to themselves. In a novel punishment for writing an essay mocking modern social relationships, Hachiman's teacher forces him to join the Volunteer Service Club, a club that aims to extend a helping hand to any student who seeks their support in achieving their goals. With the only other club member being the beautiful ice queen Yukino Yukinoshita, Hachiman finds himself on the front line of other people's problems\\u2014a place he never dreamed he would be. As Hachiman and Yukino use their wits to solve many students' problems, will Hachiman's rotten view of society prove to be a hindrance or a tool he can use to his advantage?",
            "In order for something to be obtained, something of equal value must be lost.\n Alchemy is bound by this Law of Equivalent Exchange something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist. Three years of searching later, the brothers seek the Philosopher's Stone, a mythical relic that allows an alchemist to overcome the Law of Equivalent Exchange. Even with military allies Colonel Roy Mustang, Lieutenant Riza Hawkeye, and Lieutenant Colonel Maes Hughes on their side, the brothers find themselves caught up in a nationwide conspiracy that leads them not only to the true nature of the elusive Philosopher's Stone, but their country's murky history as well. In between finding a serial killer and racing against time, Edward and Alphonse must ask themselves if what they are doing will make them human again... or take away their humanity."
    };

    private  static  int HeroImages[] = {
            R.drawable.cowboy_bebop,
            R.drawable.go_toubun,
            R.drawable.hyouka,
            R.drawable.oregairu,
            R.drawable.fullmetal_alchemist



    };

    public static ArrayList<Hero> getListData(){
      ArrayList<Hero> list = new ArrayList<>();
      for (int position = 0; position < Judul.length; position++){
          Hero hero = new Hero();
          hero.setName(Judul[position]);
          hero.setGenre(Genre[position]);
          hero.setDetail(Descrition[position]);
          hero.setPhoto(HeroImages[position]);
          list.add(hero);
      }
      return list;
    };
}
