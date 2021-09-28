public class MainTask2 {   //Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) {
        for (int i = 0; i<args.length; i++){
            System.out.println(args[args.length - i]);
        }
    }
}
