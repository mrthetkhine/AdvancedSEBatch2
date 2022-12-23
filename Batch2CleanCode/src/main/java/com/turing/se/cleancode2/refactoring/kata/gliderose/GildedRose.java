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
        	NormalItem normalItem = ItemFactory.getItem(item);
        	
        	normalItem.update();
        	normalItem.setItemData(item);
        	
        }
    }
    

    /*
	private void updateQualityBeforeSellIn(Item item) {
		String itemName = item.name;
		if(itemName.equals(AGED_BRIE) )
		{
			updateQualityForAgeBrie(item);
		}
		else if(itemName.equals(BACKSTAGE))
		{
			 updateQualityForBackStage(item);
		}
		else if(itemName.equals(SULFURAS))
		{
			//do nothing for SULFURAS
		}
		else 
		{
			//impose lower limit
		    if (isQualityHigherThanLowerLimit(item)) 
		    {
		    	item.quality = item.quality - 1;
		    }
		}
	}

	private boolean isSellInLowerThanLimit(Item item) {
		return item.sellIn < SELL_IN_LOWER_LIMIT;
	}

	private boolean isQualityHigherThanLowerLimit(Item item) {
		return item.quality > QTY_LOWER_LIMIT;
	}

	private void updateAfterSellInDate(Item item) {
		String itemName = item.name;
		
		 if (isSellInLowerThanLimit(item)) {
			 if(itemName.equals(AGED_BRIE))
			 {
				 if (isQualityUnderUpperLimit(item)) 
				 {
				    item.quality = item.quality + 1;
				 }
			 }
			 else if(itemName.equals(BACKSTAGE))
			 {
				 item.quality = 0;
			 }
			 else if(itemName.equals(SULFURAS))
			 {
				 //Do nothing;
			 }
			 else
			 {
				 if (isQualityHigherThanLowerLimit(item)) 
				 {
					 item.quality = item.quality - 1;
			     }
				   
			} 
				
		 }
		
	}
	void updateQualityForAgeBrie(Item item)
	{
		if(this.isQualityUnderUpperLimit(item))
		{
			item.quality = item.quality + 1;
		}
		
	}


	private void updateQualityForBackStage(Item item) {
		if(this.isQualityUnderUpperLimit(item))
		{
			item.quality = item.quality + 1;
			// sell in is 10 day or less
			if (item.sellIn < 11) 
			{
			    if (isQualityUnderUpperLimit(item)) 
			    {
			        item.quality = item.quality + 1;
			    }
			}
			//5 day or less
			//
			if (item.sellIn < 6) 
			{
			    if (isQualityUnderUpperLimit(item)) 
			    {
			    	//this will be increased by 3 now.
			        item.quality = item.quality + 1;
			    }
			}
		}
		
	}

	private boolean isQualityUnderUpperLimit(Item item) {
		return item.quality < QTY_UPPER_LIMIT;
	}

	private void updateSellIn(Item item) {
		 String itemName = item.name;
		//update sell-in
		if (!itemName.equals(SULFURAS)) {
		    item.sellIn = item.sellIn - 1;
		}
	}
	*/
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