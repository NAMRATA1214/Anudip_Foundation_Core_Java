import java.io.Serializable;

public class Vehicle
	{
		private String color;
		

		//Getter
		public String getColor()
		{
			return color;
		}

		//Setter
		public void setColor(String c)
		{
			this.color = c;
		}
		
		public static void main(String[] args) 
		{
			Vehicle v=new Vehicle();
			v.setColor("Red");
			System.out.println(v.getColor());
		
		}


	}


