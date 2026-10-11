
public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
	this.id = id;
	this.name = name;
    }

    public String getId() {
	return id;
    }

    public String getName() {
	return name;
    }
    
//    public boolean equals(Object item) {
//	if(this == item) {
//	    return true;
//	}
//	if(!(item instanceof Item)) {
//	    return false;
//	}
//	
//	Item comparedItem = (Item)item;
//	
//	return
//		this.name.equals(comparedItem.name) &&
//		this.id.equals(comparedItem.id);
//    }
}
