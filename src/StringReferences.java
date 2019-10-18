public class StringReferences
{
    public static void main(String[] args)
    {
        String word = "Hello";
        String sentence = null;
        String str = "Hello";
        System.out.println(word==sentence);
        System.out.println(sentence==null);
        System.out.println(word==str);
        System.out.println(word!=null);
    }
}
