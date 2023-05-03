//package tdd;
//
//import java.util.Scanner;
//
//public class Nokia {
//    public static void main(String[] args) {
//        System.out.println("Main Menu");
//        System.out.println("List of menu functions");
//        System.out.println("1 Phone Book" + "\n2 Messages" + "\n3 Chat" + "\n4 Call Register" +
//                "\n5 Tones" + "\n6 settings" + "\n7 Call Divert" + "\n8 Games" + "\n9 Calculator" + "\n10 Reminders" +
//                "\n11 Clock" + "\n12 Profiles" + "\n13 SIM services");
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            int mainMenu = input.nextInt();
//            switch (mainMenu) {
//                case 1 -> {
//                    System.out.println("Phone Book");
//                    System.out.printf("1. Search\n2. Service Nos\n3. Add name\n4. " +
//                            "Erase\n5. Edit\n6. Assign tone\n7. Send b’card\n8 Options\n 9. Speed dials\n10. Voice tags\n + Press 0 for Back");
//
//                    int phonemenu = input.nextInt();
//                    switch (phonemenu) {
//                        case 1 -> System.out.println("Search");
//                        case 2 -> System.out.println("Services");
//                        case 3 -> System.out.println("Add Name");
//                        case 4 -> System.out.println("Erase");
//                        case 5 -> System.out.println("Edit");
//                        case 6 -> System.out.println("Assign tone");
//                        case 7 -> System.out.println("Send b'card");
//                        case 8 -> {
//                            System.out.println("Options");
//                            System.out.println("1. Type of view\n" + "2. Memory status");
//                            int option = input.nextInt();
//                            switch (option) {
//                                case 1 -> System.out.println("Type of view");
//                                case 2 -> {
//                                    System.out.println("Memory Status");
//                                    System.out.println("message");
//                                }
//
//                                    case 9:
//                                        System.out.println("Speed Dials");
//                                    case 10:
//                                        System.out.println("Voice Tags");
//                                    case -1:
//                                        System.out.println("Going back to main menu");
//                                        continue;
//
//                                }
//
//                            }
//                        }
//                    }
//
//                }
//                case 2 -> {
//                    System.out.println("1. Write messages\n" + "2. Inbox\n" + "3. Outbox\n" + "4. Picture messages\n" +
//                            "5. Templates\n" + "6. Smileys\n" + "7. Message settings");
//                }
//                case 3 -> {
//                    System.out.println("chat");
//                }
//                case 4 -> {
//                    System.out.println("2. Inbox\n" + "3. Outbox\n" + "4. Picture messages\n" + "5. Templates\n" +
//                            "6. Smileys\n" + "7. Message settings\n" + "Show call costs\n" + "Call cost settings" +
//                            "Prepaid credit");
//                }
//                case 5 -> {
//                    System.out.println("1. Ringing tone\n" + "2. Ringing volume\n" + "3. Incoming call alert\n" +
//                            "4. Composer\n" + "5. Message alert tone\n" + "6. Keypad tones\n" + "7. Warning and game tones\n" +
//                            "8. Vibrating alert\n" + "9. Screen saver");
//                }
//
//                case 6 -> {
//                    System.out.println("1 settings");
//                    int settings = input.nextInt();
//                    switch (settings) {
//                        case 1 -> {
//                            System.out.println("1 Call settings\n" + "2 Phone settings" + "3 Security settings\n" + "4. " +
//                                    "Restore factory settings\n");
//                            int callSettings = input.nextInt();
//                            switch (callSettings) {
//                                case 1: {
//                                    System.out.println("1. Automatic redial\n" + "2. Speed dialling\n" +
//                                            "3. Call waiting options\n" + "4. Own number sending\n" +
//                                            "5. Phone line in use\n" + "6. Automatic answer 1");
//                                    break;
//                                }
//
//                                case 2: {
//                                    System.out.println("1. Language\n" + "2. Cell info display\n" + "3. Welcome note\n" +
//                                            "4. Network selection\n" + "5. Lights2");
//                                    break;
//                                }
//
//                                case 3: {
//                                    System.out.println("1. PIN code request\n" +
//                                            "2. Call barring service\n" +
//                                            "3. Fixed dialling\n" +
//                                            "4. Closed user grou" + "5. Phone security\n" +
//                                            "6. Change access codes");
//                                    break;
//                                }
//                                case 4: {
//                                    System.out.println("Restore factory settings");
//                                    break;
//                                }
//
//                                case 7: {
//                                    System.out.println("Call divert");
//                                    break;
//                                }
//                                case 8: {
//                                    System.out.println("Games");
//                                    break;
//                                }
//                                case 9: {
//                                    System.out.println("Calculator");
//                                }
//                                case 10: {
//                                    System.out.println("Reminders");
//                                    break;
//                                }
//                                case 11: {
//
//                                    System.out.println("clock");
//                                    System.out.println("1. Alarm clock\n" + "2. Clock settings\n" +
//                                            "3. Date setting\n" + "4. Stopwatch\n" + "5. Countdown timer\n" +
//                                            "6. Auto update of date and time");
//                                    int clockSetting = input.nextInt();
//                                    switch (clockSetting) {
//                                        case 1 -> System.out.println("Alarm clock");
//                                        case 2 -> System.out.println("Clock settings");
//                                        case 3 -> System.out.println("Date setting");
//                                        case 4 -> System.out.println("Stopwatch");
//                                        case 5 -> System.out.println("Countdown timer");
//                                        case 6 -> {
//                                            System.out.println("Auto update of date and time");
//                                        }
//                                    }
//                                    break;
//                                }
//
//
//                                case 12: {
//                                    System.out.println("Profiles");
//                                    break;
//                                }
//                                case 13: {
//                                    System.out.println("SIM services3");
//                                    break;
//                                }
//                            }
//
//                        }
//
//                    }
//                }
//
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
