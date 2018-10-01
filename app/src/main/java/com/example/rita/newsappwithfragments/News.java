package com.example.rita.newsappwithfragments;

public class News {

    private static String[] headlines = {
            "Article One",
            "Article Two",
            "Article Three",
            "Article Four",
            "Article Five"
    };

    private static String[] articles = {
            "Excepteur pour-over occaecat squid biodiesel umami gastropub, nulla laborum salvia dreamcatcher fanny pack. Ullamco culpa retro ea, trust fund excepteur eiusmod direct trade banksy nisi lo-fi cray messenger bag. Nesciunt esse carles selvage put a bird on it gluten-free, wes anderson ut trust fund twee occupy viral. Laboris small batch scenester pork belly, leggings ut farm-to-table aliquip yr nostrud iphone viral next level. Craft beer dreamcatcher pinterest truffaut ethnic, authentic brunch. Esse single-origin coffee banksy do next level tempor. Velit synth dreamcatcher, magna shoreditch in american apparel messenger bag narwhal PBR ennui farm-to-table.",
            "Vinyl williamsburg non velit, master cleanse four loko banh mi. Enim kogi keytar trust fund pop-up portland gentrify. Non ea typewriter dolore deserunt Austin. Ad magna ethical kogi mixtape next level. Aliqua pork belly thundercats, ut pop-up tattooed dreamcatcher kogi accusamus photo booth irony portland. Semiotics brunch ut locavore irure, enim etsy laborum stumptown carles gentrify post-ironic cray. Butcher 3 wolf moon blog synth, vegan carles odd future.",
            "Following the recommendations of an internal report, members of the VPD, sworn and civilian, will be able to consume cannabis while off-duty, however they are required to show up fit for work—or, in layman's terms, not high. This policy effectively opens the door to officer's now being able to treat conditions like post-traumatic stress disorder or physical ailments with weed.",
            "A landslide near the future location of the Site C hydroelectric dam forced the evacuation of several homes in the Peace River region Sunday afternoon.",
            "On Saturday, House Minority Leader Nancy Pelosi reacted to testimony from Brett Kavanaugh earlier in the week, claiming he had jeopardized his objectivity and adding that she believes he disqualified himself with statements attacking the Clintons and the Democrats."
    };

    public static String[] getHeadlines(){
        return headlines;
    };

    public static String getHeadline(int i){
        return headlines[i];
    }

    public static String getArticle(int i){
        return articles[i];
    }
}
