package jobsequencing;

/**
 *
 * @author Dontae
 */
public class Jobs {
    int profit;
    int deadline;
    
    public Jobs(int profit, int deadline){
        
        this.profit = profit;
        this.deadline = deadline;
    }
    
    public int getProfit(){
        return profit;
    }
    public int getDeadline(){
        return deadline;
    }
    
    
}
