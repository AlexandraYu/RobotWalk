public class RobotWalk{

    public static boolean judgeCircle(String moves) {
        int length = moves.length();
        //use an array for coordination
        //array[0] for left or right 
        //array[1] for up or down
        //starting from {0,0} so we're seeing if at the end of the movemnet, the robot comes back to {0,0}
        int [] array ={0,0};
        for (int i=0; i<length; i++) {
            char symbol = moves.charAt(i);
			//input can only be D(own), U(p), L(eft), R(ight)
            switch (symbol) {
                case 'D':
                    array[1]--;
                    break;
                case 'U':
                    array[1]++;
                    break; 
                case 'L':
                    array[0]--;
                    break; 
                case 'R': 
                    array[0]++;
                    break;
            }
        }
        if((array[0] | array[1]) ==0) return true;
        else return false; 
    }
    public static void main(String []args){
        boolean answer; 
        answer = judgeCircle("UDLR"); 
        System.out.println(answer);
    }
}