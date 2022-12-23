package com.turing.se.cleancode2.refactoring.kata.gliderose;

public class BackStageItem extends NormalItem
{
	 public BackStageItem(Item item) 
	 {
      super(item);
	 }
	 @Override
	 protected void updateQualityBeforeSellIn()
	 {
		 if(this.isQualityUnderUpperLimit())
			{
				this.quality = this.quality + 1;
				// sell in is 10 day or less
				if (this.sellIn < 11) 
				{
				    if (isQualityUnderUpperLimit()) 
				    {
				        this.quality = this.quality + 1;
				    }
				}
				//5 day or less
				//
				if (this.sellIn < 6) 
				{
				    if (isQualityUnderUpperLimit()) 
				    {
				    	//this will be increased by 3 now.
				        this.quality = this.quality + 1;
				    }
				}
			}
	 }
 
   @Override
   protected void updateAfterSellInDate()
   {
   	
   	 if (isSellInLowerThanLimit())
   	 {
   		 this.quality = 0;
   	 }
   	 
   }
}