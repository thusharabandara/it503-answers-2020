package lk.intel;
import lk.intel.service_record.ServiceRecord;
import lk.intel.agent.Agent;
import java.lang.String;
import java.lang.StringBuffer;

public class SecretService {
    public static void main(String[] args){
        Agent agent1 = new Agent("007", "James Bond", 191083);
        StringBuffer sb=new StringBuffer("Lieutenant Colonel");
        ServiceRecord serviceRecord= new ServiceRecord(sb, "Colonel", 20, 50);
        
        agent1.printServiceRecord();
        agent1.promote("Brigadier General");
	agent1.missionSuccess();
	agent1.addExperience();
    }
}