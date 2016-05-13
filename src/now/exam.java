package now;

import java.util.regex.Pattern;
public class exam
{


/*
static public String solve(String[]X)
	{
	String d=X[0];
	for(int i=1;i<X.length;i++)
	{
		d+=X[i];
	}
	
	  String [] newstring=new String[X.length];
	  String pop="";
	  String res="";
	  int i;
	  int M=0;
	 int u=0;
	  int j;
	 for(i=0;i<X.length;i++)
	  {
		  try{

			   {
					
			
		  if(X[i]=="(")
            {    X[i]="";
			 //X[j]="+";

			   for( j=i+1;X[j]!=")";j++)
			   {
					
				  // System.out.println("error"+X[i]);
		            X[i]+=X[j];
			}
			   res=exam.Dooperation(X[i]);
            	 newstring[M]=res; 
           
            	  M++;
            	 i=j;
            	  
            }
		 
              else
              {	  
              newstring[M]=X[i];
              M++;
              }
		  }}
		  catch(ArrayIndexOutOfBoundsException re)
		  {
			//  X=null;
		  }
		  
		  catch(NumberFormatException re)
		  {
		  } 
		  
		    
	  }
	   for(int ii=0;ii<newstring.length;ii++)
     	{
     		if(newstring[ii]!=null)
     		{
     		
     			pop+=newstring[ii];
     		//	System.out.println(pop);
     		}
     	}
     	
	 String ec=  exam.brackets(d);
	 System.out.println(ec);
	   String Final="";
	   String []check=exam.divide(pop);//here is return null why i can't know 

	   //String []check= new String [check2.length];//solving of  null problem
	   pop="";
	  /* for(int jj=0;jj<check.length;jj++)
	   {
		   
			if(check2[jj]!=null)
     		{
     		
				check[jj]=check2[jj];
     		}
	   
	   }*/
	/*
	  int x=0;//solving of (10+10)-10

	  for(int iii=0;iii<check.length;iii++)
	   {        
		  
		try{
			 if(
					 // null problem and solving another null
					 check[iii]==null){
				    break;
			   }
			 
		 if(x==0){
			  
		   if(iii+1==check.length){
			   Final+=check[iii];
			   break;
		   }
		  
	try {
		   if(check[iii]==")")
		   {
			   check[iii]=check[iii+1].substring(1,check[iii+1].length()-1);

		   }
		   
	}
	catch(IndexOutOfBoundsException e)
	{
		continue;
	}
		   if(check[iii]==")"&check[iii+1].startsWith("+"))
		   { 

			   
			   check[iii]="+"+check[iii+1].substring(1,check[iii+1].length());
			  
			   Final+=check[iii];

x=1;

			   
		   }
		   if(check[iii]==")"&check[iii+1].startsWith("-"))
		   { 

			   
			   check[iii]="-"+check[iii+1].substring(1,check[iii+1].length());
			  
			   Final+=check[iii];

x=1;

			   
		   }
		   
		   if(check[iii]=="-"&check[iii+1].startsWith("-"))
		   { 
			   
			   check[iii]="+"+check[iii+1].substring(1,check[iii+1].length());
			   
			   Final+=check[iii];

x=1;
			  
			   
		   }
		   else if(check[iii]=="+"&check[iii+1].startsWith("-"))
		   {
			   
			   check[iii]="-"+check[iii+1].substring(1,check[iii+1].length());
			   
			   Final+=check[iii];
			 
x=1;
			   
		   }
		   else
		   {
			   Final+=check[iii];
			  

		   }
		  }
		 }
	   
catch (NullPointerException e) {
	continue;
}	   
	   
   
	  
	}
	
	  String XX=exam.Dooperation(Final);
return XX;

	}*/
static public String Sqr(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
	for( i=0;i<X.length;i++)
	{   
		
		if(X[i].startsWith("S"))
		{   
			String XXX=X[i].substring(1, X[i].length());
			
			
			double 	result;
			double a=Double.parseDouble(XXX);
			result=Math.sqrt(a);
			newstring[M]=Double.toString(result);
	         M++;
			
				
		}
			
		else
		{  
		
			newstring[M]=X[i];
			M++;
			 
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
     return pop;
		
}

		
	static public String ostwo(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
	for( i=0;i<X.length;i++)
	{   
		
		if(X[i].endsWith("^"))
		{   
			String [] XX=X[i].split(Pattern.quote("^"));
			double 	result;
			double a=Double.parseDouble(XX[0]);
			result=a*a;
			 if(X[i].startsWith("+"))
   			  newstring[M]="+"+Double.toString(result);
			 else if(X[i].startsWith("-"))
					 newstring[M]="+"+Double.toString(result);
					 
   		  else
   	     newstring[M]=Double.toString(result);
				
				
			
			M++;
			
		}
			
		else
		{  
		
			newstring[M]=X[i];
			M++;
			 
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
     return pop;
		
}
   static public  String[]  divide(String m)
	{  
	   int ii=0;
	
	  // int x=1;
	 char []operations=new char[m.length()];
	  String [] nums=new String[100];
	  boolean mm=false;
	  boolean mn =false;
	   for(int i=0;i<m.length();i++)
	   {
		   
		   
		   
		   
		   operations[i]=m.charAt(i);
		   if (operations[i]=='+'&mm==true)
		   {
			   nums[ii]="-";
			   
			   mm=false;
			   
			   
		   }
		   else if (operations[i]=='-'&mm==true)
		   {
			   nums[ii]="+";
			   
			   mm=false;
			   
			   
		   }
		   else if (operations[i]=='+'&mn==true)
		   {
			   nums[ii]="+";
			   
			   mn=false;
			   
			   
		   }
		   else if (operations[i]=='-'&mn==true)
		   {
			   nums[ii]="-";
			   
			   mn=false;
			   
			   
		   }
		   else if(operations[i]=='/')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	   nums[ii]="/";
		           ii++;
		       
		      }
		   else if(operations[i]=='(')
		      {
			  if (nums[ii]!=null)
				  ii++;
				  nums[ii]="(";
		    	  ii++;
			 
		    	    mn=false;
		    	    mm=false;
		      }
			  else if(operations[i]==')')
		      {
			  if (nums[ii]!=null)
				  ii++;
				  nums[ii]=")";
				  ii++;
				  mn=false;
		    	    mm=false;
			
		      }
		   else if(operations[i]=='%')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	   nums[ii]="%";
		           ii++;
		        
		      }
		   else if(operations[i]=='S')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	   nums[ii]="S";
		        
		    
		      }
		
		   else if(operations[i]=='*')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	  nums[ii]="*";
		    	  ii++;
			   
		      }
		  else if(operations[i]=='+')
		      {
			  if (nums[ii]!=null)
				  ii++;
				  nums[ii]="+";
			  mn=true; 	
			  
			    
		      }
		 
		  else if(operations[i]=='-')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	  nums[ii]="-";
		    	 
		    	mm=true; 
		    	
		    	
		      }
		   
		      
	    
			
		  else
		  {
			     if(nums[ii]==null)
				     nums[ii]="";
			  nums[ii]+=m.charAt(i);
			  mm=false;
			  mn =false;
			 
		  }
		   
		   
	   }
	  
	   
	   
	   String [] newone=new String[ii+1];
	   for(int iii=0;iii<ii+1;iii++)
	   {   if(nums[iii]!=null)
		   newone[iii]=nums[iii];
	   }
	   return newone;
	
	
	}
static public String div(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
newstring[M]=X[0];

	for( i=1;i<X.length;i++)
	{   
		
		if(X[i]=="/")
		{
			double a=Double.parseDouble(X[i-1]);
			double b=Double.parseDouble(X[i+1]);
		
			if(X[i-1].startsWith("+"))
	  			  newstring[M]="+"+Double.toString(a/b);
			else if(X[i+1].startsWith("-")&X[i-1].startsWith("-"))
	  			  newstring[M]="+"+Double.toString(a/b); 
			
			else
	  	     newstring[M]=Double.toString(a/b);
		     
			 
		         
			 X[i+1]=Double.toString(a/b);
		 
		 i++;
			
			
		}
			
		else
		{ 
			
			   
			if(X[i]!="/"||X[i+1]!="/") 
				M++;
			newstring[M]=X[i];
			
			
			
			
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
	
	
     return pop;
		
}
static public String mod(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
newstring[M]=X[0];

	for( i=1;i<X.length;i++)
	{   
		
		if(X[i]=="%")
		{
			double a=Double.parseDouble(X[i-1]);
			double b=Double.parseDouble(X[i+1]);
		
			
  		  if(X[i-1].startsWith("+"))
  			  newstring[M]="+"+Double.toString(a%b);
  		  else
  	     newstring[M]=Double.toString(a%b);
	     
		 
	         
		 X[i+1]=Double.toString(a%b);
		 
		 i++;
			
			
		}
			
		else
		{ 
			
			   
			if(X[i]!="%"||X[i+1]!="%") 
				M++;
			newstring[M]=X[i];
			
			
			
			
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
	
	
     return pop;
		
}
static public String solve2(String X){      
	  int result;
	 double result2;
    while(X.contains(Character.toString('('))||X.contains(Character.toString(')'))){
        for(int I=0; I<X.length();I++){
           try{                                                        //i there is not sign
                if((X.charAt(I)==')' || Character.isDigit(X.charAt(I))) //between separate brackets
                        && X.charAt(I+1)=='('){                         //or number and bracket,
                   X=X.substring(0,I+1)+"*"+(X.substring(I+1));        //it treat it as
                }                                                       //a multiplication
           }
           catch(StringIndexOutOfBoundsException e){}//ignore out of range ex
            if(X.charAt(I)==')'){                                  //search for a closing bracket
                for(int i=I; i>=0;i--){
                    if(X.charAt(i)=='('){                          //search for a opening bracket
                        String newexp = X.substring(i+1,I);
                        newexp = exam.Dooperation(newexp);
                        X=X.substring(0,i)+newexp+X.substring(I+1);
                        i=I=0;
                    }
                }
            }
        }
        if(X.contains(Character.toString('('))||X.contains(Character.toString(')'))||
                X.contains(Character.toString('('))||X.contains(Character.toString(')'))){
            return "Error: incorrect brackets";
        }
    }
    
    try{
    	 X=exam.Dooperation(X);
    		   result2 = Double.parseDouble(X);
    		   result = (int) result2;
    	if(result==result2)
    	{
    		X = Integer.toString(result);	
    	}
    		  
    		
    		}
    		  catch (NumberFormatException e) {
    			// TODO: handle exception
    	X="Erorr Expression ";
    		}
    catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
X="Erorr Expression ";
	}
    		

    		  


  // X=exam.Dooperation(X);
    return X;
}
static public String Dooperation(String X)
{  String XXXX=ostwo(divide(X));
   String XXX=Sqr(divide(XXXX));
	String XX=mod(divide(XXX));
  	String C1=div(divide(XX));
  	String C=mul(divide(C1));
  	String CCC=sumandsub(divide(C));
	
	return CCC;


}
    static public String mul(String [] X)
    {       String [] newstring=new String[X.length];
    String pop="";
    int i;
    int M=0;
    newstring[M]=X[0];
    	for( i=1;i<X.length;i++)
    	{   
    		
    		if(X[i]=="*")
    		{   
    			
    				
    				
    				
    			double a=Double.parseDouble(X[i-1]);
    			double b=Double.parseDouble(X[i+1]);
    			
    		  if(X[i-1].startsWith("+"))
    			  newstring[M]="+"+Double.toString(a*b);
    			else if(X[i+1].startsWith("-")&X[i-1].startsWith("-"))
  	  			  newstring[M]="+"+Double.toString(a*b); 
    		  else
    	     newstring[M]=Double.toString(a*b);
    		 
    	         
    		 X[i+1]= Double.toString(a*b);
    		 
    		 i++;
    			
    			
    		}
    			
    		else
    		{  
    		
      		  
    			if(X[i]!="*"||X[i+1]!="*")
 			     M++;
    			newstring[M]=X[i];
    			 
    		}
    		
    	}
    	for(int ii=0;ii<newstring.length;ii++)
    	{
    		if(newstring[ii]!=null)
    		  pop+=newstring[ii];
    		
    		
    	}
    	
         return pop;
    		
    }
   
    

  
 
 
