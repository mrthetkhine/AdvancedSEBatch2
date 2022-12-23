package com.turing.se.cleancode2.refactoring.kata.gliderose;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class ItemFactory {
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	
	static HashMap<String,Class> itemClass = new HashMap<String,Class>();
	
	static
	{
		itemClass.put(AGED_BRIE, AgreBireItem.class);
		itemClass.put(BACKSTAGE, BackStageItem.class);
		itemClass.put(SULFURAS, SulfuarsItem.class);
	}
	public static NormalItem getItem(Item item)
    {
    	String itemName = item.name;
    	Class clazz = itemClass.get(itemName);
    	if( clazz != null)
    	{
    		try {
				Constructor constructor = clazz.getConstructor(Item.class);
				NormalItem normalItem = (NormalItem)constructor.newInstance(item);
				return normalItem;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
    		return new NormalItem(item);
    	}
    	else
    	{
    		return new NormalItem(item);
    	}
    }
}
