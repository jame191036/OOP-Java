package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import characters.Player;
// import skills.Skill;
public class Game {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        List<Player> players = playersGame();

        // Ask the user if they want to create a new player
        // System.out.print("Do you want to create a new player? (yes/no): ");
        // String responseCreateNewPlayer = keyboard.next().toLowerCase();
        // if (responseCreateNewPlayer.equals("yes")) {
        //     Player newPlayer = createNewPlayer();
        //     players.add(newPlayer);
        // }
        // Print all players
        System.out.println("\n--- Player List ---");

        for (int i = 0; i < players.size(); i++) {
            System.out.println("Select : >>>> " + (i + 1));
            System.out.println(players.get(i)); // Use get(i) instead of players[i]
            System.out.println("----------------------");
        }

        Player selectPlayer = new Player();

        while (true) {
            System.out.print("Select player: ");
            int numberSelect = keyboard.nextInt();

            selectPlayer = selectPlayer(players, numberSelect);

            if (selectPlayer != null) {
                System.out.print("You select: ");
                System.out.println(players.get(numberSelect - 1));
                break;
            }

            System.out.print("This player is not available for selection.");
        }

        // Delay printing "Are You Ready?"
        try {
            System.out.println("------- * ---------");
            Thread.sleep(500); // Delay for 2 seconds
            System.out.println("------- * ---------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print after delay
        System.out.println("");
        System.out.println("Are You Ready?");

        Player enemy = selectPlayer(players, 3);
        System.out.println("");
        System.out.println("your enemy");
        System.out.println("");
        System.out.println("v");
        System.out.println("");
        System.out.println(enemy);
        System.out.println("----------------------");

        try {
            System.out.println("------- * ---------");
            Thread.sleep(300); // Delay for 2 seconds
            System.out.println("------- * ---------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Start the fight");

        // เริ่มการต่อสู้
        List<Skill> skills = skillGame();
        boolean isMyturn = true;

        while (true) {

            if (selectPlayer.getHP() < 0 || enemy.getHP() < 0) {
                break;
            }

            if (isMyturn) {
                isMyturn = !isMyturn;

                System.out.println("");
                System.out.println("Check Player >> 1");
                System.out.println("Check Enemy >> 2");
                System.out.println("fight >> 3");

                System.out.print("Select: ");
                int selectCheck = keyboard.nextInt();

                // Check Player
                if (selectCheck == 1) {
                    System.out.println("");
                    System.out.println("Player");
                    System.out.println("");
                    System.out.println(selectPlayer);
                    System.out.println("----------------------");
                    isMyturn = true;
                    continue;
                }
                // Check Enemy
                if (selectCheck == 2) {
                    System.out.println("");
                    System.out.println("Enemy");
                    System.out.println("");
                    System.out.println(enemy);
                    System.out.println("----------------------");
                    isMyturn = true;
                    continue;
                }

                // แสดง skill
                System.out.println("");
                System.out.println("Your skill");
                System.out.println("");

                for (int i = 0; i < skills.size(); i++) {
                    System.out.println("skill : >>>> " + (i + 1));
                    System.out.println(skills.get(i)); // Use get(i) instead of players[i]
                    System.out.println("----------------------");
                }

                // เลือกใช้ skill
                System.out.println("");
                System.out.print("Select skill: ");
                int selectSkill = keyboard.nextInt();

                if (selectSkill > 0 && selectSkill <= skills.size()) {
                    System.out.println("You use skill: " + skills.get(selectSkill - 1).getNameSkill());
                    System.out.println("----------------------");
                } else {
                    System.out.println("Invalid skill selection!");
                    isMyturn = true;
                    continue;
                }
                Skill skillPlayr = skills.get(selectSkill - 1);

                if (skillPlayr.getUsageMP() > selectPlayer.getMP()) {
                    try {
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println(" Your mp is not enough");
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        isMyturn = true;
                        continue;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(500);
                    System.out.println("------- Roll the dice ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // ทอยลูกเต๋า ลูกที่ 1
                int point1 = random();
                System.out.println("You roll the dice number 1 and get >> " + point1);

                try {
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // ทอยลูกเต๋า ลูกที่ 2
                int point2 = random();
                System.out.println("You roll the dice number 2 and get >> " + point2);

                try {
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int point = point1 + point2;
                // เช็กว่าลูกเต๋าที่ทอยมีคะแนนน้อยกว่า skill 
                if ((skillPlayr.getMinRequired() - selectPlayer.getlucky()) >= point) {
                    try {
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("You missed the attack.");
                        Thread.sleep(300);
                        System.out.println("------- T_T ---------");
                        Thread.sleep(300);
                        System.out.println("------- *  ---------");
                        continue;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("You successfully attacked.");
                    Thread.sleep(500);
                    System.out.println("enemy : >> Would you choose to dodge or defend ?");
                    Thread.sleep(300);
                    System.out.println("Dodge >>> 1");
                    Thread.sleep(300);
                    System.out.println("Defend >>> 2");
                    Thread.sleep(300);
                    System.out.println("------- *  ---------");
                    Thread.sleep(300);
                    System.out.println("Want to " + skillPlayr.getAcc() + " point for dodge");
                    Thread.sleep(300);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int dodgeOrDefend = keyboard.nextInt();

                boolean isAttacks = true;
                if (dodgeOrDefend == 1) {
                    int pointDodger_1 = random();
                    int pointDodger_2 = random();

                    System.out.println("You roll the dice number 1 and get >> " + pointDodger_1);

                    try {
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("You roll the dice number 2 and get >> " + pointDodger_2);

                    try {
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int pointDodger = pointDodger_1 + pointDodger_2;

                    try {
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("You roll the total dice and get >> " + pointDodger);
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);

                        if (pointDodger >= skillPlayr.getAcc()) {
                            System.out.println("------- * ---------");
                            Thread.sleep(300);
                            System.out.println("You can dodge the attack.");
                            Thread.sleep(300);
                            System.out.println("------- * ---------");
                            isAttacks = false;
                        } else {
                            System.out.println("------- * ---------");
                            Thread.sleep(300);
                            System.out.println(" You failed to dodge the attack.");
                            Thread.sleep(300);
                            System.out.println("------- * ---------");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //ลบ mp 
                selectPlayer.setMP((selectPlayer.getMP() - skillPlayr.getUsageMP()));

                int damage = 0;
                // แสดงว่าโจมตีสำเร็จ
                if (isAttacks) {
                    try {
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("BOOM! *BOOOOM*");
                        Thread.sleep(300);
                        System.out.println("------- *  ---------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (skillPlayr.isMagic() && selectPlayer.getMP() > skillPlayr.getUsageMP()) {
                        damage = (skillPlayr.getDmg() * selectPlayer.getAtkMagic());
                        if (dodgeOrDefend != 1) {
                            damage = damage - enemy.getDefMagic();
                        }
                    } else {
                        damage = (skillPlayr.getDmg() * selectPlayer.getAtk());
                        if (dodgeOrDefend != 1) {
                            damage = damage - enemy.getDef();
                        }
                    }

                    if (damage > 0) {
                        enemy.setHP(enemy.getHP() - damage);
                    }
                }

                try {
                    Thread.sleep(500);
                    System.out.println("------- Enemy takes damage >>> " + damage);
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- Enemy HP >>>" + enemy.getHP());
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {

                isMyturn = !isMyturn;

                try {
                    Thread.sleep(500);
                    System.out.println("------- is turn enemy---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- select skill -------");

                    int randomSkill = randomSkill(skills.size());
                    Skill skillPlayr = skills.get(randomSkill - 1);
                    Thread.sleep(500);
                    System.out.println(skillPlayr);

                    Thread.sleep(300);
                    System.out.println("------- Roll the dice ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");

                    // ทอยลูกเต๋า ลูกที่ 1
                    int point1 = random();
                    System.out.println("You roll the dice number 1 and get >> " + point1);

                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");

                    // ทอยลูกเต๋า ลูกที่ 2
                    int point2 = random();
                    System.out.println("You roll the dice number 2 and get >> " + point2);

                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");

                    int point = point1 + point2;

                    if (skillPlayr.getUsageMP() > enemy.getMP()) {
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println(" Your mp is not enough");
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        isMyturn = false;
                    }

                    if ((skillPlayr.getMinRequired() - enemy.getlucky()) >= point) {
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("You missed the attack.");
                        Thread.sleep(300);
                        System.out.println("------- T_T ---------");
                        Thread.sleep(300);
                        System.out.println("------- *  ---------");
                        continue;
                    }
                    
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("You successfully attacked.");
                    Thread.sleep(500);
                    System.out.println("Hero : >> Would you choose to dodge or defend ?");
                    Thread.sleep(300);
                    System.out.println("Dodge >>> 1");
                    Thread.sleep(300);
                    System.out.println("Defend >>> 2");
                    Thread.sleep(300);
                    System.out.println("------- *  ---------");
                    Thread.sleep(300);
                    System.out.println("Want to " + skillPlayr.getAcc() + " point for dodge");
                    Thread.sleep(300);

                    int dodgeOrDefend = keyboard.nextInt();
                    boolean isAttacks = true;
                    if (dodgeOrDefend == 1) {
                        int pointDodger_1 = random();
                        int pointDodger_2 = random();

                        System.out.println("You roll the dice number 1 and get >> " + pointDodger_1);

                        try {
                            Thread.sleep(300);
                            System.out.println("------- * ---------");
                            Thread.sleep(300);
                            System.out.println("------- * ---------");
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("You roll the dice number 2 and get >> " + pointDodger_2);

                        try {
                            Thread.sleep(300);
                            System.out.println("------- * ---------");
                            Thread.sleep(300);
                            System.out.println("------- * ---------");
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        int pointDodger = pointDodger_1 + pointDodger_2;

                        try {
                            System.out.println("------- * ---------");
                            Thread.sleep(300);
                            System.out.println("You roll the total dice and get >> " + pointDodger);
                            Thread.sleep(300);
                            System.out.println("------- * ---------");
                            Thread.sleep(300);

                            if (pointDodger >= skillPlayr.getAcc()) {
                                System.out.println("------- * ---------");
                                Thread.sleep(300);
                                System.out.println("You can dodge the attack.");
                                Thread.sleep(300);
                                System.out.println("------- * ---------");
                                isAttacks = false;
                            } else {
                                System.out.println("------- * ---------");
                                Thread.sleep(300);
                                System.out.println(" You failed to dodge the attack.");
                                Thread.sleep(300);
                                System.out.println("------- * ---------");
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    //ลบ mp 
                    enemy.setMP((enemy.getMP() - skillPlayr.getUsageMP()));

                    int damage = 0;

                    if (isAttacks) {
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("------- * ---------");
                        Thread.sleep(300);
                        System.out.println("BOOM! *BOOOOM*");
                        Thread.sleep(300);
                        System.out.println("------- *  ---------");

                        if (skillPlayr.isMagic() && enemy.getMP() > skillPlayr.getUsageMP()) {
                            damage = (skillPlayr.getDmg() * enemy.getAtkMagic());
                            if (dodgeOrDefend != 1) {
                                damage = damage - enemy.getDefMagic();
                            }
                        } else {
                            damage = (skillPlayr.getDmg() * enemy.getAtk());
                            if (dodgeOrDefend != 1) {
                                damage = damage - enemy.getDef();
                            }
                        }

                        if (damage > 0) {
                            selectPlayer.setHP(selectPlayer.getHP() - damage);
                        }
                    }

                    Thread.sleep(500);
                    System.out.println("------- HERO takes damage >>> " + damage);
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- HERO HP >>>" + selectPlayer.getHP());
                    Thread.sleep(300);
                    System.out.println("------- * ---------");

                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                    Thread.sleep(300);
                    System.out.println("------- * ---------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            Thread.sleep(500);
            System.out.println("------- * ---------");
            Thread.sleep(300);
            System.out.println("END");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        keyboard.close();
    }

    // Static method so it can be used in main()
    public static List<Player> playersGame() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("swordMan", 500, 200, 2, 1, 2, 20, 10, 0));
        players.add(new Player("magician", 300, 600, 1, 2, 5, 10, 20, 1));
        players.add(new Player("enemy", 200, 15000, 2, 2, 5, 10, 10, 4));

        return players;
    }

    // Function to create new players dynamically
    public static Player createNewPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player name: ");
        String name = scanner.nextLine();

        System.out.print("Enter HP: ");
        int HP = scanner.nextInt();

        System.out.print("Enter MP: ");
        int MP = scanner.nextInt();

        System.out.print("Enter Atk: ");
        int Atk = scanner.nextInt();

        System.out.print("Enter AtkMagic: ");
        int AtkMagic = scanner.nextInt();

        System.out.print("Enter Agi: ");
        int Agi = scanner.nextInt();

        System.out.print("Enter Def: ");
        int Def = scanner.nextInt();

        System.out.print("Enter DefMagic: ");
        int DefMagic = scanner.nextInt();

        System.out.print("Enter Lucky: ");
        int Lucky = scanner.nextInt();

        return new Player(name, HP, MP, Atk, AtkMagic, Agi, Def, DefMagic, Lucky);
    }

    // Placeholder method for selectPlayer logic
    public static Player selectPlayer(List<Player> players, int numberSelect) {
        if (numberSelect >= 1 && numberSelect <= players.size()) {
            return players.get(numberSelect - 1); // Returns the selected player
        }
        return null; // Returns null if selection is invalid
    }

    public static List<Skill> skillGame() {
        List<Skill> skills = new ArrayList<>();

        // Define the first 10 skills
        skills.add(new Skill("FIREBALL", true, false, 2, 20, 10, 20));
        skills.add(new Skill("MANA BOLT", true, false, 3, 30, 10, 30));
        skills.add(new Skill("SHADOW BOLT", true, false, 4, 35, 9, 35));
        skills.add(new Skill("THUNDERCLAP", true, true, 4, 40, 8, 35));
        skills.add(new Skill("ICE BLAST", true, true, 5, 40, 9, 40));
        skills.add(new Skill("VAMPIRIC TOUCH", true, false, 6, 45, 8, 50));
        skills.add(new Skill("LIGHTNING STRIKE", true, false, 6, 50, 8, 60));
        skills.add(new Skill("FROSTBITE", true, false, 8, 55, 8, 70));
        skills.add(new Skill("FLAME WAVE", true, true, 8, 60, 8, 80));
        skills.add(new Skill("LAVA BURST", true, false, 9, 65, 8, 85));
        skills.add(new Skill("VORTEX", true, true, 10, 100, 6, 80));
        skills.add(new Skill("FIRE STORM", true, true, 11, 120, 6, 80));

        // skills.add(new Skill("WATER SPIRIT", true, false, 4, 0, 100, 25));
        skills.add(new Skill("WIND SLASH", false, false, 2, 40, 10, 0));
        skills.add(new Skill("EARTHQUAKE", false, true, 4, 50, 10, 10));
        skills.add(new Skill("STONE FIST", false, false, 6, 60, 8, 15));
        skills.add(new Skill("SWORD SLASH", false, false, 8, 70, 8, 20));
        skills.add(new Skill("EARTH SHOCK", false, true, 10, 80, 8, 25));
        return skills;
    }

    public static int random() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int randomSkill(int countSkill) {
        return (int) (Math.random() * countSkill) + 1;
    }
}
