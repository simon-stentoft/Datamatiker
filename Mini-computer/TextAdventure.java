/*
 Project description

 Created by: Lasse J. Kongsdal
 Date: 18-09-2020

 Description of program
 */

import java.util.*;

public class TextAdventure {

    // randomizer
    static Random rand = new Random();

    //<editor-fold desc="game variables">
    static boolean gameStatus;
    static boolean inEncounter = false;
    static int encounterIndex = 0;
    static int actionsUntilEncounter = 5;
    static boolean triedToFlee = false;
    //</editor-fold>

    //<editor-fold desc="character stats">
    static String name = null;
    static int maxHP = 100;
    static int currentHP = maxHP;
    static double power = 1;
    static int lvl = 1;
    static double dodgeChn = 10;
    static double critChn = 10;
    static double hitChn = 50;
    static double[] weaponDMG = {1, 2};
    static double maxExp = 10;
    static double exp = 0;
    static int rebirth = 0;
    static int gold = 0;
    //</editor-fold>

    //<editor-fold desc="enemy stats">
    static int enmMaxHP;
    static int enmCurrentHP;
    static double enmPower;
    static int enmlvl;
    static int enmDodge;
    static int enmCritChn;
    static int enmHitChn;
    static int[] enmWeaponDMG;
    static boolean bossFight = false;
    static String[] enemyNames = {
            "gargoyle",
            "slime",
            "vilebeast",
            "stoneling",
            "terrorhound",
            "spiteflayer",
            "rotserpent",
            "bonebug",
            "wispwing",
            "cinderbeast",
            "murkwings",
            "horrorwraith",
            "plaguehound",
            "razorling",
            "dreadpaw",
            "doombrute",
            "gloomling",
            "thunderfiend",
            "emberbeast",
            "spiritfigure",
            "coffinflayer",
            "soulfiend",
            "dreadspawn",
            "hellmorph",
            "auravine",
            "umbrabeing",
            "dreadseeker",
            "stonemorph",
            "frightflayer",
            "gravespawn"
    };
    //</editor-fold>

    static final int critAmount = 2;

    //<editor-fold desc="items">
    public static Item[] CreateItems() {

        Item ringOfDestruction = new Item();
        ringOfDestruction.name = "Ring of Destruction";
        // ringOfDestruction.CreateItem(); this can probably be replaced with the "for each" loop

        Item maskOfDreams = new Item();
        maskOfDreams.name = "Mask of Dreams";

        Item swordOfLifeblood = new Item();
        swordOfLifeblood.name = "Sword of Lifeblood";

        Item dominionBox = new Item();
        dominionBox.name = "Dominion Box";

        Item oracleNecklace = new Item();
        oracleNecklace.name = "Oracle Necklace";

        Item keyOfEternalHealth = new Item();
        keyOfEternalHealth.name = "Key of Eternal Health";

        Item robesOfSanctity = new Item();
        robesOfSanctity.name = "Robes of Sanctity";

        Item chaosBook = new Item();
        chaosBook.name = "Chaos Book";

        Item amuletOfMania = new Item();
        amuletOfMania.name = "Amulet of Mania";

        Item goldMantle = new Item();
        goldMantle.name = "Gold Mantle";

        Item braceletOfMalediction = new Item();
        braceletOfMalediction.name = "Bracelet of Malediction";

        Item gauntletOfGold = new Item();
        gauntletOfGold.name = "Gauntlet of Gold";

        Item obsidianNecklace = new Item();
        obsidianNecklace.name = "Obsidian Necklace";

        Item ringOfSouls = new Item();
        ringOfSouls.name = "Ring of Souls";

        Item fleeceOfTheAether = new Item();
        fleeceOfTheAether.name = "Fleece of the Aether";

        Item chestOfStorms = new Item();
        chestOfStorms.name = "Chest of Storms";

        Item mysterySkull = new Item();
        mysterySkull.name = "Mystery Skull";

        Item staffOfEnthrallment = new Item();
        staffOfEnthrallment.name = "Staff of Enthrallment";

        Item ShieldOfTheGods = new Item();
        ShieldOfTheGods.name = "Shield of the Gods";

        Item swordOfLightness = new Item();
        swordOfLightness.name = "Sword of Lightness";

        Item braceletOfMalice = new Item();
        braceletOfMalice.name = "Bracelet of Malice";

        Item almightyGrimoire = new Item();
        almightyGrimoire.name = "Almighty Grimoire";

        Item rodOfMetamorphosis = new Item();
        rodOfMetamorphosis.name = "Rod of Metamorphosis";

        Item gauntletOfGrace = new Item();
        gauntletOfGrace.name = "Gauntlet of Grace";

        Item circletOfVirility = new Item();
        circletOfVirility.name = "Circlet of Virility";

        Item runesOfFate = new Item();
        runesOfFate.name = "Runes of Fate";

        Item keyOfTheElements = new Item();
        keyOfTheElements.name = "Key of the Elements";

        Item tabletOfFate = new Item();
        tabletOfFate.name = "Tablet of Fate";

        Item swordOfAllSeeing = new Item();
        swordOfAllSeeing.name = "Sword of All-Seeing";

        Item swordOfSouls = new Item();
        swordOfSouls.name = "Sword of Souls";

        return new Item[]{ringOfDestruction,
                swordOfLifeblood,
                maskOfDreams,
                dominionBox,
                oracleNecklace,
                keyOfEternalHealth,
                robesOfSanctity,
                chaosBook,
                amuletOfMania,
                goldMantle,
                braceletOfMalediction,
                gauntletOfGold,
                obsidianNecklace,
                ringOfSouls,
                fleeceOfTheAether,
                chestOfStorms,
                mysterySkull,
                staffOfEnthrallment,
                ShieldOfTheGods,
                swordOfLightness,
                braceletOfMalice,
                almightyGrimoire,
                rodOfMetamorphosis,
                gauntletOfGrace,
                circletOfVirility,
                runesOfFate,
                keyOfTheElements,
                tabletOfFate,
                swordOfAllSeeing,
                swordOfSouls};
    }

    // items
    public static Item[] items = CreateItems();

    // shop items
    public static int item1Index = 0;
    public static int item2Index = 0;
    public static int item3Index = 0;
    //</editor-fold>

    // Starts and controls the game
    public static void StartAdventure() {

        // true = active
        gameStatus = true;

        // creates the item-stats
        for (Item num : items) {num.CreateItem();}

        // this code names the character
        Scanner inputName = new Scanner(System.in);
        System.out.println("Name your character: ");
        name = inputName.nextLine();

        System.out.println("Write 'Help!' for text codes.");

        // Runs the game/simulation
        while (gameStatus) {

            Scanner input = new Scanner(System.in);
            System.out.println("What do you do?: ");
            String choice = input.nextLine();

            if (choice.equals("End game")) {gameStatus = false;}
            else if (choice.equals("Help")) {
                System.out.println("'Help!' lets you see all codes, can be done anywhere\n" +
                        "Outside encounter\n" +
                        "   'Walk' lets your character walk forward\n" +
                        "   'Turn Left' lets your character turn left\n" +
                        "   'Turn Right' lets your character turn right\n" +
                        "'Stats' lets you see your stats, can be done anywhere\n" +
                        "In enemy encounter:\n" +
                        "   'Attack' in combat this will make you attack\n" +
                        "   'Flee' in combat this will give you a chance to escape\n" +
                        "In Shop encounter:\n" +
                        "   'Item 1' shows item 1\n" +
                        "   'Item 2' shows item 2\n" +
                        "   'Item 3' shows item 3\n" +
                        "   'Buy' lets your choose what item to buy\n" +
                        "   'Leave' lets you leave the shop without buying something\n" +
                        "'End game' lets you end the game, can be done anywhere");
            }
            else if (choice.equals("Stats")) {
                System.out.println("Stats:\n" +
                        "Name: " + name +
                        "\nRebirts: " + rebirth +
                        "\nlvl: " + lvl +
                        "\nExp: " + exp + "/" + maxExp +
                        "\nHealth: " + maxHP + "/" + currentHP +
                        "\nPower: " + power +
                        "\nHit chance: " + hitChn + "%\n" +
                        "Critical strike chance:" + critChn + "%\n" +
                        "Dodge chance: " + dodgeChn + "%\n" +
                        "Gold: " + gold);
            }
            else if (!inEncounter) {

                //-----------------------------------------------
                switch (choice) {
                    case "Walk":
                        System.out.println("You walk forward");
                        actionsUntilEncounter -= 1;
                        break;
                    case "Turn Left":
                        System.out.println("You turn left");
                        actionsUntilEncounter -= 1;
                        break;
                    case "Turn Right":
                        System.out.println("You turn right");
                        actionsUntilEncounter -= 1;
                        break;
                }//-----------------end switch------------------

                // Start encounter
                if (actionsUntilEncounter == 0) {startEncounter();}

                //--------------------------------End (if encounter = false)--------------------------------
            } else if (inEncounter) {

                if (encounterIndex == 1) {

                    //-----------------------------------------------
                    switch (choice) {
                        case "Attack":
                            System.out.println("You attack the enemy");
                            Attack();
                            if (inEncounter) {
                                EnemyTurn();
                            }
                            break;
                        case "Flee":
                            if (rand.nextBoolean() && !triedToFlee) {
                                inEncounter = false;
                                triedToFlee = false;
                                System.out.println("You succeded in fleeing the enemy");
                            } else {
                                System.out.println("You failed in fleeing the enemy");
                                triedToFlee = true;
                            }
                            break;
                    }//---------------end switch------------------

                } else if (encounterIndex == 2) {

                    //-----------------------------------------------
                    switch (choice) {
                        case "Item 1":
                            System.out.println(items[item1Index].name +
                            "\nGives: " + items[item1Index].amount + items[item1Index].attribute +
                            "\nCosts: " + items[item1Index].cost +  " Gold");
                            break;
                        case "Item 2":
                            System.out.println(items[item2Index].name +
                                    "\nGives: " + items[item2Index].amount + items[item2Index].attribute +
                                    "\nCosts: " + items[item2Index].cost +  " Gold");
                            break;
                        case "Item 3":
                            System.out.println(items[item3Index].name +
                                    "\nGives: " + items[item3Index].amount + items[item3Index].attribute +
                                    "\nCosts: " + items[item3Index].cost +  " Gold");
                            break;
                        case "Buy":
                            Scanner inputShop = new Scanner(System.in);
                            System.out.println("What item would you like to buy?('1', '2' or '3'): ");
                            String itemChoice = inputShop.nextLine();
                            switch (itemChoice) {
                                case "1" -> BuyItem(items[item1Index]);
                                case "2" -> BuyItem(items[item2Index]);
                                case "3" -> BuyItem(items[item3Index]);
                            }
                            inEncounter = false;
                            break;
                        case "Leave":
                            inEncounter = false;
                            break;
                    }//---------------end switch------------------

                }

            }//-----------------------------------End (if encounter = true)------------------------------------

            if (exp >= maxExp) {lvlUp();}

        } // Ending while loop

    } // Ending void

    // Generates the stats for the enemy
    public static void EnemyStats() {

        /* = rand.nextInt((max - min) + 1) + min*/
        // enemy stats
        enmlvl = rand.nextInt(((lvl + 5) - (lvl - 5)) + 1) + (lvl - 5);
        enmMaxHP = rand.nextInt((int) (((lvl * 2.5) - (lvl / 1.5)) + 1)) + (int) (lvl /1.5);
        enmCurrentHP = enmMaxHP;

        if (enmlvl >= 1 && enmlvl < 10) {

            while (enmPower == 0 || enmPower < 1.0 && enmPower > 1.1) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((4 - 1) + 1) + 1;
            enmCritChn = rand.nextInt((4 - 1) + 1) + 1;
            enmHitChn = rand.nextInt((45 - 40) + 1) + 40;
            enmWeaponDMG[0] = rand.nextInt((10 - 6) + 1) + 6;
            enmWeaponDMG[1] = rand.nextInt((14 - 10) + 1) + 10;

        } else if (enmlvl >= 10 && enmlvl < 20) {

            while (enmPower == 0 || enmPower <= 1.1 && enmPower > 1.2) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((8 - 4) + 1) + 4;
            enmCritChn = rand.nextInt((8 - 4) + 1) + 4;
            enmHitChn = rand.nextInt((50 - 45) + 1) + 45;
            enmWeaponDMG[0] = rand.nextInt((14 - 10) + 1) + 10;
            enmWeaponDMG[1] = rand.nextInt((18 - 14) + 1) + 14;

        } else if (enmlvl >= 20 && enmlvl < 30) {

            while (enmPower == 0 || enmPower <= 1.2 && enmPower > 1.3) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((12 - 8) + 1) + 8;
            enmCritChn = rand.nextInt((12 - 8) + 1) + 8;
            enmHitChn = rand.nextInt((55 - 50) + 1) + 50;
            enmWeaponDMG[0] = rand.nextInt((18 - 14) + 1) + 14;
            enmWeaponDMG[1] = rand.nextInt((22 - 18) + 1) + 18;

        } else if (enmlvl >= 30 && enmlvl < 40) {

            while (enmPower == 0 || enmPower <= 1.3 && enmPower > 1.4) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((16 - 12) + 1) + 12;
            enmCritChn = rand.nextInt((16 - 12) + 1) + 12;
            enmHitChn = rand.nextInt((60 - 55) + 1) + 55;
            enmWeaponDMG[0] = rand.nextInt((22 - 18) + 1) + 18;
            enmWeaponDMG[1] = rand.nextInt((26 - 22) + 1) + 22;

        } else if (enmlvl >= 40 && enmlvl < 50) {

            while (enmPower == 0 || enmPower <= 1.4 && enmPower > 1.5) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((20 - 16) + 1) + 16;
            enmCritChn = rand.nextInt((20 - 16) + 1) + 16;
            enmHitChn = rand.nextInt((65 - 60) + 1) + 60;
            enmWeaponDMG[0] = rand.nextInt((26 - 22) + 1) + 2;
            enmWeaponDMG[1] = rand.nextInt((30 - 26) + 1) + 26;

        } else if (enmlvl >= 50 && enmlvl < 60) {

            while (enmPower == 0 || enmPower <= 1.5 && enmPower > 1.6) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((24 - 20) + 1) + 20;
            enmCritChn = rand.nextInt((24 - 20) + 1) + 20;
            enmHitChn = rand.nextInt((70 - 65) + 1) + 65;
            enmWeaponDMG[0] = rand.nextInt((30 - 26) + 1) + 26;
            enmWeaponDMG[1] = rand.nextInt((34 - 30) + 1) + 30;

        } else if (enmlvl >= 60 && enmlvl < 70) {

            while (enmPower == 0 || enmPower <= 1.6 && enmPower > 1.7) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((28 - 24) + 1) + 24;
            enmCritChn = rand.nextInt((28 - 24) + 1) + 24;
            enmHitChn = rand.nextInt((75 - 70) + 1) + 70;
            enmWeaponDMG[0] = rand.nextInt((34 - 30) + 1) + 30;
            enmWeaponDMG[1] = rand.nextInt((38 - 34) + 1) + 34;

        } else if (enmlvl >= 70 && enmlvl < 80) {

            while (enmPower == 0 || enmPower <= 1.7 && enmPower > 1.8) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((32 - 28) + 1) + 28;
            enmCritChn = rand.nextInt((32 - 28) + 1) + 28;
            enmHitChn = rand.nextInt((80 - 75) + 1) + 75;
            enmWeaponDMG[0] = rand.nextInt((38 - 34) + 1) + 34;
            enmWeaponDMG[1] = rand.nextInt((42 - 38) + 1) + 38;

        } else if (enmlvl >= 80 && enmlvl < 90) {

            while (enmPower == 0 || enmPower <= 1.8 && enmPower > 1.9) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((36 - 32) + 1) + 32;
            enmCritChn = rand.nextInt((36 - 32) + 1) + 32;
            enmHitChn = rand.nextInt((85 - 80) + 1) + 80;
            enmWeaponDMG[0] = rand.nextInt((42 - 38) + 1) + 38;
            enmWeaponDMG[1] = rand.nextInt((46 - 42) + 1) + 42;

        } else if (enmlvl >= 90 && enmlvl < 100) {

            while (enmPower == 0 || enmPower <= 1.9 && enmPower > 2) {enmPower = rand.nextDouble() + 1.0;}
            enmDodge = rand.nextInt((40 - 36) + 1) + 36;
            enmCritChn = rand.nextInt((40 - 36) + 1) + 36;
            enmHitChn = rand.nextInt((90 - 85) + 1) + 85;
            enmWeaponDMG[0] = rand.nextInt((46 - 42) + 1) + 42;
            enmWeaponDMG[1] = rand.nextInt((50 - 46) + 1) + 46;

        } else if (enmlvl >= 100) {

            enmlvl = 100;
            enmMaxHP = 1000;
            enmCurrentHP = enmMaxHP;
            enmPower = 2;
            enmDodge = 50;
            enmCritChn = 50;
            enmHitChn = 100;
            enmWeaponDMG[0] = 50 * (1 + (rebirth / 50));
            enmWeaponDMG[1] = 75 * (1 + (rebirth / 50));

        }

    }

    // This method lets the enemy take a turn
    public static void EnemyTurn() {

        double damage = rand.nextInt((enmWeaponDMG[1] + enmWeaponDMG[0]) + 1) + enmWeaponDMG[0];
        damage *= power;

        boolean hit = false;
        if ((rand.nextInt((100 + 1) + 1) + 1) >= enmHitChn) {hit = true;}
        boolean dodge = false;
        if ((rand.nextInt((100 + 1) + 1) + 1) <= dodgeChn) {dodge = true;}
        boolean crit = false;
        if ((rand.nextInt((100 + 1) + 1) + 1) <= enmCritChn) {crit = true;}

        // hit or miss
        if (hit) {

            System.out.println("The enemy missed");

            // enemy dodge or not
        } else if (dodge) {

            System.out.println("You dodged the enemy attack");

        } else {

            if (crit) {

                damage *= critAmount;
                System.out.println("The enemy critical strike you for: " + damage);

            } else {

                System.out.println("The enemy hit you for: " + damage);

            }

            currentHP -= damage;
            System.out.println("Your HP: " + currentHP);

        }

        if (currentHP <= 0) {

            System.out.println("You got destroyed by the enemy and eaten");
            gameStatus = false;
            inEncounter = false;

        }

    }

    // This method lets the player attack
    public static void Attack() {

        double damage = rand.nextInt((int)(weaponDMG[1] + weaponDMG[0]) + 1) + weaponDMG[0];
        damage *= power;

        boolean hit = false;
        if ((rand.nextInt((100 + 1) + 1) + 1) >= hitChn) {hit = true;}
        boolean dodge = false;
        if ((rand.nextInt((100 + 1) + 1) + 1) <= enmDodge) {dodge = true;}
        boolean crit = false;
        if ((rand.nextInt((100 + 1) + 1) + 1) <= critChn) {crit = true;}

        // hit or miss
        if (hit) {

            System.out.println("You missed");

        // enemy dodge or not
        } else if (dodge) {

            System.out.println("The enemy dodged your attack");

        } else {

            if (crit) {

                damage *= critAmount;
                System.out.println("You critical strike the enemy for: " + damage);

            } else {

                System.out.println("You hit the enemy for: " + damage);

            }

            enmCurrentHP -= damage;
            System.out.println("Enemy HP: " + enmCurrentHP);

        }

        if (enmCurrentHP <= 0 && !bossFight) {

            System.out.println("You defeated the enemy");
            exp += enmlvl;
            gold += enmlvl;
            enmPower = 0;
            inEncounter = false;

        } else {

            System.out.println("You defeated the boss and were reincarnated again when the boss reincarnated centuries after its death.");
            rebirth += 1;
            maxHP = 100;
            currentHP = maxHP;
            power = 1;
            lvl = 1;
            dodgeChn = 10;
            critChn = 10;
            hitChn = 50;
            weaponDMG[0] = 1;
            weaponDMG[1] = 2;
            maxExp = 10;
            exp = 0;
            gold = 0;
            inEncounter = false;

        }

    }

    // Makes sure the character can lvl up
    public static void lvlUp() {

        exp = 0;
        maxExp += 50;
        lvl += 1;
        maxHP += (lvl / 10);
        currentHP = maxHP;
        power += 0.01;
        if (dodgeChn < 35 && critChn < 35) {
            dodgeChn += (0.25 * (1 + (rebirth / 10)));
            critChn += (0.25 * (1 + (rebirth / 10)));
        }
        if (hitChn < 95) {hitChn += (0.25 * (1 + (rebirth / 10)));}
        weaponDMG[0] += (1 / 75);
        weaponDMG[1] += (1 / 60);

    }

    // Buy item
    public static void BuyItem(Item item) {

        gold = (int) item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[0];
        maxHP = (int) item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[1];
        power = item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[2];
        dodgeChn = item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[3];
        critChn = item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[4];
        hitChn = item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[5];
        weaponDMG[0] = item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[6];
        weaponDMG[1] = item.Buy(gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMG[0], weaponDMG[1])[7];

    }

    // starts encounters
    public static void startEncounter() {

        // Encounter set to active
        inEncounter = true;

        // Resetting actions needed to activate another encounter
        actionsUntilEncounter = rand.nextInt((10 - 1) + 1) + 1;

        // Encounter 1 or 2
        encounterIndex = rand.nextInt((2 - 1) + 1) + 1;

        if (encounterIndex == 1) {

            // Enemy encounter
            EnemyStats();
            if (enmlvl >= 100) {
                System.out.println("!!!!!You have encountered the big boss: The Bloodthirsty Doom Drake!!!!!");
                bossFight = true;
            }
            else {System.out.println("You have encountered a " + enemyNames[rand.nextInt(enemyNames.length)]);}

        } else if (encounterIndex == 2) {

            // Shop encounter
            item1Index = rand.nextInt(items.length);
            while (item2Index == 0 || item2Index == item1Index) {item2Index = rand.nextInt(items.length);}
            while (item3Index == 0 || item3Index == item1Index || item3Index == item2Index) {item3Index = rand.nextInt(items.length);}

        }

    }

} // Ending class

class Item {

    public String name;
    public String attribute;
    public double amount;
    public int cost;

    // randomizer
    Random rand = new Random();

    public void CreateItem() {

        int attributeIndex = rand.nextInt((6 - 1) + 1) + 1;

        switch (attributeIndex) {
            case 1:
                attribute = "max HP";
                amount = rand.nextInt((10 - 1) + 1) + 1;
                cost = (int)amount;
                break;
            case 2:
                attribute = "power";
                amount = (rand.nextInt((10 - 1) + 1) + 1) / 10;
                cost = (int)(amount * 10) * 20;
                break;
            case 3:
                attribute = "dodge chance";
                amount = rand.nextInt((5 - 1) + 1) + 1;
                cost = (int)amount * 10;
                break;
            case 4:
                attribute = "critical chance";
                amount = rand.nextInt((5 - 1) + 1) + 1;
                cost = (int)amount * 10;
                break;
            case 5:
                attribute = "hit chance";
                amount = rand.nextInt((5 - 1) + 1) + 1;
                cost = (int)amount * 3;
                break;
            case 6:
                attribute = "weapon damage";
                amount = rand.nextInt((5 - 1) + 1) + 1;
                cost = (int)amount * 15;
                break;
        }

    }

    public double[] Buy(double gold, double maxHP, double power, double dodgeChn, double critChn, double hitChn, double weaponDMGMin, double weaponDMGMax) {

        gold -= cost;

        switch (attribute) {
            case "max HP" -> maxHP += amount;
            case "power" -> power += amount;
            case "dodge chance" -> dodgeChn += amount;
            case "critical chance" -> critChn += amount;
            case "hit chance" -> hitChn += amount;
            case "weapon damage" -> {
                weaponDMGMin += amount;
                weaponDMGMax += amount;
            }
        }

        return new double[]{gold, maxHP, power, dodgeChn, critChn, hitChn, weaponDMGMin, weaponDMGMax};
    }

}
