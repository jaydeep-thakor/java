class Conditionals{
    public static void main(String args[]){

        int x = 50;
        int y = 25;
        int z = 75;

        // if you have more than one statement for if or else put it in bracket like if(){}
        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else{
            System.out.println(z);
        }

        // ternary operator
        int a = 4;
        int result = 0;
        // if(a%2==0){
        //     result = 10;
        // }else{
        //     result = 20;   
        // }
        result = a%2==0 ? 10 : 20;
        System.out.println("result "+ result);

        // switch case
        int day = 2;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3:                 
                System.out.println("Wednesday");
                break;
            case 4:                 
                System.out.println("Thursday");
                break;
            case 5:                 
                System.out.println("Friday");
                break;
            case 6:                 
                System.out.println("Saturday");
                break;
            case 7:                 
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter a valid number");
        }
        

    }
}