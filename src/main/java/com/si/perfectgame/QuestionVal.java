package com.si.perfectgame;

public enum QuestionVal {
    WITH_CHILD("Are you playing with children?", "No", "Yes"),
    YOUNGER_7("Younger than 7?", "No", "Yes"),
    GIRLS("Girls only?", "No", "Yes"),
    REAL_RULES("Real rules or just fun?", "Fun", "Rules"),
    FUN_ADULTS("Actually fun for Addults", "No", "Yes"),
    RUBE("Rube Goldberg?", "No", "Yes"),
    CRUSH_DEF("Let them experience crushing defeat?", "No", "Yes"),
    PORT("Portable?", "No", "Yes"),
    ONE_TEAM("One winner or a team effort", "One", "Team"),

    MORE_2_HOURS("Play for more than two hours?", "No", "Yes"),
    HARD_RULE("Hardest rules ever?", "No", "Yes"),
    ALL_TILL_END("All players in until the end?", "No", "Yes"),
    DICE_STRAT("Dice battles or 100% strategy", "Dice", "Strat"),

    NERD("Are you a huge nerd?", "No", "Yes"),
    DOZEN_PREPA("Do you want to spend dozens of hours preparing to play?", "No", "Yes"),
    SPEND_MONEY("Do you really like spending money?", "No", "Yes"),
    BOOMER("Does the name Boomer give you wet dreams?", "No", "Yes"),

    JUST_GET_ALONG("Do you think everyone should just get along", "No", "Yes"),
    GAMBLE("Do you like to gamble", "No", "Yes"),
    DICK("Do you secretly wish you were a dick? (a P I)", "No", "Yes"),
    MONTY_PYTH("Do you have a Monty Python Fetish", "No", "Yes"),
    ZOMBIE("Zombies?", "No", "Yes"),
    MONSTER_VIR("Would you rather fight monsters or viruses?", "Monster", "Virus"),

    OVER_50("Are you over 50 years old?", "No", "Yes"),
    MORE_2("More than two of you?", "No", "Yes"),
    MENSA("Are you in Mensa?", "No", "Yes"),
    CLICHE("Chees too cliche?", "No", "Yes"),

    PARTY("Party Game?", "No", "Yes"),
    GET_LAID("Looking to get laid?", "No", "Yes"),
    KNOW_ALL("Are you know it all?", "No", "Yes"),
    EMBARRASS("Want to embarrass your friends", "No", "Yes"),
    THUG_ARTIST("Do you want to be a thug or artist", "Artist", "Thug"),
    LAIR("Are you a creative liar", "No", "Yes"),
    WORDS_TRIVIA("Words or Trivia", "Trivia", "Words"),
    HANDS("Good with your hands?","No", "Yes"),
    STRAIGHT_A("Get straight A's", "No", "Yes"),
    TRAIN_FETISH("Do you have a train fetish?", "No", "Yes"),
    ENJOY_ECO("Do you enjoy economics?", "No", "Yes"),
    SIMPLE("Simple Rules?", "No", "Yes"),
    WORDS_TILES("Words or tiles?", "Words", "Tiles"),
    HARD_CHOI("Constant hard choices?", "No", "Yes"),
    FARM_FETISH("Farming fetish?", "No", "Yes"),
    TWO_GAMES("Do you mind having to buy two games?", "No", "Yes"),
    GEEKS("Are all players serious board game geeks?", "No", "Yes"),

    CARD_DECK("Card/deck based game?", "No", "Yes"),
    COMPLEX("Complexity", "Less", "More"),
    PLAN_BEF_START("Do you like to plan your start before your turn?", "No", "Yes"),
    DEF_TUR("Defined turns or no down-time?", "Turns", "No D.T"),

    ;

    private final String text;
    private final String[] ans;
    private final String left;
    private final String right;

    QuestionVal(String text, String left, String right) {
        this.text = text;
        this.left = left;
        this.right = right;
        this.ans = new String[] {left, right};
    }

    public String getText() {
        return text;
    }

    public String[] getAns() {
        return ans;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

}
