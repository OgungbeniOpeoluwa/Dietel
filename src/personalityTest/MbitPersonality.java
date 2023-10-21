package personalityTest;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MbitPersonality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        String[] result = question1();
        String[] result1 = question2();
        String[] result2 = question3();
        String[] result3 = question4();
        String[][] array = {result, result1, result2, result3};
        String[][] word = {{"E", "I"}, {"S", "N"}, {"T", "F"}, {"J", "P"}};
        int number = 0;
        int number2 = 0;
        String answer = "";

        System.out.println("Hello  " + name + " You selected: ");
        for (int count = 0; count < array.length; count++) {
            for (int counts = 0; counts < array[count].length; counts++) {
                String results = array[count][counts];
                if (results.startsWith("A.")) {
                    number++;
                } else if (results.startsWith("B.")) {
                    number2++;
                }
                System.out.println(results);
            }
            if (number > number2) {
                answer +=  word[count][0];
            } else {
                answer += word[count][1];
            }
            System.out.println("Number of A :" + number);
            System.out.println("Number of B :" + number2);
            number -= number;
            number2 -= number2;
            System.out.println();
        }
        String value = answer;
        response(value);
    }

    public static String[] question1() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. expend energy,enjoy groups      B.conserves energy ,enjoy-one on - one");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. expend energy,enjoy groups      B.conserves energy ,enjoy-one on - one");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. expend energy,enjoy groups ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. conserves energy ,enjoy-one on - one";

                    }
                }
                case 1 -> {
                    System.out.println("A. more outgoing,think out loud      B.more reserved,think to yourself");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. more outgoing,think out loud      B.more reserved,think to yourself");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. more outgoing,think out loud";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. more reserved,think to yourself";

                    }
                }
                case 2 -> {
                    System.out.println("A. seek many task , public activities , interaction with others     B. seek private, solitary activities with quiet to concentrate");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. seek many task , public activities , interaction with others     B. seek private, solitary activities with quiet to concentrate");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A.  seek many task , public activities , interaction with others";

                    } else if (input.equals("B")) {
                        array[count] = "B.  seek private, solitary activities with quiet to concentrate";
                    }
                }
                case 3 -> {
                    System.out.println("A. external,communicative,express yourself      B. internal,reticent,keep to yourself");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. external,communicative,express yourself      B. internal,reticent,keep to yourself");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. external,communicative,express yourself ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B.  internal,reticent,keep to yourself";

                    }
                }
                case 4 -> {
                    System.out.println("A. active, initiate      B. reflective, deliberate");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. active, initiate      B. reflective, deliberate");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A. active, initiate";

                    } else if (input.equals("B")) {
                        array[count] = "B. reflective, deliberate";

                    }
                }
            }
        }

        return array;
    }

    public static String[] question2() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. Interpret literally      B.look for meaning and possibilities");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. Interpret literally      B.look for meaning and possibilities");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A. Interpret literally";

                    } else if (input.equals("B")) {
                        array[count] = "B. look for meaning and possibilities";
                    }
                }
                case 1 -> {
                    System.out.println("A. Practical, realistic, experimental      B.imaginative,innovative,theoretical");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. Practical, realistic, experimental      B.imaginative,innovative,theoretical");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. Practical, realistic, experimental";

                    } else if (inputs.equals("B")) {
                        array[count] = "B.  imaginative,innovative,theoretical";

                    }
                }
                case 2 -> {
                    System.out.println("A. standard,usual,conventional      B. different,novel,unique");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. standard,usual,conventional      B. different,novel,unique");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  standard,usual,conventional";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. different,novel,unique";

                    }
                }
                case 3 -> {
                    System.out.println("A. focus on here-and-now     B. look to the future,global perspective,big picture");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. focus on here-and-now     B. look to the future,global perspective,big picture");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. focus on here-and-now";

                    } else if (inputs.equals("B")) {
                        array[count] = "B.  look to the future,global perspective,big picture";

                    }
                }
                case 4 -> {
                    System.out.println("A. facts, things,what is      B.idea,dreams,what could be,philosophical");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. facts, things,what is      B.idea,dreams,what could be,philosophical");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. facts, things,what is";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. idea,dreams,what could be,philosophical";
                    }
                }
            }
        }

        return array;
    }

    public static String[] question3() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. logical,thinking,questioning      B.empathetic, feeling,accommodating");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. logical,thinking,questioning      B.empathetic, feeling,accommodating");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  logical,thinking,questioning ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. empathetic, feeling,accommodating";

                    }
                }
                case 1 -> {
                    System.out.println("A. candid, straight-forward,frank      B.tactful,kind,encouraging");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. candid, straight-forward,frank      B.tactful,kind,encouraging");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. candid, straight-forward,frank ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. tactful,kind,encouraging";

                    }
                }
                case 2 -> {
                    System.out.println("A. firm,tend to criticize,,hold the line      B. gentle,tend to appreciate");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. firm,tend to criticize,,hold the line      B. gentle,tend to appreciate");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. firm,tend to criticize,,hold the line ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. gentle,tend to appreciate";
                    }
                }
                case 3 -> {
                    System.out.println("A. tough-minded,just      B.tender-hearted,merciful");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. tough-minded,just      B.tender-hearted,merciful");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. tough-minded,just";
                    } else if (inputs.equals("B")) {
                        array[count] = "B. .tender-hearted,merciful";
                    }
                }
                case 4 -> {
                    System.out.println("A. matter of fact,issue-oriented      B.sensitive ,people-oriented,compassionate");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. matter of fact,issue-oriented      B.sensitive ,people-oriented,compassionate");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  matter of fact,issue-oriented";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. .sensitive ,people-oriented,compassionate";

                    }
                }
            }


        }

        return array;
    }

    public static String[] question4() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. organized,orderly      B.flexible,adaptable");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. organized,orderly      B.flexible,adaptable");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. organized,orderly";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. flexible,adaptable";
                    }
                }
                case 1 -> {
                    System.out.println("A. plan schedule     B. unplanned,spontaneous");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. plan schedule     B. unplanned,spontaneous");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. plan schedule  ";
                    } else if (inputs.equals("B")) {
                        array[count] = "B. unplanned,spontaneous";
                    }
                }
                case 2 -> {
                    System.out.println("A. regulated structured      B.easy going,live and let live");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. regulated structured      B.easy going,live and let live");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. regulated structured";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. easy going,live and let live ";

                    }
                }
                case 3 -> {
                    System.out.println("A. preparation, plan ahead     B. go with the flow,adapt as you go");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. preparation, plan ahead     B. go with the flow,adapt as you go");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  preparation, plan ahead ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. go with the flow,adapt as you go";

                    }
                }
                case 4 -> {
                    System.out.println("A. Control, govern      B.latitude, freedom");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. Control, govern      B.latitude, freedom");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A. control,govern";
                    } else if (input.equals("B")) {
                        array[count] = "B. latitude,freedom";
                    }
                }
            }

        }

        return array;
    }

    public static void response(String words) {
        switch (words) {
            case "INTJ" -> System.out.print("""
                    INTJ
                      Architect
                       An Architect (INTJ) is a person with the Introverted, 
                       Intuitive, Thinking, and Judging personality traits. These thoughtful tacticians love perfecting the details of life, 
                       applying creativity and rationality to everything they do. Their inner world is often a private, complex one.
                       Summary of Architect
                          Architects question everything. Many personality types trust the status quo, relying on conventional wisdom and other people’s expertise to
                          guide their lives. But ever-skeptical Architects prefer to make their own discoveries. In their quest to find better ways of doing things, 
                          they aren’t afraid to break the rules or risk disapproval – in fact, they rather enjoy it.
                          Architects aren’t known for being warm and fuzzy.They tend to prioritize rationality and success over politeness and pleasantries – 
                          in other words, they’d rather be right than popular.
                          Architects can be both the boldest of dreamers and the bitterest of pessimists.They believe that, through willpower and intelligence, 
                          they can achieve even the most challenging goals.
                          WEAKNESS
                          Architects might be knowledgeable, but they’re not infallible. Their self-assurance can blind them to useful input from other people – especially 
                          anyone they deem to be intellectually inferior.
                          For Architects, rationality is king. But emotional context often matters more than people with this personality type care to admit. Architects can get 
                          impatient with anyone who seems to value feelings more than facts. Unfortunately, ignoring emotion is its own type of bias – one that can cloud Architects’ judgment.
                          Architects hate blindly following anything without understanding why. This includes restrictions and the authority figures who impose them. People with this personality 
                          type can get caught up in arguing about useless rules and regulations – but sometimes these battles are distractions from more important matters.
                          CONCLUSION:
                          Armed with powerful intellects and strategic minds, Architect (INTJ) personalities can outmaneuver obstacles that seem unbeatable to most. 
                          But Architects’ strengths, when misunderstood, can turn into weaknesses – and keep them from reaching their full potential.""");
            case "INTP" -> System.out.print("""
                    INTP
                       LOGICIAN
                       A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits. These flexible thinkers enjoy taking an unconventional
                       approach to many aspects of life.They often seek out unlikely paths, mixing willingness to experiment with personal creativity
                       LOGICIAN SUMMARY
                       * The Life of the Mind
                         Logicians often lose themselves in thought – which isn’t necessarily a bad thing. 
                         People with this personality type hardly ever stop thinking. From the moment they wake up, their minds buzz with ideas, questions, and insights. 
                         At times, they may even find themselves conducting full-fledged debates in their own heads..
                         * Mysteries of the Universe
                           People with this personality type want to understand everything in the universe, but one area in particular tends to mystify them: human nature. As their name suggests,
                           Logicians feel most at home in the realm of logic and rationality. As a result, they can find themselves baffled by the illogical,
                           irrational ways that feelings and emotions influence people’s behavior – including their own.
                           WEAKNESS
                           Disconnected – Logicians can get lost in their own train of thought, even when they’re with other people. When these personalities finally resurface with something to say, 
                           they may find that the conversation has moved on without them. This can cause them to feel disconnected from other people, especially in large social gatherings.
                           Insensitive – People with this personality type see rationality as the key to a better, happier world. At times, they may underestimate the importance of such irrational
                           values as emotion, compassion, etiquette, and tradition. As a result, they may inadvertently come across as insensitive or unkind, even though their intentions are 
                           generally good.
                           Dissatisfied – Logicians can’t help but imagine how things could be better than they already are. These personalities are constantly on the
                           lookout for problems to solve, topics to learn, and new ways to approach things. Taken too far, this mindset can become overwhelming, 
                           with Logicians constantly trying to reinvent the wheel rather than reliably addressing their needs and responsibilities.
                           Impatient – Logicians take pride in their knowledge and in sharing their ideas. When it comes to explaining their rationale, however, 
                           they aren’t always patient. If their conversation partner doesn’t follow along or seem sufficiently interested, Logicians may give up with 
                           a dismissive “never mind.
                           Perfectionistic – Logicians want to get things done, but their quest for perfection can get in the way. At times, these personalities may 
                           get so lost in analyzing various options that they never reach a decision. They may also give up on projects that don’t match the ideal 
                           vision in their mind.""");
            case "ENTJ" -> System.out.println("""
                    ENTJ
                       COMMANDER
                       A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits. They are decisive people who love momentum and accomplishment. 
                       They gather information to construct their creative visions but rarely hesitate for long before acting on them.
                       Commanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence, and project authority in a way that draws crowds
                       together behind a common goal. However, Commanders are also characterized by an often ruthless level of rationality, using their drive, 
                       determination and sharp minds to achieve whatever end they’ve set for themselves.
                       COMMANDER SUMMARY
                       *Striving for Greatness
                       If there’s anything Commanders love, it’s a good challenge, big or small, and they firmly believe that given enough time and resources, they can 
                       achieve any goal. This quality makes people with the Commander personality type brilliant entrepreneurs, and their ability to think strategically
                       and hold a long-term focus while executing each step of their plans with determination and precision makes them powerful business leaders. 
                       This determination is often a self-fulfilling prophecy, as Commanders push their goals through with sheer willpower where others might give 
                       up and move on, and their Extraverted (E) nature means they are likely to push everyone else right along with them, achieving spectacular 
                       results in the process.motional expression isn’t the strong suit of any Analyst type, but Commanders’ distance from their emotions is especially public, 
                       and felt directly by a much broader swath of people.
                       WEAKNESS:
                       * Stubborn and Dominant – Sometimes all this confidence and willpower can go too far, and Commanders are all too capable of digging in their heels, trying to win every single debate and pushing their vision, and theirs alone.
                       * Intolerant – People with the Commander personality type are notoriously unsupportive of any idea that distracts from their primary goals, and even more so of ideas based on emotional considerations.
                         Commanders won’t hesitate a second to make that fact clear to those around them.
                       * Impatient – Some people need more time to think than others, an intolerable delay to quick-thinking Commanders. They may misinterpret contemplation as stupidity or 
                         disinterest in their haste, a terrible mistake for a leader to make.
                       *  Arrogant – Commander personalities respect quick thoughts and firm convictions, their own qualities, and look down on those who don’t match up. This relationship is a 
                         challenge for most other personality types who are perhaps not timid in their own right, but will seem so beside overbearing Commanders.
                       * Poor Handling of Emotions – All this bluster, alongside the assumed supremacy of rationalism, makes Commanders distant from their own emotional expression and sometimes 
                         downright scornful of others’. People with this personality type often trample others’ feelings, inadvertently hurting their partners and friends, especially in
                         emotionally charged situations.
                       * Cold and Ruthless – Their obsession with efficiency and unwavering belief in the merits of rationalism, especially professionally, makes 
                         Commanders incredibly insensitive in pursuing their goals, dismissing personal circumstances, sensitivities, and preferences as irrational and
                         irrelevant """);
            case "ENTP" -> System.out.println("""
                    ENTP
                      DEBATER
                      A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits. They tend to be bold and creative, deconstructing and 
                      rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.
                      Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. 
                      Few things light up people with this personality type more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.
                      DEBATER SUMMARY
                      Breaking the Rules
                      Debaters are known for their rebellious streak. For this personality type, no belief is too sacred to be questioned, no idea is too fundamental
                      to be scrutinized, and no rule is too important to be broken, or at least thoroughly tested. Sometimes Debaters even rebel against their own 
                      beliefs by arguing the opposing viewpoint – just to see how the world looks from the other side.As Debaters see it, most people are too ready 
                      to do as they’re told and blindly conform to social norms, pressures, and standards.Debaters enjoy the mental exercise of questioning the prevailing 
                      mode of thought, and they take a certain pleasure in uncovering the value of underdogs and outliers. Their active minds can’t help but rethink the things
                      that everyone else takes for granted and push them in clever new directions. While Debater personalities love to brainstorm and think big, they tend to avoid 
                      getting caught doing the “grunt work” of implementing their ideas.
                      The Cost of Contrarianism
                      Debaters’ capacity for debate is legendary, but that doesn’t mean that it’s always helpful. When they openly question their boss in a meeting or 
                      pick apart everything their significant other says, Debaters may think that they’re being champions of rationality and logic. 
                      But they may also be doing their chances of success and happiness more harm than good.
                      WEAKNESS
                      * Very Argumentative – If there’s anything Debaters enjoy, it’s the mental exercise of debating an idea, and nothing is sacred. 
                      * Insensitive – Being so rational, Debaters often misjudge others feelings and push their debates well past others’ tolerance levels. 
                      * Intolerant – Unless people are able to back up their ideas in a round of mental sparring, Debaters are likely to dismiss not just the ideas but
                         the people themselves. Either a suggestion can stand up to rational scrutiny or it’s not worth bothering with.
                      * Can Find It Difficult to Focus – The same flexibility that allows Debaters to come up with such original plans and ideas makes them readapt 
                        perfectly good ones far too often, or to even drop them entirely as the initial excitement wanes and newer thoughts come along. 
                        Boredom comes too easily for Debaters, and fresh thoughts are the solution, though not always a helpful one.
                      * Dislike Practical Matters – Debaters are interested in what could be – malleable concepts like ideas and plans that can be adapted and debated.
                        When it comes to hard details and day-to-day execution where creative flair isn’t just unnecessary but actually counter-productive, 
                        Debater personalities lose interest, often with the consequence of their plans never seeing the light of day.
                      CONCLUSION
                        Armed with a powerful intellect and vivid imagination, Debaters can overcome or outmaneuver obstacles that seem unbeatable to most.""");
            case "INFJ" -> System.out.println("""
                    INFJ
                      ADVOCATE
                        An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits. They tend to approach life with deep thoughtfulness and 
                        imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.
                        Advocates (INFJs) may be the rarest personality type of all, but they certainly leave their mark on the world. Idealistic and principled, they
                        aren’t content to coast through life – they want to stand up and make a difference. For Advocate personalities, success doesn’t come from money
                        or status but from seeking fulfillment, helping others, and being a force for good in the world. While they have lofty goals and ambitions, 
                        Advocates shouldn’t be mistaken for idle dreamers. People with this personality type care about integrity, and they’re rarely satisfied until 
                        they’ve done what they know to be right. 
                        ADVOCATE SUMMARY
                        Seeking Purpose
                        Perhaps because their personality type is so uncommon, Advocates tend to carry around a sense – whether conscious or not – of being different 
                        from most people. With their rich inner lives and their deep, abiding desire to find their life purpose, they don’t always fit in with those 
                        around them. This isn’t to say that Advocates can’t enjoy social acceptance or close relationships – only that they sometimes feel misunderstood
                         or at odds with the world.Fortunately, this sense of being out of step doesn’t diminish Advocates’ commitment to making the world a better place.
                         Advocates are troubled by injustice, and they typically care more about altruism than personal gain.They often feel called to use their strengths – 
                         including creativity, imagination, and sensitivity – to uplift others and spread compassion
                         WEAAKNESS
                          * Sensitive to Criticism – Advocates aren’t averse to feedback – that is, unless they believe that someone is challenging their most cherished principles or 
                            values. When it comes to the issues that are near and dear to them, people with this personality type can become defensive or dismissive.
                          * Reluctant to Open Up – Advocates value honesty and authenticity, but they’re also private. They may find it difficult to open up and be vulnerable about their
                            struggles, not wanting to burden someone else with their issues. Unfortunately, when Advocates don’t ask for help, they may inadvertently hold themselves 
                            back or create distance in their relationships.
                          * Perfectionistic – The Advocate personality type is all but defined by idealism. While this is a wonderful quality in many ways, it doesn’t
                            always leave room for the messiness of real life. Advocates might find it difficult to appreciate their jobs, living situations, or 
                            relationships if they’re continually fixating on imperfections and wondering whether they should be looking for something better.
                          * Avoiding the Ordinary – Advocates yearn to do extraordinary things with their lives. But it’s hard to achieve anything extraordinary without
                            breaking it down into small, manageable steps. Unless they translate their dreams into everyday routines and to-do lists, Advocates may 
                            struggle to turn their grand visions into reality.
                          * Prone to Burnout – Advocates’ perfectionism and reserve leave them with few options for letting off steam. People with this personality 
                            type can exhaust themselves if they don’t balance their drive to help others with necessary self-care and rest.
                            """);
            case "INFP" -> System.out.println("""
                    INFP
                     MEDITATOR
                     A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits. These rare personality types tend to be quiet,
                     open-minded, and imaginative, and they apply a caring and creative approach to everything they do.
                     Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives. Creative and imaginative, they happily lose themselves in daydreams, 
                     inventing all sorts of stories and conversations in their minds. These personalities are known for their sensitivity – Mediators can have profound emotional responses 
                     to music, art, nature, and the people around them.
                     Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others. But because this personality type 
                     makes up such a small portion of the population, Mediators may sometimes feel lonely or invisible, adrift in a world that doesn’t seem to 
                     appreciate the traits that make them unique.
                     MEDITATOR SUMMARY
                     * Speaking Their Truth
                       Few things make Mediators more uneasy than pretending to be someone they aren’t. With their sensitivity and their commitment to authenticity, 
                       people with this personality type tend to crave opportunities for creative self-expression.
                        Mediators can explore their own inner nature as well as their place in the world. While this is a beautiful trait, these personalities sometimes show a tendency to daydream and fantasize rather 
                        than take action. To avoid feeling frustrated, unfulfilled, or incapable, Mediators need to make sure that they take steps to turn their dreams and ideas into reality.
                        In Search of a Calling
                        People with this personality type tend to feel directionless or stuck until they connect with a sense of purpose for their lives. For many Mediators, this purpose has something to do with uplifting others and their 
                        ability to feel other people’s suffering as if it were their own. While Mediators want to help everyone, they need to focus their energy and efforts – 
                        otherwise, they can end up exhausted.
                    WEAKNESS
                    * Unrealistic – Nothing in this world is perfect – and that can be a difficult truth for Mediators to accept. People with this personality type can be hopeless
                       romantics, with rose-colored visions of what their lives should be like. This can set Mediators up for disappointment when reality inevitably falls short of
                       their dreams.
                    * Self-Isolating – Mediators long to connect with others, but they don’t always know how. Especially in new environments, Mediators may be reluctant to put 
                      themselves out there in ways that would help them make new friends or become involved in a new community. As a result, people with this personality type may 
                      sometimes feel lonely or isolated.
                    * Unfocused – Mediators’ imaginative, introspective nature doesn’t always lend itself to productivity. Many Mediators get frustrated by how 
                      difficult they find it to buckle down and get things done. The problem isn’t that they are incapable – rather, it’s that they run into problems
                      when they become so caught up in different ideas and ideals that they fail to commit to a course of action.
                    * Emotionally Vulnerable – The emotional attunement of these personalities is among their greatest strengths. But unless Mediators establish
                      boundaries, they can be at risk of absorbing other people’s negative moods or attitudes.
                    * Desperate to Please – Conflict tends to be stressful for Mediators, who yearn for harmony and acceptance. When someone dislikes or 
                      disapproves of them, these personalities may become fixated on trying to clear the air and change that person’s mind. Unfortunately, Mediators’ desire to please others can drain their energy, eclipsing their inner wisdom and their awareness of their own needs.
                    * Self-Critical – Mediators believe in their unique potential, and they desperately want to live up to it. But this can cause them to have 
                      unrealistic expectations for themselves. When Mediators fail to live up to these visions, they may accuse themselves of being useless or 
                      selfish or woefully inadequate. Taken too far, this self-criticism can discourage Mediators, leading them to give up on even their dearest dreams.
                      CONCLUSION
                      Few personality types are as poetic and kindhearted as Mediators (INFPs). With their unique gifts, Mediators can overcome all sorts of challenges and obstacles
                      and brighten the lives of those around them in the process.""");
            case "ENFJ" -> System.out.println("""
                    ENFJ
                     PROTAGONIST
                    A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. These warm, forthright 
                    types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.
                    Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic, these personality types strive to have a positive
                    impact on other people and the world around them. They rarely shy away from an opportunity to do the right thing, even when doing so is far 
                    from easy.
                    Protagonists are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers. 
                    Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships. 
                    Few things bring Protagonists a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves.
                    POTAGONIST SUMMARY
                    Protagonists tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust or wrong, they speak 
                    up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak in ways that resonate with others.
                    These personality types have an uncanny ability to pick up on people’s underlying motivations and beliefs.
                    At times, they may not even understand how they come to grasp another person’s mind and heart so quickly.These flashes of insight can make 
                    Protagonists incredibly persuasive and inspiring communicators.Protagonists’ secret weapon is their purity of intent.
                    * Getting Involved
                      When Protagonists care about someone, they want to help solve that person’s problems – sometimes at any cost. 
                      The good news is that many people are grateful for Protagonists’ assistance and advice. After all, there’s a reason that these personalities
                      have a reputation for helping others improve their lives.Protagonists are genuine, caring people who talk the talk and walk the walk. 
                      Nothing makes them happier than motivating other people to do what’s right. Protagonists tend to have a clear vision of what people can or should
                      do in order to better themselves, but not everyone is ready to make those changes. If Protagonists push too hard, their loved ones may feel
                      resentful or unfairly judged. And while this personality type is known for being insightful, even the wisest Protagonists may sometimes 
                      misread a situation or unwittingly give bad advice.
                    * Leading the Way
                    People with this personality type are devoted altruists, ready to face slings and arrows in order to stand up for the people and ideas that they 
                    believe in. This strength of conviction bolsters Protagonists’ innate leadership skills, particularly their ability to guide people to work 
                    together in service of the greater good.
                    WEAKNESS
                    * Unrealistic – Many Protagonists put pressure on themselves to right every wrong that they encounter.
                    * Overly Idealistic – Protagonists tend to have clear ideas about what’s right and what’s wrong.
                    * Condescending – People with this personality type enjoy teaching others, particularly about the causes and beliefs that matter so much to them. But, at
                      times, Protagonists’ attempts to “enlighten” others may come across as patronizing – not the most effective strategy for persuading other people, unfortunately.
                    * Intense – When it comes to self-improvement, Protagonists are rarely short on energy or determination. But they may not recognize that not everyone shares 
                     these qualities. 
                    * Overly Empathetic – Compassion is among this personality type’s greatest strengths. But Protagonists have a tendency to take on other people’s problems as 
                      their own – a habit that can leave them emotionally and physically exhausted.
                      CONCLUSION
                      Protagonists’ gifts include idealism, determination, and the ability to envision a better future – but they don’t just want to hear what makes them great.
                       Protagonists are committed to actually using these gifts to serve a greater purpose.
                    """);
            case "ENFP" -> System.out.println("""
                    ENFP
                       CAMPAIGNER:
                       A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits. These people tend to embrace big ideas and actions 
                       that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.
                       Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, they stand out in any crowd. 
                       But even though they can be the life of the party, Campaigners don’t just care about having a good time. These personality types run deep – as
                       does their longing for meaningful, emotional connections with other people.
                       CAMPAIGNER SUMMARY:
                       Campaigners are independent and creative, always on the lookout for the magic and meaning in everyday life.Campaigners are devoted to enriching their relationships and
                       their social lives. But beneath their sociable, easygoing exteriors, they have rich, vibrant inner lives as well.
                       Campaigners are proof that seeking out life’s joys and pleasures isn’t the same as being shallow. Seemingly in the blink of an eye, people with this personality type can 
                       transform from impassioned idealists to carefree figures on the dance floor.
                       Even in moments of fun, Campaigners want to connect emotionally with others. Few things matter more to these personality types than having genuine, heartfelt conversations with 
                       the people they cherish. Campaigners believe that everyone deserves to express their feelings, and their empathy and warmth create spaces where even the most timid 
                       spirits can feel comfortable opening up.
                       People with this personality type need to be careful, however. Campaigners’ intuition may lead them to read far too much into other people’s 
                       actions and behaviors. Instead of simply asking for an explanation, Campaigners may end up puzzling over someone else’s desires or intentions. 
                       This kind of social stress is what keeps harmony-focused Campaigners awake at night.
                       Campaigners will spend a lot of time exploring different relationships, feelings, and ideas before they find a path for their lives that feels
                       right. But when they finally do find their way, their imagination, empathy, and courage can light up not only their own lives but also the
                       world around them.
                       CONCLUSION
                       Few personality types are as creative and charismatic as Campaigners (ENFPs). Known for their idealism and enthusiasm, these personalities excel 
                       at dealing with unexpected challenges and brightening the lives of those around them.Yet Campaigners can be tripped up in certain areas of their lives. When it comes 
                       to building relationships, choosing a career, or turning their dreams into reality, people with this personality type may need to consciously 
                       address their weaknesses and gain new skills – even as they draw on their many strengths.
                        """);
            case "ISTJ" -> System.out.println("""
                    ISTJ
                     LOGISTICIAN
                        A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits. These people tend to be reserved yet willful,
                        with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.
                        Logisticians pride themselves on their integrity. People with this personality type mean what they say, and when they commit to doing something, they make sure to follow through.
                        This personality type makes up a good portion of the overall population, and while Logisticians may not be particularly flashy or attention-seeking, they do more than their 
                        share to keep society on a sturdy, stable foundation. In their families and their communities, Logisticians often earn respect for their 
                        reliability, their practicality, and their ability to stay grounded and logical, even in the most stressful situations.
                        LOGISTICIAN SUMMARY
                        * A Life of Integrity
                         The core of Logisticians’ self-respect comes from a sense of personal integrity. People with this personality type believe that there is a right way to proceed in any situation –
                         and that anyone who pretends otherwise is probably trying to bend the rules to suit their own purposes. Logisticians have a deep respect for 
                         structure and tradition, and they are often drawn to organizations, workplaces, and educational settings that offer clear hierarchies and 
                         expectations.
                         People with the Logistician personality type rarely hesitate to take responsibility for their actions and choices. Generally speaking, they are quick to own up to their own mistakes, 
                         admitting the truth even if it doesn’t make them look good.
                         Because they strive to meet their obligations no matter what, Logistician personalities are often baffled by people who fail to hold themselves
                         to the same standard. At times, Logisticians might unfairly misjudge people who can’t match their rigorous self-control – suspecting that 
                         someone is being lazy or dishonest when that person might actually be coping with other challenges.Even if Logisticians don’t speak these 
                         judgments aloud, their disdain can come through regardless, earning them a reputation for being somewhat strict or unempathetic.
                       * Picking Up the Slack
                         Logisticians’ dedication is an admirable quality, and it drives many of their accomplishments. But it can also become a weakness that other people take advantage of.
                         With their strong work ethic and sense of duty, Logisticians may routinely find themselves shouldering other people’s responsibilities. Even if they don’t complain 
                         about the situation, Logisticians can end up exhausted or discouraged if they’re constantly expected – or taking it upon themselves – to pick up the slack for their 
                         colleagues, friends, or loved ones.
                         CONCLUSION
                         Few personality types are as practical and dedicated as Logisticians. Known for their reliability and hard work, Logisticians are good at creating and maintaining a 
                         secure and stable environment for themselves and their loved ones. Logisticians’ dedication is invaluable in many areas, including their own personal growth.
                         """);
            case "ISFJ" -> System.out.println("""
                    ISFJ
                        DEFENDER
                        A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits. These people tend to be warm and unassuming in their own steady way.
                        They’re efficient and responsible, giving careful attention to practical details in their daily lives.
                        Defenders can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. 
                        But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
                        Defenders also have excellent analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships.
                        Defenders are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
                        DEFENDER SUMMARY
                        * The Gift of Loyalty
                          Among Defenders’ most distinctive traits is loyalty. Rare is the Defender who allows a friendship or relationship to fade away from lack of effort.People with this personality type are 
                          known for dropping everything and lending a hand whenever a friend or family member is going through a hard time. Other people may take advantage of Defenders’ helpful, hardworking nature, 
                          leaving them feeling burned out and overworked. And Defenders may feel guilty or stressed when they contemplate changes – even necessary changes – to themselves, 
                          their relationships, or the way they’ve done things in the past.
                          Defenders may find themselves quietly losing their enthusiasm and motivation, eventually becoming resentful toward the people who just don’t seem to appreciate them.
                          Although they’re Introverted, Defenders have a deeply social nature. Thanks to their ability to remember the details of other people’s lives, Defenders have a special talent for making their 
                          friends and acquaintances feel seen, known, and cherished. Few personality types can match Defenders’ ability to choose just the right gift for any occasion, whether
                          large or small.
                          CONCLUSION
                          Defenders’ gifts include generosity, patience, and determination – but they aren’t people who just want to hear what makes them great. Defenders are committed to actually using these gifts to become
                          better people and be of service to others. """);
            case "ESTJ" -> System.out.println("""
                    ESTJ
                        EXECUTIVE
                            An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, 
                            emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction 
                            amid adversity.
                            Executives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to 
                            bring families and communities together. Embracing the values of honesty, dedication and dignity, people with the Executive personality 
                            type are valued for their clear advice and guidance, and they happily lead the way on difficult paths. Taking pride in bringing people 
                            together, Executives often take on roles as community organizers, working hard to bring everyone together in celebration of cherished 
                            local events, or in defense of the traditional values that hold families and communities together.
                            EXECUTIVE SUMMARY
                            Executives are aware of their surroundings and live in a world of clear, verifiable facts – the surety of their knowledge means that even 
                            against heavy resistance, they stick to their principles and push an unclouded vision of what is and is not acceptable. Their opinions 
                            aren’t just empty talk either, as Executives are more than willing to dive into the most challenging projects, improving action plans and 
                            sorting details along the way, making even the most complicated tasks seem easy and approachable.
                            However, Executives don’t work alone, and they expect their reliability and work ethic to be reciprocated – people with this personality
                             type meet their promises, and if partners or subordinates jeopardize them through incompetence or laziness, or worse still, dishonesty, 
                             they do not hesitate to show their wrath. This can earn them a reputation for inflexibility, a trait shared by all Sentinel personalities,
                             but it’s not because Executives are arbitrarily stubborn, but because they truly believe that these values are what make society work.
                             A Greater Responsibility
                             The main challenge for Executives is to recognize that not everyone follows the same path or contributes in the same way. A true leader
                              recognizes the strength of the individual, as well as that of the group, and helps bring those individuals’ ideas to the table. 
                              That way, Executives really do have all the facts, and are able to lead the charge in directions that work for everyone.
                              CONCLUSION
                              Few personality types are as practical and strong-willed as Executives. Known for their reliability and administrative skills, Executives 
                              are good at creating and maintaining a secure and stable environment for themselves and their loved ones. Executives’ dedication is invaluable
                              in many areas, including their own personal growth.
                              """);
            case "ESFJ" -> System.out.println("""
                    ESFJ
                      CONSUL
                         A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused, 
                         and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.
                          Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them. Generous and reliable, 
                         people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together.
                         CONSUL SUMMARY
                         * The Beauty of a Responsible Life
                           Consuls are altruists. They take seriously their responsibilities to give back, serve others, and do the right thing.
                           And Consuls believe that there is a clear right thing to do in nearly every situation. While some personality types adopt a more lenient, live-and-let-live
                           attitude, Consuls may find it difficult not to judge when someone takes a path that strikes them as misguided. As a result, Consuls often struggle to accept 
                           it when someone – particularly someone they care about – disagrees with them.
                           Consuls have a clear moral compass – and it can be nothing short of baffling to them when other people’s actions don’t align with it.
                    Building Relationships That Last
                           Supportive and outgoing, Consuls can always be spotted at a party – they’re the ones fluttering around making sure that everyone else 
                           is having a good time! But make no mistake: Consuls don’t just breeze through other people’s lives. Loyal to the core, they build lasting 
                           relationships, and they can be counted on to show up whenever a helping hand – or a listening ear – is needed.
                           For many people with the Consul personality type, one of life’s greatest challenges is accepting that they can’t control anyone else’s thoughts
                           or behavior – not even those who are nearest and dearest to them. Fortunately, Consuls can find peace and fulfillment by focusing on what they do best: 
                           setting an example of care, consideration, and responsibility – and bringing people together in the process. 
                           CONCLUSION:
                           Few personality types are as practical and caring as Consuls. Known for their social and administrative skills, Consuls are good at creating
                            and maintaining a secure, stable and friendly environment for themselves and their loved ones. Consuls’ dedication is invaluable in many 
                            areas, including their own personal growth.
                            Yet Consuls can be easily tripped up in areas where their kindness and practical approach are more of a liability than an asset. Whether
                            it is finding (or keeping) a partner, learning to relax or improvise, reaching dazzling heights on the career ladder, or managing their
                            workload, Consuls need to put in a conscious effort to develop their weaker traits and additional skills.
                           """);
            case "ISTP" -> System.out.println("""
                    ISTP
                        VIRTUOSO
                        A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits. They tend to have an 
                        individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal 
                        skill, varying their approach as needed.
                        Virtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity.
                        People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and learning from 
                        their environment as they go. Often mechanics and engineers, Virtuosos find no greater joy than in getting their hands dirty pulling things apart and putting them 
                        back together, just a little bit better than they were before.
                        Virtuosos explore ideas through creating, troubleshooting, trial and error and first-hand experience. They enjoy having other people take an interest in their projects 
                        and sometimes don’t even mind them getting into their space.
                        Virtuosos enjoy lending a hand and sharing their experience, especially with the people they care about, and it’s a shame they’re so uncommon, making up only about five percent 
                        of the population. Virtuoso women are especially rare, and the typical gender roles that society tends to expect can be a poor fit – they’ll often be seen as tomboys 
                        from a young age.
                        VIRTU0SO SUMMARY
                        * Dare to Differ
                          While their mechanical tendencies can make them appear simple at a glance, Virtuosos are actually quite enigmatic. Friendly but very private, calm but suddenly spontaneous, 
                          extremely curious but unable to stay focused on formal studies, Virtuoso personalities can be a challenge to predict, even by their friends and loved ones. 
                          Virtuosos can seem very loyal and steady for a while, but they tend to build up a store of impulsive energy that explodes without warning, taking their interests in
                          bold new directions.
                          Virtuosos’ decisions stem from a sense of practical realism, and at their heart is a strong sense of direct fairness, a “do unto others” attitude, which really helps
                          to explain many of Virtuosos’ puzzling traits. Instead of being overly cautious though, avoiding stepping on toes in order to avoid having their toes stepped on, 
                          Virtuosos are likely to go too far, accepting likewise retaliation, good or bad, as fair play.
                          The biggest issue Virtuosos are likely to face is that they often act too soon, taking for granted their permissive nature and assuming 
                          that others are the same. They’ll be the first to tell an insensitive joke, get overly involved in someone else’s project, roughhouse and 
                          play around, or suddenly change their plans because something more interesting came up.
                        * Defying the Rules
                          Virtuosos will come to learn that many other personality types have much more firmly drawn lines on rules and acceptable behavior than they 
                          do – they don’t want to hear an insensitive joke, and certainly wouldn’t tell one back, and they wouldn’t want to engage in horseplay, even 
                          with a willing party. If a situation is already emotionally charged, violating these boundaries can backfire tremendously.
                          Virtuosos have a particular difficulty in predicting emotions, but this is just a natural extension of their fairness, given how difficult
                          it is to gauge Virtuosos’ emotions and motivations. However, their tendency to explore their relationships through their actions rather than 
                          through empathy can lead to some very frustrating situations. People with the Virtuoso personality type struggle with boundaries and 
                          guidelines, preferring the freedom to move about and color outside the lines if they need to.
                          Finding an environment where they can work with good friends who understand their style and unpredictability, combining their creativity, 
                          sense of humor and hands-on approach to build practical solutions and things, will give Virtuosos many happy years of building useful 
                          boxes – and admiring them from the outside.
                          CONCLUSION
                          Few personality types are as bold and practical as Virtuosos. Known for their technical mastery and willingness to improvise, Virtuosos are good at 
                          finding unique solutions to seemingly impossible challenges. Virtuosos’ desire to explore and learn new things is invaluable in many areas, including their 
                          own personal growth.
                            """);
            case "ISFP" -> System.out.println("""
                    ISFP
                      ADVENTURER
                        An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. They tend to have open minds,
                        approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.
                        Adventurers are true artists – although not necessarily in the conventional sense. For this personality type, life itself is a canvas for self-expression. 
                        From what they wear to how they spend their free time, Adventurers act in ways that vividly reflect who they are as unique individuals.
                        And every Adventurer is certainly unique. Driven by curiosity and eager to try new things, people with this personality often have a fascinating
                        array of passions and interests. With their exploratory spirits and their ability to find joy in everyday life, Adventurers can be among the most 
                        interesting people you’ll ever meet. The only irony? Unassuming and humble, Adventurers tend to see themselves as “just doing their own thing,”
                        so they may not even realize how remarkable they really are.   
                        ADVENTURER SUMMARY
                        * The beauty of an open mind
                          Adventurers take each day as it comes, doing what feels right to them in the moment. And they make sure to leave plenty of room in their lives for the unexpected –
                          with the result that many of their most cherished memories are of spontaneous, spur-of-the-moment outings and adventures, whether by themselves or with their loved 
                          ones.This flexible mindset makes Adventurers remarkably tolerant and open-minded.  
                        * Living in Harmony
                          In their relationships, Adventurers are warm, friendly, and caring, taking wholehearted enjoyment in the company of their nearest and dearest.
                          But make no mistake: this is an Introverted personality type, meaning that Adventurers need dedicated alone time to recharge their energy 
                          after socializing with others. This alone time is what allows Adventurers to reestablish a sense of their own identity – in other words, to 
                          reconnect with who they truly are.
                          Creative and free-spirited, Adventurers march to the beat of their own drum, and it would be easy to assume that they don’t particularly worry what other people think of them.
                          But this isn’t the case – Adventurers are thoughtful and perceptive, able to pick up on people’s unspoken feelings and opinions, and it can upset them if they don’t
                          feel liked, approved of, or appreciated. When faced with criticism, it can be a challenge for people with this personality type not to get caught up in the heat of 
                          the moment. If they encounter harsh or seemingly unfair criticism, they may even lose their tempers in spectacular fashion.
                          CONCLUSION
                          Few personality types are as colorful and charming as Adventurers. Known for their kindness and artistic skills, Adventurers are great at finding exciting new things to explore 
                          and experience. Adventurers’ creativity and down-to-earth attitude are invaluable in many areas, including their own personal growth. """);
            case "ESTP" -> System.out.println("""
                    ESTP
                      ENTREPRENEUR
                        An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits. They tend to be energetic and action-oriented, deftly navigating whatever
                        is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
                        Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group 
                        to group. Laughing and entertaining with a blunt and earthy humor, Entrepreneur personalities love to be the center of attention. If an audience member is asked to 
                        come on stage, Entrepreneurs volunteer – or volunteer a shy friend.
                        Entrepreneurs leap before they look, fixing their mistakes as they go, rather than sitting idle, preparing contingencies and escape clauses.
                        ENTREPRENEUR SUMMARY
                        * Diving Right In
                          Entrepreneurs are the likeliest personality type to make a lifestyle of risky behavior. They live in the moment and dive into the action – they are the eye of the storm. People with the Entrepreneur
                          personality type enjoy drama, passion, and pleasure, not for emotional thrills, but because it’s so stimulating to their logical minds. They are forced to make critical
                          decisions based on factual, immediate reality in a process of rapid-fire rational stimulus response.
                          Also challenging is that to Entrepreneurs, it makes more sense to use their own moral compass than someone else’s. Rules were made to be broken. This is a sentiment few high school instructors or 
                          corporate supervisors are likely to share, and can earn Entrepreneur personalities a certain reputation. But if they minimize the trouble-making, harness their energy,
                          and focus through the boring stuff, Entrepreneurs are a force to be reckoned with.
                        * The Path Less Traveled
                          With perhaps the most perceptive, unfiltered view of any type, Entrepreneurs have a unique skill in noticing small changes. Whether a shift in facial expression, a new clothing style, or a broken habit, 
                          people with this personality type pick up on hidden thoughts and motives where most types would be lucky to pick up anything specific at all. Entrepreneurs use these
                          observations immediately, calling out the change and asking questions, often with little regard for sensitivity. Entrepreneurs should remember that not everyone wants 
                          their secrets and decisions broadcast.
                          If Entrepreneurs aren’t careful though, they may get too caught in the moment, take things too far, and run roughshod over more sensitive people, or forget to take care of their own health and safety. 
                          Making up only four percent of the population, there are just enough Entrepreneurs out there to keep things spicy and competitive, and not so many as to cause a 
                          systemic risk.
                          CONCLUSION
                          Few personality types are as charming and attractive as Entrepreneurs. Known for their ability to improvise and focus completely on the present, Entrepreneurs are great at finding exciting new things to 
                          explore and experience. Entrepreneurs’ creativity and down-to-earth attitude are invaluable in many areas, including their own personal growth.""");
            case "ESFP" -> System.out.println("""
                    ESFP
                      ENTERTAINERS
                      An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
                      They can be very social, often encouraging others into shared activities. 
                      Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too. No other personality type is as generous with their time and energy as Entertainers when it comes to 
                      encouraging others, and no other personality type does it with such irresistible style.
                      ENTERTAINER SUMMARY
                      Living with Passion
                      Entertainers love the spotlight, and all the world’s a stage. Many famous people with the Entertainer personality type are indeed actors, but they love putting on a show for their friends too, chatting with a unique and earthy wit, 
                      soaking up attention and making every outing feel a bit like a party. Utterly social, Entertainers enjoy the simplest things, and there’s no greater joy for them than
                      just having fun with a good group of friends.
                      Entertainers have the strongest aesthetic sense of any personality type. From grooming and outfits to a well-appointed home, Entertainer personalities have an eye for fashion. Knowing what’s attractive the moment they see it, Entertainers
                      aren’t afraid to change their surroundings to reflect their personal style. Entertainers are naturally curious, exploring new designs and styles with ease.
                      Entertainers usually love a little drama and passion, but not so much when they are the focus of the criticisms it can bring.
                    * A Spontaneous Spirit
                      The biggest challenge Entertainers face is that they are often so focused on immediate pleasures that they neglect the duties and responsibilities that make those luxuries possible. Complex analysis, repetitive tasks, and matching statistics to 
                      real consequences are not easy activities for Entertainers. They’d rather rely on luck or opportunity, or simply ask for help from their extensive circle of friends. 
                      It is important for Entertainers to challenge themselves to keep track of long-term things like their retirement plans or sugar intake – there won’t always be someone
                      else around who can help to keep an eye on these things.
                      There’s nothing that makes Entertainers feel quite as unhappy as realizing that they are boxed in by circumstance, unable to join their friends.
                      CONCLUSION
                      Few personality types are as charming and attractive as Entertainers. Known for their ability to improvise and focus completely on the present, Entertainers are great at finding exciting new things to explore and experience. Entertainers’ energy, 
                      enthusiasm and down-to-earth attitude are invaluable in many areas, including their own personal growth.
                    """);
        }
    }
}





