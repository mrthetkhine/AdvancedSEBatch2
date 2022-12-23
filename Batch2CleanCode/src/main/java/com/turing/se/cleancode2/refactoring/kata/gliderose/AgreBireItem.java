package com.turing.se.cleancode2.refactoring.kata.gliderose;

public class AgreBireItem extends NormalItem
{
	 public AgreBireItem(Item item) 
	 {
		 super(item);
	 }
	 @Override
	 protected void updateQualityBeforeSellIn()
	 {
		if(this.isQualityUnderUpperLimit())
		{
			this.quality = this.quality + 1;
		}
	 }
 
   @Override
   protected void updateAfterSellInDate()
   {
   	 if (isSellInLowerThanLimit() && isQualityUnderUpperLimit())
   	 {
   		 this.quality = this.quality + 1;
   	 }
   	 
   }
}