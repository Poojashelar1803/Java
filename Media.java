class Printer {
void print(int num, String text){
System.out.println("Number: " + num + ", Text: " + text);
}
void print (String text, int num){
System.out.println("Text: "+ text + ", Number: " +num);
}
}
public class Media {
public static void main(String[] args ){
Printer printer = new Printer();
printer.print(42,"Java");
printer.print("Overloading",101);
}
}