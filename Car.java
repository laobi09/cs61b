/**
 * 代表汽车的类，封装了汽车的基本属性和行为
 * @author 开发者
 * @version 1.0
 */
public class Car {
        // 汽车型号
        String model;
        // 车轮数量
        int wheels;

        /**
         * 创建汽车对象的构造方法
         * 默认初始化4个车轮
         * @param m 汽车型号
         */
        public Car(String m) {
                this.model = m;
                this.wheels = 4; // 默认4个轮子
        }

        /**
         * 汽车驾驶方法
         * 检查车轮数量是否满足行驶条件
         * @return void
         */
        public void drive(){
                if (this.wheels < 4){
                        System.out.println(this.model + "no go vroom"); // 轮子不足4个时无法行驶
                        return;
                }
                System.out.println(this.model + "go vroom"); // 正常行驶
        }

        /**
         * 获取当前汽车的车轮数量
         * @return 车轮数量
         */
        public int getNumwheels(){
                return wheels;
        }

        /**
         * 模拟汽车发生事故损失车轮
         * @param wheelslost 损失的车轮数量
         */
        public void driveIntoDitch(int wheelslost){
                this.wheels = this.wheels - wheelslost;
        }

        /**
         * 程序主入口，演示汽车类的基本功能
         * @param args 命令行参数
         */
        public static void main(String[] args){
                // 创建两个汽车实例
                Car c1;
                Car c2;
                c1 = new Car("Civic"); // 创建本田思域
                c2 = new Car("NOmac"); // 创建NOmac
                c1.drive(); // 测试c1的驾驶
                c2.driveIntoDitch(2); // 使c2损失2个轮子
                System.out.println(c2.getNumwheels()); // 打印c2剩余的轮子数量
        }
}
