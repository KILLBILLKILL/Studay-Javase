public class Car {
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private  int age;
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    private  String shape;
    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    private  String pattern;
    public int getHigh() {
        return high;
    }
    public void setHigh(int high) {
        this.high = high;
    }
    private int high;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    private int number;

    public Car() {
    }
    public Car(int number) {
        this.number = number;
    }
    static void run(){
        System.out.println("汽车正在跑");
    }
    static void fuelUp()
    {
        System.out.println("汽车在加油");
    }
    static void wash()
    {
        System.out.println("正在洗车");
    }
    static void repair()
    {
        System.out.println("正在修车");
    }
     void display()
    {

        System.out.println(this.age);
        System.out.println(this.high);
        System.out.println(this.number);
        System.out.println(this.pattern);
        System.out.println(this.shape);

    }
    public static void main(String[] args) {

    }
}
