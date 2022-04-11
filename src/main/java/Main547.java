/*
 * 理解提议最重要（输入和输出要明确），输出是省的数量，比如相连的城市是一个省的也就是为1的，不相连的是单独的一个省也就是为0
 *{1,1,0},{1,1,0},{0,0,1}这种的说明有三个城市，a,b,c,ab是相连的所以是一个省的，c不相连所以单独一个省，所以最后一共是两个省
 *深度优先（根节点一直遍历到叶子节点然后进行回溯）
 * */
public class Main547 {
    public static void main(String[] args) {
        System.out.println(findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }

    public static int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
//      做一个标记（默认是false，被访问过了才会成为true）
        boolean[] bool = new boolean[cities];
//        计数器
        int provides = 0;
        for (int i = 0; i < cities; i++) {
//            标记为true说明遇到了同一个省份的，往下一个元素递归
            if (!bool[i]) {
                df(i, cities, bool, isConnected);
                provides++;
            }
        }
        return provides;
    }

    private static void df(int i, int cities, boolean[] bool, int[][] isConnected) {
        for (int j = 0; j < cities; j++) {
              if(isConnected[i][j]==1&&!bool[j]){
                  bool[j]=true;
                  df(j,cities,bool,isConnected);
              }
        }
    }
}
