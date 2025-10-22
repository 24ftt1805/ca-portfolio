public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        String[]alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        for (int s = 0, b = 25; s < alphabet.length; s++, b--) {
            System.out.print(alphabet[s]+" "+alphabet[b]+" ");
        }
    }
}
