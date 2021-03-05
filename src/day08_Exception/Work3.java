package day08_Exception;

import java.util.Random;

class Work3
{
	public static void main(String[] args){
		Random ran = new Random();
		int cost = ran.nextInt(15)+16;
		try{
		XM xm = new XM(22);
		xm.pay(cost);
		}catch(NotEnoughMoneyException e){
			e.printStackTrace();
		}
	}
}

class XM
{
	private int money;
	XM(){}
	XM(int money){
		this.money = money;
	}

	void pay(int cost){
		if(money - cost >=0)	//钱够
			System.out.println("可以支付了");
		else
			throw new NotEnoughMoneyException("钱不够");			
	}
}

class NotEnoughMoneyException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	NotEnoughMoneyException(){}
	NotEnoughMoneyException(String message){
		super(message);
	}
}