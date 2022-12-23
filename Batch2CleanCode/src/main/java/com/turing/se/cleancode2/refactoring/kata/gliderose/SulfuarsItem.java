package com.turing.se.cleancode2.refactoring.kata.gliderose;

public class SulfuarsItem extends NormalItem
{
	 public SulfuarsItem(Item item) 
	 {
      super(item);
	 }
	 @Override
	 protected void updateQualityBeforeSellIn()
	 {
		//Do Nothing
	 }
	 @Override
	 protected void updateSellIn()
    {
   	//Do nothing.
    }
   @Override
   protected void updateAfterSellInDate()
   {
   	 //Do Nothing
   }
}