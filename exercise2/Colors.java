import java.util.ArrayList;
import java.util.Arrays;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.)
        // return an array of strings that start with a color.  discard all the other strings.  If no strings start with
        // a color in the input array, return an empty array.
        ArrayList<String> colors = new ArrayList<String>();
        colors.addAll(Arrays.asList(strings));
        boolean hue = false;
        String[] checkColor = {"red","blue","black","green","yellow","pink"};
        for(int i=0;i<colors.size();i++){
            System.out.println("Checking "+colors.get(i));
            for(int j=0;j<checkColor.length;j++){
                if(colors.get(i).contains(checkColor[j])){
                    System.out.println("Found "+checkColor[j]);
                    hue = true;
                    j=checkColor.length;
                }
            }
            if(!hue){
                colors.remove(i);
                i--;
            }
            hue = false;
        }
        String[] checked = new String[colors.size()];
        checked = colors.toArray(checked);
        System.out.println("#########################");
        System.out.println("New List");
        System.out.println("#########################");
        for(int i = 0;i<checked.length;i++){
            System.out.println(checked[i]);
        }
        return checked;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }


}