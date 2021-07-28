package package3;

public class Insurance {
	int insno;
	String instype;
	int premium;
	Insurance(int insno,String instype,int premium){
		this.insno=insno;
		this.instype=instype;
		this.premium=premium;
	}
	public String toString()
	{
		return "insno:"+insno+" instype:"+instype+" premium:"+premium;
	}

}
