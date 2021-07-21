package algorithms.backtracking;

public class BlockedMaze {
    public static void main(String[] args) {
        int[][] maze = {{0,1,0,0}, {0,0,0,0}, {0,1,0,0}, {0,0,1,0}};
        blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);
    }

    public static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visited) {
        // positive base-case
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        //negative base-case
        if(row == -1 || row == maze.length || col == -1 || col == maze[0].length || maze[row][col] == 1 || visited[row][col]) {
            return;
        }

        //put a mark
        visited[row][col] = true;

        // top
        blockedMaze(maze, row - 1, col, ans+"T", visited);
        // down
        blockedMaze(maze, row + 1, col , ans + "D" , visited);
        // left
        blockedMaze(maze, row, col - 1, ans+"L", visited);
        // right
        blockedMaze(maze, row, col + 1, ans+"R", visited);

        //undo mark (backtracking)
        visited[row][col] = false;
    }
}
