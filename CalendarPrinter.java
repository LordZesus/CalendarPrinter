public class CalendarPrinter{
    public static void main(String[]args){
        int x;
        String n="";
        for(x=1;x<31;x++){
            if (x==5 || x==6 || x==12 || x==13 || x==19 || x==20 || x==26 || x==27){
                n = " - WEEKEND";
            };
            if (x==7){
                n = (" - NO SCHOOL (LABOR DAY)");
            };
            if (x==25){ 
                n = (" - END OF MARKING PERIOD");
            };
            System.out.println("September " + x + n);
            n="";
        }
    }
}