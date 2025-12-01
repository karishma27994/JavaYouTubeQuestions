package questions.programs;

public class StringBuilderImplementation {
    public static void main(String[] args) {
        //Declaration and Print
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        //Get character from index and print
        System.out.println(sb.charAt(1));
        //Set character at index and print
        sb.setCharAt(0,'M');
        System.out.println(sb);
        //Insert character at some index
        System.out.println(sb.insert(4,'s'));
        System.out.println(sb.insert(2,'a'));
        //Delete some char and print
        System.out.println(sb.delete(1,2));
        System.out.println(sb.deleteCharAt(4));
        //Append char and print
        System.out.println(sb.append(4));
        System.out.println(sb.append("test"));
        //Length of StringBuilder
        System.out.println(sb.length());

    }
}
