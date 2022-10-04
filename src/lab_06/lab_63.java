package lab_06;

//String myStr = "100 minutes";
//        NOT using REGEX, extract digit character from that String
//        Expected output: "100".
//        EX: "12345nabc678" -> "12345678"
public class lab_63 {
    public static void main(String[] args) {
        String myStr = "100mins4534534";
        for(int i = 0; i < myStr.length(); i++){
            if(Character.isDigit(myStr.charAt(i))){
                System.out.print(myStr.charAt(i));
          }
//            int x = (int) myStr.charAt(i);
//            if(x >=48 && x <=57){
//                System.out.print(myStr.charAt(i));
//            }
        }

    }
}
