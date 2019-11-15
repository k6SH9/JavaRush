package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Petya";

        Zerg zerg2 = new Zerg();
        zerg2.name = "roman";

        Zerg zerg3 = new Zerg();
        zerg3.name = "ilya";

        Zerg zerg4 = new Zerg();
        zerg4.name = "vasya";

        Zerg zerg5 = new Zerg();
        zerg5.name = "alex";


        Protoss protoss1 = new Protoss();
        protoss1.name = "hleb";


        Protoss protoss2 = new Protoss();
        protoss2.name = "milk";

        Protoss protoss3 = new Protoss();
        protoss3.name = "phone";


        Terran terran1 = new Terran();
        terran1.name = "ira";

        Terran terran2 = new Terran();
        terran2.name = "sam";

        Terran terran3 = new Terran();
        terran3.name = "log";

        Terran terran4 = new Terran();
        terran4.name = "csgo";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
