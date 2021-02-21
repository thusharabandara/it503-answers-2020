public enum AccessLevel{
  FULL_ACCESS("***"),
  LIMITED_ACCESS("**"),
  RESTRICTED_ACCESS("*");
  
  public final String symbol;
  
  private AccessLevel(String symbol){
    this.symbol=symbol;
  }
  
  private String symbol(){
    return symbol;
  }
  
  
  public static boolean checkAccess(String symbol){
    
    if(symbol.equals("***")){
      return true;
    }else if(symbol.equals("**")){
      return true;
    }else if(symbol.equals("*")){
      return true;
    }else{
      return false;
    }
 }
 
  
}