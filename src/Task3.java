import java.util.LinkedList;
import java.util.Stack;

public class Task3 {
    public static void task(String str){
        Stack<String> stack = new Stack<>();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        boolean flag = true;
        int kv = 0;
        Stack<Integer> kvPriority = new Stack<>();
//        int kvPriority = 0;
        int fig = 0;
        Stack<Integer> figPriority = new Stack<>();

//        int figPriority = 0;
        int kr = 0;
        Stack<Integer> krPriority = new Stack<>();

//        int krPriority = 0;
        for (int i = 0; !stack.isEmpty(); i++) {
            switch (stack.getLast()) {
                case "]": {
                    kv++;
                    kvPriority.addLast(i);
                    break;
                }
                case "[": {
                    if(!figPriority.isEmpty())
                    if(kvPriority.getLast() < figPriority.getLast() ){
                        flag = false;
                        break;
                    }
                    if(!krPriority.isEmpty())
                        if ( kvPriority.getLast() < krPriority.getLast()) {
                        flag = false;
                        break;
                    }
                    kv--;
                    kvPriority.removeLast();
                    break;
                }
                case ")": {
                    kr++;
                    krPriority.addLast(i);
                    break;
                }
                case "(": {
                    if(!figPriority.isEmpty())
                    if(krPriority.getLast() < figPriority.getLast()){
                        flag = false;
                        break;
                    }

                        if(!kvPriority.isEmpty())
                        if (krPriority.getLast() < kvPriority.getLast()) {
                        flag = false;
                        break;
                    }
                    kr--;
                    krPriority.removeLast();
                    break;
                }
                case "}": {
                    fig++;
                    figPriority.addLast(i);
                    break;
                }
                case "{": {
                    if(!krPriority.isEmpty())
                    if(figPriority.getLast() < krPriority.getLast())
                    {
                        flag = false;
                        break;
                    }
                    if(!kvPriority.isEmpty())
                        if (figPriority.getLast() < kvPriority.getLast()) {
                        flag = false;
                    }
                    fig--;
                    figPriority.removeLast();
                    break;
                }
            }
            if(!flag){
                break;
            }
            stack.removeLast();
        }
        if(!flag || kv != 0 || kr != 0 || fig != 0){
            System.out.println("не сбалансированна");
        }
        else{
            System.out.println("сбалансированна");
        }

    }
}
