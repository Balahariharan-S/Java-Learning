public class Search {
    public static void main(String[] args) {
        String[] fruits = {"apple","banana","pineapple","papaya","kiwi"};
        String target = "pineapple";
        boolean isFound = false;
        for(int i=0;i<fruits.length;i++){
            if (fruits[i].equals(target)){
                System.out.println("Element found at index "+i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array!");
        }
    }
}
