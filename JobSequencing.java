package jobsequencing;

/**
 *
 * @author Dontae
 */
public class JobSequencing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jobs[] array = new Jobs[5];
        array[0] = new Jobs(10,1);
        array[1] = new Jobs(15,2);
        array[2] = new Jobs(20,2);
        array[3] = new Jobs(5,3);
        array[4] = new Jobs(1,3);
        
        array = bubbleSort(array);
        
        for(int i = 4; i >=0; i--){
            System.out.println(array[i].getProfit() + " " + array[i].getDeadline());
        }
        
        int totalProfit = 0;
        int runningTime = 0;
        for(int i = 4; i >=0; i--){
            if(array[i].getDeadline() > runningTime){
                System.out.println(array[i].getProfit() + " was taken");
                totalProfit = totalProfit + array[i].getProfit();
                runningTime = runningTime + 1;
            }
            else {
                System.out.println("We cannot take this job as " +  array[i].getDeadline() + " deadline has already passed");
            }
        }
        System.out.println("Total Profit: " + totalProfit);
        
        
        
    }
    
    public static Jobs[] bubbleSort(Jobs a[]) 
    { 
        int n = a.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (a[j].getProfit() > a[j+1].getProfit()) 
                { 
                    // swap arr[j+1] and arr[j] 
                    Jobs temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp; 
                } 
        
        return a;
    } 
    
    
    
    
}
