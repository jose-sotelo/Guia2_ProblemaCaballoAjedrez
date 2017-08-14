import java.util.*;
/**
 * Programa para averiguar emovimientos del caballo.
 * 
 * @author (Leonardo Sotelo) 
 * @version (Agosto 13 de 2017)
 */
class Caballo
{
	public static void main(String[] args) {
	    
	    Scanner stdin = new Scanner (System.in);  
    	    int t = stdin.nextInt();

	    for(int i=0; i<t; i++)	{	
	    
	    	HashMap<String, Integer> anterior = new HashMap<>();
			Queue<String> siguiente = new LinkedList<>();

	    	int x1 = stdin.nextInt();	
	    	int y1 = stdin.nextInt();
	    	int x2 = stdin.nextInt();	
	    	int y2 = stdin.nextInt();
	    	
			anterior.put(""+x1+y1, 0);
			siguiente.add(""+x1+y1);
			boolean flag = true;

			while (siguiente.size() > 0 && flag){
				String actual = siguiente.remove();
				int aux= Integer.parseInt(actual);
			    int r = aux/10;
			    int c = aux%10;
			    String aux2;

			    if(r+1<=7 && c+2<=7){
			    	aux2 = String.valueOf(r+1) + String.valueOf(c+2);
			    	if(!anterior.containsKey(aux2)){
			    		siguiente.add(aux2);
			    		anterior.put(aux2,anterior.get(actual)+1);
			    	}
			    }
			    if(r+1<=7 && c-2>=0){
			    	aux2 = String.valueOf(r+1) + String.valueOf(c-2);
			    	if(!anterior.containsKey(aux2)){
			    		siguiente.add(aux2);
			    		anterior.put(aux2,anterior.get(actual)+1);			    		
			    	}
			    }
			    if(r-1>=0 && c+2<=7){
			    	aux2 = String.valueOf(r-1) + String.valueOf(c+2);
			    	if(!anterior.containsKey(aux2)){
			    		siguiente.add(aux2);
			    		anterior.put(aux2,anterior.get(actual)+1);			    		
			    	}
			    }
			    if(r-1>=0 && c-2>=0){
			    	aux2 = String.valueOf(r-1) + String.valueOf(c-2);
			    	if(!anterior.containsKey(aux2)){
			    		siguiente.add(aux2);
			    		anterior.put(aux2,anterior.get(actual)+1);			    		
			    	}
			    }
			    if(r+2<=7 && c+1<=7){
			    	aux2 = String.valueOf(r+2) + String.valueOf(c+1);
			    	if(!anterior.containsKey(aux2)){
			    		siguiente.add(aux2);
			    		anterior.put(aux2,anterior.get(actual)+1);			    		
			    	}
			    }
			    if(r+2<=7 && c-1>=0){
			    	aux2 = String.valueOf(r+2) + String.valueOf(c-1);
			    	if(!anterior.containsKey(aux2)){
			    		anterior.put(aux2,anterior.get(actual)+1);
			    		siguiente.add(aux2);
			    	}
			    }
			    if(r-2>=0 && c+1<=7){
			    	aux2 = String.valueOf(r-2) + String.valueOf(c+1);
			    	if(!anterior.containsKey(aux2)){
			    		siguiente.add(aux2);
			    		anterior.put(aux2,anterior.get(actual)+1);
			    	}
			    }
			    if(r-2>=0 && c-1>=0){
			    	aux2 = String.valueOf(r-2) + String.valueOf(c-1);
			    	if(!anterior.containsKey(aux2)){
			    		siguiente.add(aux2);
			    		anterior.put(aux2,anterior.get(actual)+1);
			    	}
			    }
			    if(r==x2 && c==y2){
					System.out.println(anterior.get(actual));
					flag=false;
				}
			}
    	}
  	}
}