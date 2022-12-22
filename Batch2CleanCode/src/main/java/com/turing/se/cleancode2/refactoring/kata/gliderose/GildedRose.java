package com.turing.se.cleancode2.refactoring.kata.gliderose;

public class GildedRose {
    private static final int SELL_IN_LOWER_LIMIT = 0;
	private static final int QTY_UPPER_LIMIT = 50;
	private static final int QTY_LOWER_LIMIT = 0;
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update() {
        for (Item item : items) {
        	
        	String itemName = item.name;
        	//Update quality
        	//Not Aged brie && not Backstage passes to a TAFKAL80ETC concert && not "Sulfuras, Hand of Ragnaros"
        	//we will reduce item quality.
            if (!itemName.equals(AGED_BRIE)
                    && !itemName.equals(BACKSTAGE)) 
            {
            	//impose lower limit
                if (item.quality > QTY_LOWER_LIMIT) 
                {
                    if (!itemName.equals(SULFURAS)) 
                    {
                        item.quality = item.quality - 1;
                    }
                }
            } 
            else 
            {
            	//it is "Aged Brie" && "Backstage passes to a TAFKAL80ETC"
            	//expose upper limit
                updateQualityForAgeBrieAndBackStage(item);
            }

            updateSellIn(item);

            //pass sell in date 
            if (item.sellIn < SELL_IN_LOWER_LIMIT) {
                if (!itemName.equals(AGED_BRIE)) {
                    if (!itemName.equals(BACKSTAGE)) 
                    {
                        if (item.quality > QTY_LOWER_LIMIT) {
                            if (!itemName.equals(SULFURAS)) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } 
                    //Backstage Quality drops to 0 after the concert
                    else 
                    {
                        item.quality = 0;
                    }
                } 
                //Age brie increase quality if sell in date pass
                else 
                {
                    if (item.quality < QTY_UPPER_LIMIT) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

	private void updateQualityForAgeBrieAndBackStage(Item item) {
		String itemName = item.name;
		if (item.quality < QTY_UPPER_LIMIT) 
		{
		    item.quality = item.quality + 1;

		    if (itemName.equals(BACKSTAGE)) 
		    {
		    	// sell in is 10 day or less
		        if (item.sellIn < 11) 
		        {
		            if (item.quality < QTY_UPPER_LIMIT) 
		            {
		                item.quality = item.quality + 1;
		            }
		        }
		        //5 day or less
		        //
		        if (item.sellIn < 6) 
		        {
		            if (item.quality < QTY_UPPER_LIMIT) 
		            {
		            	//this will be increased by 3 now.
		                item.quality = item.quality + 1;
		            }
		        }
		    }
		}
	}

	private void updateSellIn(Item item) {
		 String itemName = item.name;
		//update sell-in
		if (!itemName.equals(SULFURAS)) {
		    item.sellIn = item.sellIn - 1;
		}
	}
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item(AGED_BRIE, 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item(SULFURAS, 0, 80), //
                new Item(SULFURAS, -1, 80),
                new Item(BACKSTAGE, 15, 20),
                new Item(BACKSTAGE, 10, 49),
                new Item(BACKSTAGE, 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
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
            app.update();
        }
    }
}