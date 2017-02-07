
package lsrhs.java;

// main class for Mini-Maze Project; all it currently does is create a maze
// object and print it out

public class MazeMain {

		public static void main(String args[]) {
			Maze maze = new Maze();
			maze.printMaze();
		}

		boolean containsCoords(MazeCoords xy, Maze maze) {
			for (int i = 0 ; i < maze.visitedData.size() ; i++) {
				if (maze.visitedData.get(i) == xy) {
					return true;
				}
			}
			return false;
		}

		boolean solveMaze(MazeCoords c, Maze maze) {
			if (maze.isEndSquare(c)) {
				return true;
			}
			if (containsCoords(c, maze)) {
				return false;
			}
			maze.visitedData.add(c);
			if (maze.isPassable(c)){
				solveMaze(c, maze);
			}

			return false;
		}

}
