class Dice{

    private int num;

    public Dice(){
	this.roll();
    }

    public void roll(){
	num=(int)(Math.random()*6)+1;
    }

    public int getNumber(){
	return num;
    }

    public void setNumber(int n){
	num=n;
    }
}

public class DiceGame{
    public static void main(String[] args){

	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	System.out.println("Rolling the dice...");
	System.out.println("Dice 1: "+dice1.getNumber());
	System.out.println("Dice 2: "+dice2.getNumber());

	System.out.println("Total value: "+(dice1.getNumber()+dice2.getNumber()));
	
    }
}
