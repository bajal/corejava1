enum nonNumericCards{
	Ace('A'),Jack('J'),King('K'),Queen('Q');
private char symbol;
nonNumericCards(char c){
symbol=c;
}
char getSymbol(){ return symbol;}
}

enum deckTypes{
	Hearts("Hearts"),Clove("Clove"),Diamond("Diamond"),Spade("Spade");
private String deck;
deckTypes(String de){
	deck= de;
}
String getDeckType(){ return deck;}
}


class card
{
	private String type;
	private char value;

	card(){
	}

	String getType(){
	return type;
	}
	char getValue(){
	return value;
	}
	
	void setType(String ty){
	boolean flag=false;
	for(deckTypes i: deckTypes.values()){
	if (i.getDeckType() == ty) flag = true;
	}
	if(flag) type=ty;
	else {System.out.println("Invalid deckName passed to make a card.");
	type="null";
	}}
	void setValue(char val){
	boolean flag = false;
	for(nonNumericCards i: nonNumericCards.values()){
	if (i.getSymbol() == val) flag = true;
	}
	if(flag) value=val;
	else{ System.out.println("Invalid Value passed to make a card.");
	value='0';
	}
	}

};

class  cardsDeck
{
	public static void main(String[] args) 
	{
		card myCard1	= new card ();
		card myCard2	= new card ();
		
		myCard1.setValue('A');
		myCard1.setType("Clove");

		myCard2.setValue('Q');
		myCard2.setType("Hearts");
		
		if(myCard1.getType() != "null" && myCard1.getValue() !='0')
		System.out.println(myCard1.getType() + "\t:"+  myCard1.getValue()) ;
		if(myCard2.getType() != "null" && myCard2.getValue() !='0')
		System.out.println(myCard2.getType() + "\t:"+  myCard2.getValue()) ;
	}
}
