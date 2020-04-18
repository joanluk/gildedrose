package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.Backstage;
import com.gildedrose.items.Conjured;
import com.gildedrose.items.Dexterity;
import com.gildedrose.items.Elixir;
import com.gildedrose.items.Sulfuras;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");
        Item[] items = new Item[]{
                new Dexterity(10, 20), //
                new AgedBrie(2, 0), //
                new Elixir(5, 7), //
                new Sulfuras(0, 80), //
                new Sulfuras(-1, 80),
                new Backstage(15, 20),
                new Backstage(10, 49),
                new Backstage(5, 49),
                // this conjured item does not work properly yet
                new Conjured(3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 4;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
