package StringOperations;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="India Is My Country";  
		int count=0;  
	     
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        System.out.println(count + " words.");  
        
	}

}

 
  