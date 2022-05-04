package toets1;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Elevator {
    private final String badge;
    private final int currentLevel;

    private final int[] levels = new int[] {-2,-1,0,1,2,3,4,5,6,7,8,9,10};

    public Elevator(String badge, int currentLevel) {
        this.badge = badge;
        this.currentLevel = currentLevel;
    }

    public boolean isRoomBadge(String badge){
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
            if (badge == null) {
                return false;
            }
            return pattern.matcher(badge).matches();
        }


    public Integer[] activeButtons() {
        ArrayList<Integer> activeButtons = new ArrayList<>();
            if(badge == null){
                return null;
            }
            else if(isRoomBadge(badge)){
                if(currentLevel != 0){
                    activeButtons.add(0);
                }
                if(currentLevel != Integer.parseInt(badge.substring(0,1))){
                    activeButtons.add(Integer.parseInt(badge.substring(0,1)));
                }
                if(currentLevel != 10){
                    activeButtons.add(10);
                }
            }
            else if(badge.equalsIgnoreCase("p")){
                for (int level : levels) {
                    if (level != currentLevel) {
                        activeButtons.add(level);
                    }
                }
            }
            Integer[] result = new Integer[activeButtons.size()];
            result = activeButtons.toArray(result);
            return result;
    }
}

//return new int[] {0, Integer.parseInt(badge.substring(0,1)), 10};