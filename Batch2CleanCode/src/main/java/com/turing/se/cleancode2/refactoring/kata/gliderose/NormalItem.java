package com.turing.se.cleancode2.refactoring.kata.gliderose;

public class NormalItem extends Item{
	 private static final int SELL_IN_LOWER_LIMIT = 0;
	 private static final int QTY_UPPER_LIMIT = 50;
	 private static final int QTY_LOWER_LIMIT = 0;
	 public NormalItem(Item item) 
	 {
       super(item.name,item.sellIn,item.quality);
	 }
	 protected boolean isQualityHigherThanLowerLimit() {
			return this.quality > QTY_LOWER_LIMIT;
	 }
	 protected boolean isQualityUnderUpperLimit() {
			return this.quality < QTY_UPPER_LIMIT;
	 }
	 protected boolean isSellInLowerThanLimit() {
			return this.sellIn < SELL_IN_LOWER_LIMIT;
	}
	 public void update()
	 {
		this.updateQualityBeforeSellIn();
     	this.updateSellIn();
     	this.updateAfterSellInDate();
	 }

	 protected void updateQualityBeforeSellIn()
	 {
		if (this.isQualityHigherThanLowerLimit()) 
	    {
	    	this.quality = this.quality - 1;
	    }
	 }
	 protected void updateSellIn()
     {
    	 this.sellIn = this.sellIn - 1;
     }
	 protected void updateAfterSellInDate()
     {
    	 if (isSellInLowerThanLimit() && isQualityHigherThanLowerLimit())
    	 {
    		 this.quality = this.quality - 1;
    	 }
    	
     }
     public void setItemData(Item item)
     {
    	 item.quality = this.quality;
    	 item.sellIn = this.sellIn;
     }
}


