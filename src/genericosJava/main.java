package genericosJava;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<String> genericClass1;
		try {
			//constructo integer clase string
			genericClass1 = new GenericClass<>(5);
			genericClass1.add("Hola");
			
			
			//constructor string , clase integer
			GenericClass genericClass2 = new GenericClass("Hola");
			genericClass2.add(5);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
