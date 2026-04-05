class Loops{
    public static void main(String args[]){
        // while loop
        int i = 1;
        while(i<=5){
            System.out.println("jaydeep "+i);
            
            int j = 1;
            while(j<=2){
                System.out.println("jd "+j);
                j++;
            }

            i++;
        }

        // do while
        int x = 10;
        do{
            System.out.println("even the condition is false it will run once");
            x++;
        }while(x<5);

        // for loop - calendar example
        int k = 1;
        for(; k<=7; ){
            System.out.println("Day "+k);
            for(int l = 1; l<=9; l++){
                System.out.println("     " +(l+8)+ " - " +(l+9));
            }
            k++;
        }

    }
}
