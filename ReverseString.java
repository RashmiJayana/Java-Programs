public class ReverseString {
    public static void main(String[] args) {
        String name  ="Rashmi";
        char ch;
        String nstr = " ";
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            nstr=ch+nstr;
        }
        
        System.out.println(nstr);
    }
}
