
public class Doglauncher {
    /**
     * Created by wubiyu.
     */
    public static void main(String[] args) {
        // 创建狗狗数组
        Dog[] dogs = {
            new Dog(10),
            new Dog(15),
            new Dog(20),
            new Dog(15),
            new Dog(10),
            new Dog(5),
            new Dog(15),
            new Dog(15),
            new Dog(22),
            new Dog(20)
        };

        // 找出比四个相邻狗狗都重的狗狗
        Dog[] returnDogs = Dog.largerThanFourNeighbors(dogs);

        // 打印符合条件的狗狗的体重
        for (Dog d : returnDogs) {
            if (d != null) {
                 System.out.print(d.weightInPounds + " ");
            }
        }
        System.out.println();
    }
} 


