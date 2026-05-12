public class WeatherDataTracker_DACPANO {
    public static void main(String[] args) {

        double[][] temp = {
            {17, 45.7, 25, 31.5, 18, 20, 41}, 
            {10, 37, 23, 12, 40.5, 24, 15.5},  
            {14, 16, 22.6, 39, 48.5, 17, 35},    
        };
 
        for (int i = 0; i < temp.length; i++) {
            double sum = 0;             
            double highest = temp[i][0]; 
            int count = temp[i].length; 
   
            for (int j = 0; j < count; j++) {
                sum += temp[i][j];
    
                if (temp[i][j] > highest) {
                    highest = temp[i][j];
                }
            }

            double average = sum / count;

            System.out.println("\nCity " + (i + 1) + ":");
            System.out.printf("   Average Temperature: %.2f°C", average);
            System.out.printf("\n   Highest Temperature: %.2f°C", highest);
            
        }
    }
}