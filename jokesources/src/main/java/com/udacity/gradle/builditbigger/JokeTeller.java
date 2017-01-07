package com.udacity.gradle.builditbigger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeTeller {

    public static String getJoke() {

        // Collection of the jokes
        List<String> jokes = new ArrayList<>();
        jokes.add("I dreamt I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.");
        jokes.add("Two Elephants meet a totally naked guy. After a while one elephant says to the other: \"I really don't get how he can feed himself with that thing!\"");
        jokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        jokes.add("Crowded gyms with occupied machines are the worst because we're there to lose weight, not gain wait.");
        jokes.add("I try not to spend too much time online but Wi-Fight it?");
        jokes.add("To make a storrrrrrrrrrrrrrrrrrrry short.");
        jokes.add("Doctor: Hello, did you come to see me with an eye problem?\nPatient: Wow, yes, how can you tell?\nDoctor: Because you came in through the window instead of the door.");
        jokes.add("Police officer: \"Can you identify yourself, sir?\"\nDriver pulls out his mirror and says: \"Yes, it's me.\"");
        jokes.add("My wife's cooking is so bad we usually pray after our food.");
        jokes.add("I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?");
        jokes.add("When my wife starts to sing I always go out and do some garden work so our neighbors can see there's no domestic violence going on.");
        jokes.add("At a first date:\nHe: \"I work with animals every day!\"\nShe: \"Oh how sweet! What is it that you do?\"\nHe: \"I'm a butcher.\"");
        jokes.add("It is so cold outside I saw a politician with his hands in his own pockets.");
        jokes.add("Pessimist: \"Things just can't get any worse!\"\nOptimist: \"Nah, of course they can!\"");
        jokes.add("How do you tell that a crab is drunk? It walks forwards.");
        jokes.add("I'm selling my talking parrot. Why? Because yesterday, the bastard tried to sell me.");
        jokes.add("A woman in a bikini reveals about 90% of her body.... and yet most men are so polite they only look at the covered parts.");
        jokes.add("A wife complains to her husband: \"Just look at that couple down the road, how lovely they are. He keeps holding her hand, kissing her, holding the door for her, why can't you do the same?\"\n\"Are you mad? I barely know the woman!\"");
        jokes.add("Why haven't you ever seen any elephants hiding up trees? Because they're really, really good at it.");
        jokes.add("I asked my North Korean friend how it was to live in North Korea. He said he can't complain.");
        jokes.add("I got another letter from this lawyer today. It said \"Final Notice\". Good that he will not bother me anymore.");

        // Randomly create an integer according to the size of the String array
        int rnd = new Random().nextInt(jokes.size());

        return jokes.get(rnd);
    }
}
