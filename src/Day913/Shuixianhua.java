package Day913;




    /*
     * 打印三角形
     */
    public class Shuixianhua{

        public static void main(String[] args) {
            printStar(6);
            reversePrintStar(6);
        }

        // 打印正三角形
        static void printStar(int line) {
            // 行数
            for (int row = 0; row <= line; row++) {
                // 设置每行缩进
                for (int i = 1; i <= line - row; i++) {
                    System.out.print("\t");
                }
                // 列数
                for (int col = 1; col <= row; col++) {
                    System.out.print("*" + "\t\t");
                }
                System.out.println();
            }

        }

        //打印倒三角形
        static void reversePrintStar(int line) {

            //设置行数
            for(int row = 0; row<= line ; row++) {
                //设置缩进
                for (int i = 0; i <=row -1; i++) {
                    System.out.print("\t");
                }
                for(int col = line; col>row;col--) {
                    System.out.print("*"+"\t\t");
                }

                System.out.println();

            }
        }
    }
