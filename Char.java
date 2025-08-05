class Display {
void show(int num){
System.out.println("Integer:" +num);
}
void show(String text){
System.out.println("String:" +text);
}
}
public class Char{
public static void main(String[] args){
Display display = new Display();
display.show(25);
display.show("Hello, Java");
}
}