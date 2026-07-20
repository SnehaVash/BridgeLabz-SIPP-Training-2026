package Strings;

public class equalOrNot {
    public static void main(String[] args) {
//        String str = "Sneha";
//        String str1 = new String("Sneha");
//
//        if(str.equals(str1)) {   // "==" compares string based on the memory address. Always Use ".equals()"
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }





//        String str = "Sneha";
//        String reversed = "";
//
//        for(int i = str.length()-1; i>=0; i--) {
//            reversed += str.charAt(i);
//        }
//        System.out.println(reversed);






//        String str = "I love coding";
//
//        String[] arr = str.split(" ");
//        String lastWord = arr[arr.length - 1];
//
//        String reversed = "";
//
//        for(int i = lastWord.length() - 1; i >= 0; i--) {
//            reversed += lastWord.charAt(i);
//        }
//
//        arr[arr.length-1] = reversed;
//        String result = String.join(" ", arr);
//
//        System.out.println(result);






//        String str = "I love love coding and studying";
//
//        String[] arr = str.split(" ");
//        int mid1 = arr.length/2-1;
//        int mid2 = arr.length/2;
//
//        String word1 = arr[mid1];
//        String reversed1 = "";
//
//        for(int i = arr[mid1].length()-1; i>=0; i--) {
//            reversed1 += word1.charAt(i);
//        }
//
//        String word2 = arr[mid2];
//        String reversed2 = "";
//
//        for(int i = arr[mid2].length()-1; i>=0; i--) {
//            reversed2 += word2.charAt(i);
//        }
//
//        arr[mid1] = reversed1;
//        arr[mid2] = reversed2;
//
//        String result = String.join(" ", arr);
//
//        System.out.println(result);






        String str = "I love coding";


        char[] ch = str.toCharArray();

        int count = 0;
        int freq = 0;

        for(int i = 0; i<=ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
