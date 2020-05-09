package exercicio;


public class ArrayHelper {
	public static CD[] push(int n, String nome, int p, String a) 
    { 
        CD newarr[] = new CD[n]; 

        for (int i = 0; i < n; i++) 
            newarr[i] = new CD(nome, p, a); 
  
        return newarr; 
    } 
}