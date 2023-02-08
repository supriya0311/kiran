
class Car
{
	int car_cost;
	String car_model_name;
	String car_clr;
	Car(int a,String b,String c)
	{
		car_cost=a;
		car_model_name=b;
		car_clr=c;
		return;
	}
	public static void main(String[] args) 
	{
		Car c11=new Car(600000,"Shift","white");
		System.out.println(c1.car_cost);
        System.out.println(c1.car_model_name);
		System.out.println(c1.car_clr);
	}
}
