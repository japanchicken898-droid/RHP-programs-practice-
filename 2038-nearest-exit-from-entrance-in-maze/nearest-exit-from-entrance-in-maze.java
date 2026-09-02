import java.util.*;

class Solution {
    // Direction array representing [right, down, left, up] using adjacent pairs
    final int d[] = {0, 1, 0, -1, 0};

    public int nearestExit(char[][] maze, int[] entrance) {
        int R = maze.length;
        int C = maze[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{entrance[0], entrance[1]});
        
        int steps = -1;
        maze[entrance[0]][entrance[1]] = '+'; 
        
        while (!q.isEmpty()) {
            steps++;
            int qsize = q.size();
            
            while (qsize-- > 0) {
                int cell[] = q.poll();
                int row = cell[0], col = cell[1];
                
                if (row == 0 || row == R - 1 || col == 0 || col == C - 1) {
                    if (steps != 0) return steps;
                }
                
                for (int i = 0; i < 4; i++) {
                    int nr = row + d[i];
                    int nc = col + d[i + 1];
                    
                    if (nr >= 0 && nr < R && nc >= 0 && nc < C && maze[nr][nc] == '.') {
                        maze[nr][nc] = '+'; 
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }
        return -1;
    }
}
