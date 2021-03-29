package com.BohdanKarp;

public class Money {
    private long banknotes;
    private byte cent;

    Money() {
        banknotes = 0;
        cent = 0;
    }

    Money(long banknotes, byte cent) {
        if (banknotes >= 0)
            this.banknotes = banknotes;
        else System.out.println("!Error: banknotes has been positive");
        if (cent >= 0 && cent < 100)
            this.cent = cent;
        else System.out.println("!Error: cent has been positive & Less 100");
    }

    Money(Money money) {
        this.banknotes = money.banknotes;
        this.cent = money.cent;
    }

    @Override
    public String toString() {
        if (cent < 10) {
            return banknotes + ",0" + cent;
        } else return banknotes + "," + cent;
    }

    public void add(Money money) {
        if (money.cent + this.cent > 99) {
            this.cent += money.cent - 100;
            this.banknotes += money.banknotes + 1;
        } else {
            this.cent += money.cent;
            this.banknotes += money.banknotes;
        }
    }

    public void minus(Money money) {
        if (this.cent < money.cent) {
            if (this.banknotes - 1 - money.banknotes >= 0) {
                this.cent -= money.cent - 100;
                this.banknotes -= money.banknotes + 1;
            } else System.out.println("!Error:insufficient funds");
        } else if (this.banknotes - money.banknotes >= 0) {
            this.cent -= money.cent;
            this.banknotes -= money.banknotes;
        } else System.out.println("!Error:insufficient funds");
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        if (this.banknotes == money.banknotes && this.cent == money.cent) {
            return true;
        } else return false;
    }

    public long toCent() {
        return this.banknotes * 100 + this.cent;
    }

    public Money toMoney(long cent) {
        return new Money(cent / 100, (byte) (cent % 100));
    }

    public Money multiplication(Money money) {
        return toMoney(this.toCent() * money.toCent() / 100);
    }

    public Money multiplication(double мultiplier) {
        return toMoney((long) (this.toCent() * мultiplier));
    }

    public Money div(Money money) {
        return toMoney(this.toCent() * 100 / money.toCent());
    }

    public Money div(double multiplier) {
        return toMoney((long) (this.toCent() / multiplier));
    }

}
