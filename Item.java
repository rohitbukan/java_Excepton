
public class Item {
	String itemid;
	String name;
	int cost;
	
	Item(String itemid,String name,int cost){
		
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
	void disp() {
		System.out.println(itemid+" \n"+name+"\n"+cost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i=new Item("aaa","Thums-Up",60);
		i.disp();
	}

}
