package com.corso.java.orange.OtherProjectsAndTest.Hangman.remo;


public class DrawHangmanPlay {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void disegna(int attempts) {
        switch(attempts) {
            case 0:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|________ "+ANSI_RESET);
                break;
            case 1:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|      "+ANSI_PURPLE+"(_)"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|________ "+ANSI_RESET);
                break;
            case 2:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|      "+ANSI_PURPLE+"(_)"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|       "+ANSI_PURPLE+"|"+ANSI_RESET+" ");
                System.out.println(ANSI_YELLOW + "|       ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|________ "+ANSI_RESET);
                break;
            case 3:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|      "+ANSI_PURPLE+"(_)"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|      "+ANSI_PURPLE+"/|"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|       ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|________ "+ANSI_RESET);
                break;
            case 4:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|      "+ANSI_PURPLE+"(_)"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|      "+ANSI_PURPLE+"/|\\ "+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|       ");
                System.out.println("|        ");
                System.out.println("|        ");
                System.out.println("|________ "+ANSI_RESET);
                break;
            case 5:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|      "+ANSI_PURPLE+"(_)"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|      "+ANSI_PURPLE+"/|\\ "+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|       "+ANSI_PURPLE+"| "+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|       ");
                System.out.println("|        ");
                System.out.println("|________ "+ANSI_RESET);
                break;
            case 6:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|      "+ANSI_PURPLE+"(_)"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|      "+ANSI_PURPLE+"/|\\ "+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|       "+ANSI_PURPLE+"| "+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|      "+ANSI_PURPLE+"/"+ANSI_RESET+" ");
                System.out.println(ANSI_YELLOW + "|       ");
                System.out.println("|________ "+ANSI_RESET);
                break;
            case 7:
                System.out.println(ANSI_YELLOW + "_________");
                System.out.println("|/      |");
                System.out.println("|      "+ANSI_PURPLE+"(_)"+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|      "+ANSI_PURPLE+"/|\\ "+ANSI_RESET + " *** SEI MORTO ***");
                System.out.println(ANSI_YELLOW + "|       "+ANSI_PURPLE+"| "+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|      "+ANSI_PURPLE+"/ \\ "+ANSI_RESET);
                System.out.println(ANSI_YELLOW + "|        ");
                System.out.println("|________ "+ANSI_RESET);
                break;
        }
    }


    public static void ClearConsole(){
        System.out.print("\033[2J\033[1;1H");
    }
}

