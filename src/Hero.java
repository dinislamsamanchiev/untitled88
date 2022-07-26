public class Hero {package com.company;

    public class Hero {
        private int hEroHit;
        private int hEroHealth;
        private String sPosobnost;

        public Hero(int hEroHit, int HeroHealth, String sPosobnost) {
            this.hEroHit = hEroHit;
            this.hEroHealth = HeroHealth;
            this.sPosobnost = sPosobnost;
        }

        public Hero(int hEroHit,int HeroHealth) {
            this.hEroHit = hEroHit;
            this.hEroHealth = HeroHealth;
        }

        public int gethEroHit() {
            return hEroHit;
        }

        public int gethEroHealth() {
            return hEroHealth;
        }

        public String getsPosobnost() {
            return sPosobnost;
        }
    }
}
