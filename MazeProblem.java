import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // Path("", 3, 3);
        // System.out.println(PathList("", 4, 4));
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        //System.out.println(PathRestrictions("", maze, 0, 0));
        AllPath("", maze, 0, 0);
    }
    static int count(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }

        int right = count(r, c-1);
        int down = count(r-1, c);

        return right + down;
    }

    static ArrayList<String> PathList(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
            list.addAll(PathList(p + 'D', r-1, c));
        }
        if(c > 1) {
            list.addAll(PathList(p + 'R', r, c-1));
        }
        return list;
    }

    static ArrayList<String> PathListDiagonal(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
            list.addAll(PathListDiagonal(p + 'V', r-1, c));
        }
        if(c > 1) {
            list.addAll(PathListDiagonal(p + 'H', r, c-1));
        }
        if(r > 1 && c > 1) {
            list.addAll(PathListDiagonal(p + 'D', r-1, c-1));
        }
        return list;
    }


    static void Path(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r > 1) {
            Path(p + 'D', r-1, c);
        }
        if(c > 1) {
            Path(p + 'R', r, c-1);
        }
    }
    
    static ArrayList<String> PathRestrictions(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]) {
            return list;
        }
        if(r < maze.length-1) {
            list.addAll(PathRestrictions(p + 'D', maze, r+1, c));
        }
        if(c < maze[0].length-1) {
            list.addAll(PathRestrictions(p + 'R', maze, r, c+1));
        }
        return list;
    }

    static void AllPath(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        
        if(r < maze.length-1) {
            AllPath(p + 'D', maze, r+1, c);
        }
        if(c < maze[0].length-1) {
            AllPath(p + 'R', maze,  r, c+1);
        }
        if(r > 0) {
            AllPath(p + 'U', maze, r-1, c);
        }
        if(c > 0) {
            AllPath(p + 'L', maze, r, c-1);
        }
        maze[r][c] = true;
    }

    
}
