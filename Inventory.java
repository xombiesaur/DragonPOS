public class Inventory{
	Item[] items;
	int numItems;

	public Inventory(){
		for(int i = 1; i < 201; i++){
			items[i-1] = new Item("test item "+i, i, i);
		}
		numItems = i - 1;
	}

	public Item getItemByID(String id){
		for(int i = 0; i < numItems; i++){
			if(items[i].getItemID() == id){
				return items[i];
			}
		}
		return null;
	}
}
