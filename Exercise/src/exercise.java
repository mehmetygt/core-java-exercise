
public class exercise {
    private int purpee_number;
    private int squat_number;
    private int situp_number;
    private int pushup_number;      

    public exercise(int purpee_number, int squat_number, int situp_number, int pushup_number) {
        this.purpee_number = purpee_number;
        this.squat_number = squat_number;
        this.situp_number = situp_number;
        this.pushup_number = pushup_number;
    }

    /**
     * @return the purpee_number
     */
    public int getPurpee_number() {
        return purpee_number;
    }

    /**
     * @param purpee_number the purpee_number to set
     */
    public void setPurpee_number(int purpee_number) {
        this.purpee_number = purpee_number;
    }

    /**
     * @return the squat_number
     */
    public int getSquat_number() {
        return squat_number;
    }

    /**
     * @param squat_number the squat_number to set
     */
    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }

    /**
     * @return the situp_number
     */
    public int getSitup_number() {
        return situp_number;
    }

    /**
     * @param situp_number the situp_number to set
     */
    public void setSitup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    /**
     * @return the pushup_number
     */
    public int getPushup_number() {
        return pushup_number;
    }

    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }
    
    public void make_move(String type_movement,int move_number){
        if (type_movement.equals("purpee")) {
            make_purpee(move_number);
            
        }
        else if (type_movement.equals(pushup_number)) {
            make_pushup(move_number);
            
        } else if (type_movement.equals(squat_number)) {
            make_squat(move_number);
    
    
    } else if (type_movement.equals(situp_number)) {
            make_situp(move_number);
      }
    else{System.out.println("Invalid move.....");}
        }
     public void make_purpee(int move_number){
         if (purpee_number==0) {
             System.out.println("There's no purpee left to do."); 
         }
         if (purpee_number-move_number<=0) {
             System.out.println("You've exceeded your target number of purpees.");
             purpee_number=0;
             System.out.println("Number of remaining purpees : "+purpee_number);
             
         }else{
         purpee_number-=move_number;
             System.out.println("Number of remaining purpees : "+purpee_number);}
           }
     public void make_squat(int move_number){
         if (squat_number==0) {
             System.out.println("There's no squat left to do."); 
         }
         if (squat_number-move_number<=0) {
             System.out.println("You've exceeded your target number of squats.");
             squat_number=0;
             System.out.println("Number of remaining squats : "+squat_number);
             
         }else{
         squat_number-=move_number;
             System.out.println("Number of remaining squats : "+squat_number);}
           }   
        public void make_pushup(int move_number){
         if (pushup_number==0) {
             System.out.println("There's no pushup left to do."); 
         }
         if (pushup_number-move_number<=0) {
             System.out.println("You've exceeded your target number of pushups.");
             pushup_number=0;
             System.out.println("Number of remaining pushups : "+pushup_number);
             
         }else{
         pushup_number-=move_number;
             System.out.println("Number of remaining ppushups : "+pushup_number);}
          }   
        public void make_situp(int move_number){
         if (situp_number==0) {
             System.out.println("There's no situp left to do."); 
         }
         if (situp_number-move_number<=0) {
             System.out.println("You've exceeded your target number of situps.");
             situp_number=0;
             System.out.println("Number of remaining situps : "+situp_number);
             
         }else{
         situp_number-=move_number;
             System.out.println("Number of remaining situps : "+situp_number);}
           }
            public boolean is_exercise_over(){
                 return ((purpee_number==0) && (pushup_number==0) && (squat_number==0) && (situp_number==0));

}
}