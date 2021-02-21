public class Main{
  
   public void validateRegNo(String regNo) {
   	if(regNo.length()==8 && (regNo.charAt(0)=='S' || regNo.charAt(0)=='s') && (regNo.charAt(1)=='/') && (regNo.charAt(4)=='/') && Character.isDigit(regNo.charAt(2)) && Character.isDigit(regNo.charAt(3)) && Character.isDigit(regNo.charAt(5)) && Character.isDigit(regNo.charAt(6)) && Character.isDigit(regNo.charAt(7))){
   		System.out.println("Valid RegNo");
   	}
   	else {
   		System.out.println("Invalid RegNo");
   	}
   }
    
    public static void main(String[] args)
    {
      
        final String accessLevel= AccessLevel.FULL_ACCESS.symbol;
        AccessLevel.checkAccess(accessLevel);
        //AccessLevel.checkAccess(s);
        Personnel p1 = new Personnel();
        
        if (p1.validateLogin())
            System.out.println("Success");
        else
            System.out.println("Failed");
        
        
    }
    
}
