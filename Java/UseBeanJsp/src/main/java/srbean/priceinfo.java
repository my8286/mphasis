package srbean;
public class priceinfo
{
private String name;
private float price;
public void setProduct(String na)
{
this.name=na;
}
public String getPrice()
{
if(name.equals("Paneer Biryani"))
return "Price:200rs";
else if(name.equals("Fried Rice"))
return "Price:400rs";
else if(name.equals("Jeera Rice"))
return "Price:100rs";
else if(name.equals("Paneer"))
	return "Price:200rs";
else if(name.equals("Tandoori"))
return "Price:50rs";
else
return "Sorry Invalied entry";
}
}