package lk.intel.service_record;
import java.lang.StringBuffer;

public class ServiceRecord {
    private StringBuffer previousRanks;
    private String currentRank;
    private int yearsOfService;
    private int successfulMissionCount;
    
    public ServiceRecord(Striing pr, String cr, int yrs, int mcount){
        this.previousRanks = new StringBuffer(pr);
        this.currentRank = cr;
        this.yearsOfService = yrs;
        this.successfulMissionCount = mcount;
    }
    
    public void setPreviousRanks(String pr){
        this.previousRanks.append(pr);
    }
    
    public StringBuffer getPreviousRanks(){
        return previousRanks;
    }
    
    public void setCurrentRank(String cr){
        this.currentRank=cr;
    }
    
    public String getCurrentRank(){
        return currentRank;
    } 
    
    public void setYearsOfService(int yr){
        this.yearsOfService = yr;
    }
    
    public int getYearsOfService(){
        return yearsOfService;
    }
    
    public void setSuccessfulMissionCount(int c){
        this.successfulMissionCount = c;
    }
    
    public int getSuccessfulMissionCount(){
        return successfulMissionCount;
    }
    
    public void incrementSuccessfulMissionCount(){
        successfulMissionCount++;
    }
    
    public void incrementYearsOfService(){
        yearsOfService++;
    }
    
}