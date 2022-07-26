public class Main {package com.company;

    public class Main {

        public static void main(String[] args) {

            Boss dArius = new Boss();
            dArius.setBossDamage(50);
            dArius.setBossHealth(200);
            dArius.setBossDefenseType("Physic");
            System.out.println(dArius.getBossDefenseType() + " " + dArius.getBossDamage() + " " + dArius.getBossHealth());
            for (int i = 0; i <createHeroes().length ; i++) {
                System.out.println("health-" + createHeroes()[i].gethEroHealth()+ " "+" /  Heroes hit-"+createHeroes()[i].gethEroHit()+" "
                        + " /  Sposobnost-" + createHeroes()[i].getsPosobnost());

            }

        }

        public static Hero[] createHeroes() {
            Hero zIlong = new Hero(20, 100, "Fast Attact");
            Hero aLlukard = new Hero(30, 100, "Vampirism");
            Hero mArtis = new Hero(25, 100, "Oglushenie");

            Hero[] Boes = {zIlong, aLlukard, mArtis};
            return Boes;

        }
    }

}